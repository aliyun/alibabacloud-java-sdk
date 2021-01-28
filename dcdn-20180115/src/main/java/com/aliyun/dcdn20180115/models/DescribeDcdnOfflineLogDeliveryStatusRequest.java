// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnOfflineLogDeliveryStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryStatusRequest self = new DescribeDcdnOfflineLogDeliveryStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

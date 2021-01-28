// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnOfflineLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryRequest self = new DescribeDcdnOfflineLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryRegionsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnOfflineLogDeliveryRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryRegionsRequest self = new DescribeDcdnOfflineLogDeliveryRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryRegionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

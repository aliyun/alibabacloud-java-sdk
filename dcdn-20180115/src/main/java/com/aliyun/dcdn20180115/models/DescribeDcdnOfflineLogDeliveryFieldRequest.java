// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryFieldRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnOfflineLogDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryFieldRequest self = new DescribeDcdnOfflineLogDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryFieldRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

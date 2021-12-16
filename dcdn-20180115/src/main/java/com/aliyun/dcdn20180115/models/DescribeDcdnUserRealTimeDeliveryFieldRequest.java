// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserRealTimeDeliveryFieldRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnUserRealTimeDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserRealTimeDeliveryFieldRequest self = new DescribeDcdnUserRealTimeDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserRealTimeDeliveryFieldRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DescribeDcdnUserRealTimeDeliveryFieldRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

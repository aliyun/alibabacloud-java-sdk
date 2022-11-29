// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRealTimeDeliveryFieldRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    public static DescribeDcdnRealTimeDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRealTimeDeliveryFieldRequest self = new DescribeDcdnRealTimeDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRealTimeDeliveryFieldRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}

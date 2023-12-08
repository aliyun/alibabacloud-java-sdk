// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class BillingApplicationRequest extends TeaModel {
    @NameInMap("Month")
    public Integer month;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Year")
    public Integer year;

    public static BillingApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingApplicationRequest self = new BillingApplicationRequest();
        return TeaModel.build(map, self);
    }

    public BillingApplicationRequest setMonth(Integer month) {
        this.month = month;
        return this;
    }
    public Integer getMonth() {
        return this.month;
    }

    public BillingApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BillingApplicationRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}

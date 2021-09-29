// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateApplicationRequest extends TeaModel {
    // 应用ID
    @NameInMap("ApplicationId")
    public String applicationId;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ValuateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ValuateApplicationRequest self = new ValuateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ValuateApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ValuateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

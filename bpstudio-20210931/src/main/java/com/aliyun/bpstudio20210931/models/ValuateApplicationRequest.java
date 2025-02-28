// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateApplicationRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to ValuateApplication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02S7UU41WKJL7ERR</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the resource group to which the application you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1600765710019</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyjt3c5om3hi</p>
     */
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

    public ValuateApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValuateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

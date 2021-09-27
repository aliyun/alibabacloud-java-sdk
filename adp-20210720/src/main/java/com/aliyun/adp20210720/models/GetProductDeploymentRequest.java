// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductDeploymentRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("withParamConfig")
    public Boolean withParamConfig;

    public static GetProductDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductDeploymentRequest self = new GetProductDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetProductDeploymentRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public GetProductDeploymentRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public GetProductDeploymentRequest setWithParamConfig(Boolean withParamConfig) {
        this.withParamConfig = withParamConfig;
        return this;
    }
    public Boolean getWithParamConfig() {
        return this.withParamConfig;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GenerateProductInstanceDeploymentConfigRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static GenerateProductInstanceDeploymentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductInstanceDeploymentConfigRequest self = new GenerateProductInstanceDeploymentConfigRequest();
        return TeaModel.build(map, self);
    }

    public GenerateProductInstanceDeploymentConfigRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public GenerateProductInstanceDeploymentConfigRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}

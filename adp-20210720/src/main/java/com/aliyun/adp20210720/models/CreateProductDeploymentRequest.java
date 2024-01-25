// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductDeploymentRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("packageConfig")
    public String packageConfig;

    @NameInMap("packageUID")
    public String packageUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("timeout")
    public Long timeout;

    public static CreateProductDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDeploymentRequest self = new CreateProductDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductDeploymentRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public CreateProductDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateProductDeploymentRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public CreateProductDeploymentRequest setPackageConfig(String packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public String getPackageConfig() {
        return this.packageConfig;
    }

    public CreateProductDeploymentRequest setPackageUID(String packageUID) {
        this.packageUID = packageUID;
        return this;
    }
    public String getPackageUID() {
        return this.packageUID;
    }

    public CreateProductDeploymentRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public CreateProductDeploymentRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}

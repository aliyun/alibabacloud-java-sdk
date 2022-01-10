// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDefaultWorkspaceRequest extends TeaModel {
    // 描述，最多80个字符
    @NameInMap("Description")
    public String description;

    // 环境列表
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    // 资源
    @NameInMap("Resources")
    public java.util.List<CreateDefaultWorkspaceRequestResources> resources;

    public static CreateDefaultWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultWorkspaceRequest self = new CreateDefaultWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefaultWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefaultWorkspaceRequest setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public CreateDefaultWorkspaceRequest setResources(java.util.List<CreateDefaultWorkspaceRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateDefaultWorkspaceRequestResources> getResources() {
        return this.resources;
    }

    public static class CreateDefaultWorkspaceRequestResources extends TeaModel {
        // 产品类型
        @NameInMap("ProductType")
        public String productType;

        public static CreateDefaultWorkspaceRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateDefaultWorkspaceRequestResources self = new CreateDefaultWorkspaceRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateDefaultWorkspaceRequestResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

}

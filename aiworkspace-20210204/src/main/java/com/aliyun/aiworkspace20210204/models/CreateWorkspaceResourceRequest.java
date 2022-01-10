// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResourceRequest extends TeaModel {
    // 资源列表
    @NameInMap("Resources")
    public java.util.List<CreateWorkspaceResourceRequestResources> resources;

    public static CreateWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResourceRequest self = new CreateWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResourceRequest setResources(java.util.List<CreateWorkspaceResourceRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateWorkspaceResourceRequestResources> getResources() {
        return this.resources;
    }

    public static class CreateWorkspaceResourceRequestResourcesQuotas extends TeaModel {
        // 卡类型，支持cpu、gpu
        @NameInMap("CardType")
        public String cardType;

        // 模式 isolate 预付费 share 后付费 develop 开发模式
        @NameInMap("Mode")
        public String mode;

        // 配额名称
        @NameInMap("Name")
        public String name;

        // 商品 code
        @NameInMap("ProductCode")
        public String productCode;

        // 产品类型， 支持PAI，MaxCompute
        @NameInMap("QuotaType")
        public String quotaType;

        // 规格描述
        @NameInMap("Spec")
        public String spec;

        public static CreateWorkspaceResourceRequestResourcesQuotas build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceRequestResourcesQuotas self = new CreateWorkspaceResourceRequestResourcesQuotas();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateWorkspaceResourceRequestResources extends TeaModel {
        // 环境， 支持dev（开发）、prod（生产）
        @NameInMap("EnvType")
        public String envType;

        // 分组名，主账户内唯一 一个 GroupName 下可能有一个 dev 资源和一个 prod 资源
        @NameInMap("GroupName")
        public String groupName;

        // 是否默认资源 每个类型都有一个默认的资源
        @NameInMap("IsDefault")
        public Boolean isDefault;

        // 资源名 长度需要在3到27个字符 region内唯一
        @NameInMap("Name")
        public String name;

        // 产品类型， 支持PAI，MaxCompute
        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Quotas")
        public java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> quotas;

        // 对于MaxCompute是个json，有如下key： Endpoint Project
        @NameInMap("Spec")
        public String spec;

        // 所属的工作空间 id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateWorkspaceResourceRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceRequestResources self = new CreateWorkspaceResourceRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceRequestResources setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateWorkspaceResourceRequestResources setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateWorkspaceResourceRequestResources setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public CreateWorkspaceResourceRequestResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResourceRequestResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public CreateWorkspaceResourceRequestResources setQuotas(java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> quotas) {
            this.quotas = quotas;
            return this;
        }
        public java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> getQuotas() {
            return this.quotas;
        }

        public CreateWorkspaceResourceRequestResources setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public CreateWorkspaceResourceRequestResources setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 资源列表
    @NameInMap("Resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

    // 符合过滤条件的作业数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponseBody setResources(java.util.List<ListResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public ListResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourcesResponseBodyResourcesQuotasSpecs extends TeaModel {
        // 规格名字
        @NameInMap("Name")
        public String name;

        // 规格描述
        @NameInMap("Value")
        public String value;

        public static ListResourcesResponseBodyResourcesQuotasSpecs build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesQuotasSpecs self = new ListResourcesResponseBodyResourcesQuotasSpecs();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesQuotasSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyResourcesQuotasSpecs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourcesResponseBodyResourcesQuotas extends TeaModel {
        // 卡类型，支持cpu、gpu
        @NameInMap("CardType")
        public String cardType;

        // 配额id
        @NameInMap("Id")
        public String id;

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

        // 规格描述列表
        @NameInMap("Specs")
        public java.util.List<ListResourcesResponseBodyResourcesQuotasSpecs> specs;

        public static ListResourcesResponseBodyResourcesQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesQuotas self = new ListResourcesResponseBodyResourcesQuotas();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesQuotas setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public ListResourcesResponseBodyResourcesQuotas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcesResponseBodyResourcesQuotas setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListResourcesResponseBodyResourcesQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyResourcesQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListResourcesResponseBodyResourcesQuotas setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListResourcesResponseBodyResourcesQuotas setSpecs(java.util.List<ListResourcesResponseBodyResourcesQuotasSpecs> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesQuotasSpecs> getSpecs() {
            return this.specs;
        }

    }

    public static class ListResourcesResponseBodyResourcesResourceSummary extends TeaModel {
        // 资源个数
        @NameInMap("Count")
        public Long count;

        // 资源类型
        @NameInMap("ProductType")
        public String productType;

        public static ListResourcesResponseBodyResourcesResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesResourceSummary self = new ListResourcesResponseBodyResourcesResourceSummary();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesResourceSummary setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListResourcesResponseBodyResourcesResourceSummary setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

    public static class ListResourcesResponseBodyResources extends TeaModel {
        // 环境， 支持dev（开发）、prod（生产）
        @NameInMap("EnvType")
        public String envType;

        // 创建 UTC 时间，日期格式 iso8601
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

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
        public java.util.List<ListResourcesResponseBodyResourcesQuotas> quotas;

        @NameInMap("ResourceSummary")
        public java.util.List<ListResourcesResponseBodyResourcesResourceSummary> resourceSummary;

        // 对于MaxCompute是个json，有如下key： Endpoint Project
        @NameInMap("Spec")
        public java.util.Map<String, ?> spec;

        // 所属的工作空间 id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        // 资源 id
        @NameInMap("id")
        public String id;

        public static ListResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResources self = new ListResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResources setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListResourcesResponseBodyResources setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListResourcesResponseBodyResources setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListResourcesResponseBodyResources setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListResourcesResponseBodyResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListResourcesResponseBodyResources setQuotas(java.util.List<ListResourcesResponseBodyResourcesQuotas> quotas) {
            this.quotas = quotas;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesQuotas> getQuotas() {
            return this.quotas;
        }

        public ListResourcesResponseBodyResources setResourceSummary(java.util.List<ListResourcesResponseBodyResourcesResourceSummary> resourceSummary) {
            this.resourceSummary = resourceSummary;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesResourceSummary> getResourceSummary() {
            return this.resourceSummary;
        }

        public ListResourcesResponseBodyResources setSpec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.Map<String, ?> getSpec() {
            return this.spec;
        }

        public ListResourcesResponseBodyResources setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListResourcesResponseBodyResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

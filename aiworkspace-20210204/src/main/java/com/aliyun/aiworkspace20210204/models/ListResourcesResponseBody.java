// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("CardType")
        public String cardType;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaType")
        public String quotaType;

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

        public ListResourcesResponseBodyResourcesQuotas setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
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

    public static class ListResourcesResponseBodyResources extends TeaModel {
        @NameInMap("EnvType")
        public String envType;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Quotas")
        public java.util.List<ListResourcesResponseBodyResourcesQuotas> quotas;

        @NameInMap("Spec")
        public java.util.Map<String, ?> spec;

        @NameInMap("WorkspaceId")
        public String workspaceId;

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

        public ListResourcesResponseBodyResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    }

}

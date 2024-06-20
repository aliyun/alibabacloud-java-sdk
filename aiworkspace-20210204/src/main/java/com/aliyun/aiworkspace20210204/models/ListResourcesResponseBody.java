// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1e195c5116124202371861018d5bde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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

    public static class ListResourcesResponseBodyResourcesEncryption extends TeaModel {
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Key")
        public String key;

        public static ListResourcesResponseBodyResourcesEncryption build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesEncryption self = new ListResourcesResponseBodyResourcesEncryption();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesEncryption setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListResourcesResponseBodyResourcesEncryption setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListResourcesResponseBodyResourcesEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListResourcesResponseBodyResourcesExecutor extends TeaModel {
        @NameInMap("OwnerId")
        public String ownerId;

        public static ListResourcesResponseBodyResourcesExecutor build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesExecutor self = new ListResourcesResponseBodyResourcesExecutor();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesExecutor setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

    }

    public static class ListResourcesResponseBodyResourcesLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListResourcesResponseBodyResourcesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesLabels self = new ListResourcesResponseBodyResourcesLabels();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourcesResponseBodyResourcesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourcesResponseBodyResourcesQuotasSpecs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>11500</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("CardType")
        public String cardType;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>develop</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>QuotaName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute_isolate</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;cu\&quot;:\&quot;11500\&quot;,\&quot;minCu\&quot;:\&quot;2300\&quot;,\&quot;parentId\&quot;:\&quot;0\&quot;}</p>
         */
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
        @NameInMap("Encryption")
        public ListResourcesResponseBodyResourcesEncryption encryption;

        /**
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Executor")
        public ListResourcesResponseBodyResourcesExecutor executor;

        /**
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Labels")
        public java.util.List<ListResourcesResponseBodyResourcesLabels> labels;

        /**
         * <strong>example:</strong>
         * <p>ResourceName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Quotas")
        public java.util.List<ListResourcesResponseBodyResourcesQuotas> quotas;

        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>对于MaxCompute {&quot;Endpoint&quot;: &quot;odps.alibaba-inc.com&quot;, &quot;Project&quot;: &quot;mignshi&quot;}</p>
         */
        @NameInMap("Spec")
        public java.util.Map<String, ?> spec;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResources self = new ListResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResources setEncryption(ListResourcesResponseBodyResourcesEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public ListResourcesResponseBodyResourcesEncryption getEncryption() {
            return this.encryption;
        }

        public ListResourcesResponseBodyResources setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListResourcesResponseBodyResources setExecutor(ListResourcesResponseBodyResourcesExecutor executor) {
            this.executor = executor;
            return this;
        }
        public ListResourcesResponseBodyResourcesExecutor getExecutor() {
            return this.executor;
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

        public ListResourcesResponseBodyResources setLabels(java.util.List<ListResourcesResponseBodyResourcesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesLabels> getLabels() {
            return this.labels;
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

        public ListResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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

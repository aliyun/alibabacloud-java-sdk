// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyStorageRequirementsResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List of storage requirements</p>
     */
    @NameInMap("storageRequirements")
    public java.util.List<ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements> storageRequirements;

    public static ListIntegrationPolicyStorageRequirementsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyStorageRequirementsResponseBody self = new ListIntegrationPolicyStorageRequirementsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyStorageRequirementsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationPolicyStorageRequirementsResponseBody setStorageRequirements(java.util.List<ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements> storageRequirements) {
        this.storageRequirements = storageRequirements;
        return this;
    }
    public java.util.List<ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements> getStorageRequirements() {
        return this.storageRequirements;
    }

    public static class ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata extends TeaModel {
        /**
         * <p>Annotations</p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, String> annotations;

        /**
         * <p>Resource labels</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>Resource name</p>
         * 
         * <strong>example:</strong>
         * <p>pod-1234567</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Namespace</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("namespace")
        public String namespace;

        public static ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata self = new ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata setAnnotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec extends TeaModel {
        /**
         * <p>Instance ID, which can be specified if you need to pinpoint to the instance level. It depends on the data in EntityStore.</p>
         * 
         * <strong>example:</strong>
         * <p>es-xxxxx</p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Prom Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp122p85gthbniw8rsu9</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>Prom instance name</p>
         * 
         * <strong>example:</strong>
         * <p>category_predict</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>Optional parameter, determined based on the current environment type</p>
         * 
         * <strong>example:</strong>
         * <p>datagrid_cdm</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Storage sharing scope: Environment | Region | Workspace | Custom</p>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        @NameInMap("shareScope")
        public String shareScope;

        /**
         * <p>Instance storage type</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>Tags to be applied to the target storage (injected as system tags)</p>
         */
        @NameInMap("systemTags")
        public java.util.Map<String, String> systemTags;

        /**
         * <p>Tags to be applied to the target storage (injected as regular tags)</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>Workspace</p>
         * 
         * <strong>example:</strong>
         * <p>test-api</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec self = new ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setShareScope(String shareScope) {
            this.shareScope = shareScope;
            return this;
        }
        public String getShareScope() {
            return this.shareScope;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setSystemTags(java.util.Map<String, String> systemTags) {
            this.systemTags = systemTags;
            return this;
        }
        public java.util.Map<String, String> getSystemTags() {
            return this.systemTags;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus extends TeaModel {
        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-uqm3ket1t0u</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Internal URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://192.168.xxxxxx">http://192.168.xxxxxx</a></p>
         */
        @NameInMap("interUrl")
        public String interUrl;

        /**
         * <p>External URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://100.100.xxxxxx">http://100.100.xxxxxx</a></p>
         */
        @NameInMap("intraUrl")
        public String intraUrl;

        /**
         * <p>存储需求名称</p>
         * 
         * <strong>example:</strong>
         * <p>sr-xxxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>存储需求项目</p>
         * 
         * <strong>example:</strong>
         * <p>jiuwu_algo</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>Prom\&quot;s metric center</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("promMetricStore")
        public String promMetricStore;

        /**
         * <p>Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Instance storage type</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus self = new ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setInterUrl(String interUrl) {
            this.interUrl = interUrl;
            return this;
        }
        public String getInterUrl() {
            return this.interUrl;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setIntraUrl(String intraUrl) {
            this.intraUrl = intraUrl;
            return this;
        }
        public String getIntraUrl() {
            return this.intraUrl;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setPromMetricStore(String promMetricStore) {
            this.promMetricStore = promMetricStore;
            return this;
        }
        public String getPromMetricStore() {
            return this.promMetricStore;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements extends TeaModel {
        /**
         * <p>Collection of AddonReleases.</p>
         */
        @NameInMap("addonReleaseNames")
        public java.util.List<String> addonReleaseNames;

        /**
         * <p>API Version</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>Resource kind</p>
         * 
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>Metadata</p>
         */
        @NameInMap("metadata")
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata metadata;

        /**
         * <p>Resource spec</p>
         */
        @NameInMap("spec")
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec spec;

        /**
         * <p>Storage requirement status</p>
         */
        @NameInMap("status")
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus status;

        public static ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements self = new ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setAddonReleaseNames(java.util.List<String> addonReleaseNames) {
            this.addonReleaseNames = addonReleaseNames;
            return this;
        }
        public java.util.List<String> getAddonReleaseNames() {
            return this.addonReleaseNames;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setMetadata(ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsMetadata getMetadata() {
            return this.metadata;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setSpec(ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsSpec getSpec() {
            return this.spec;
        }

        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirements setStatus(ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus status) {
            this.status = status;
            return this;
        }
        public ListIntegrationPolicyStorageRequirementsResponseBodyStorageRequirementsStatus getStatus() {
            return this.status;
        }

    }

}

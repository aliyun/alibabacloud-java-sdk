// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ProductComponentRelationDetail extends TeaModel {
    @NameInMap("appVersion")
    public String appVersion;

    @NameInMap("category")
    public String category;

    @NameInMap("class")
    public String _class;

    @NameInMap("componentName")
    public String componentName;

    @NameInMap("componentOrchestrationValues")
    public String componentOrchestrationValues;

    @NameInMap("componentUID")
    public String componentUID;

    @NameInMap("componentVersionSpecUID")
    public String componentVersionSpecUID;

    @NameInMap("componentVersionSpecValues")
    public String componentVersionSpecValues;

    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("documents")
    public String documents;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("imagesMapping")
    public String imagesMapping;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("orchestrationType")
    public String orchestrationType;

    @NameInMap("parentComponent")
    public Boolean parentComponent;

    @NameInMap("parentComponentVersionRelationUID")
    public String parentComponentVersionRelationUID;

    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    @NameInMap("policy")
    public ProductComponentRelationDetailPolicy policy;

    @NameInMap("priority")
    public Integer priority;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("provider")
    public String provider;

    @NameInMap("public")
    public Boolean _public;

    @NameInMap("readme")
    public String readme;

    @NameInMap("relationUID")
    public String relationUID;

    @NameInMap("releaseName")
    public String releaseName;

    @NameInMap("resources")
    public String resources;

    @NameInMap("sequence")
    public Integer sequence;

    @NameInMap("singleton")
    public Boolean singleton;

    @NameInMap("source")
    public String source;

    @NameInMap("version")
    public String version;

    public static ProductComponentRelationDetail build(java.util.Map<String, ?> map) throws Exception {
        ProductComponentRelationDetail self = new ProductComponentRelationDetail();
        return TeaModel.build(map, self);
    }

    public ProductComponentRelationDetail setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ProductComponentRelationDetail setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ProductComponentRelationDetail set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public ProductComponentRelationDetail setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ProductComponentRelationDetail setComponentOrchestrationValues(String componentOrchestrationValues) {
        this.componentOrchestrationValues = componentOrchestrationValues;
        return this;
    }
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    public ProductComponentRelationDetail setComponentUID(String componentUID) {
        this.componentUID = componentUID;
        return this;
    }
    public String getComponentUID() {
        return this.componentUID;
    }

    public ProductComponentRelationDetail setComponentVersionSpecUID(String componentVersionSpecUID) {
        this.componentVersionSpecUID = componentVersionSpecUID;
        return this;
    }
    public String getComponentVersionSpecUID() {
        return this.componentVersionSpecUID;
    }

    public ProductComponentRelationDetail setComponentVersionSpecValues(String componentVersionSpecValues) {
        this.componentVersionSpecValues = componentVersionSpecValues;
        return this;
    }
    public String getComponentVersionSpecValues() {
        return this.componentVersionSpecValues;
    }

    public ProductComponentRelationDetail setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public ProductComponentRelationDetail setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ProductComponentRelationDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProductComponentRelationDetail setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

    public ProductComponentRelationDetail setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ProductComponentRelationDetail setImagesMapping(String imagesMapping) {
        this.imagesMapping = imagesMapping;
        return this;
    }
    public String getImagesMapping() {
        return this.imagesMapping;
    }

    public ProductComponentRelationDetail setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ProductComponentRelationDetail setOrchestrationType(String orchestrationType) {
        this.orchestrationType = orchestrationType;
        return this;
    }
    public String getOrchestrationType() {
        return this.orchestrationType;
    }

    public ProductComponentRelationDetail setParentComponent(Boolean parentComponent) {
        this.parentComponent = parentComponent;
        return this;
    }
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    public ProductComponentRelationDetail setParentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
        this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
        return this;
    }
    public String getParentComponentVersionRelationUID() {
        return this.parentComponentVersionRelationUID;
    }

    public ProductComponentRelationDetail setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public ProductComponentRelationDetail setPolicy(ProductComponentRelationDetailPolicy policy) {
        this.policy = policy;
        return this;
    }
    public ProductComponentRelationDetailPolicy getPolicy() {
        return this.policy;
    }

    public ProductComponentRelationDetail setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ProductComponentRelationDetail setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public ProductComponentRelationDetail setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ProductComponentRelationDetail set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public ProductComponentRelationDetail setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

    public ProductComponentRelationDetail setRelationUID(String relationUID) {
        this.relationUID = relationUID;
        return this;
    }
    public String getRelationUID() {
        return this.relationUID;
    }

    public ProductComponentRelationDetail setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public ProductComponentRelationDetail setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ProductComponentRelationDetail setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public ProductComponentRelationDetail setSingleton(Boolean singleton) {
        this.singleton = singleton;
        return this;
    }
    public Boolean getSingleton() {
        return this.singleton;
    }

    public ProductComponentRelationDetail setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ProductComponentRelationDetail setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ProductComponentRelationDetailPolicyMultiCluster extends TeaModel {
        @NameInMap("targetClusters")
        public java.util.List<String> targetClusters;

        public static ProductComponentRelationDetailPolicyMultiCluster build(java.util.Map<String, ?> map) throws Exception {
            ProductComponentRelationDetailPolicyMultiCluster self = new ProductComponentRelationDetailPolicyMultiCluster();
            return TeaModel.build(map, self);
        }

        public ProductComponentRelationDetailPolicyMultiCluster setTargetClusters(java.util.List<String> targetClusters) {
            this.targetClusters = targetClusters;
            return this;
        }
        public java.util.List<String> getTargetClusters() {
            return this.targetClusters;
        }

    }

    public static class ProductComponentRelationDetailPolicy extends TeaModel {
        @NameInMap("multiCluster")
        public ProductComponentRelationDetailPolicyMultiCluster multiCluster;

        public static ProductComponentRelationDetailPolicy build(java.util.Map<String, ?> map) throws Exception {
            ProductComponentRelationDetailPolicy self = new ProductComponentRelationDetailPolicy();
            return TeaModel.build(map, self);
        }

        public ProductComponentRelationDetailPolicy setMultiCluster(ProductComponentRelationDetailPolicyMultiCluster multiCluster) {
            this.multiCluster = multiCluster;
            return this;
        }
        public ProductComponentRelationDetailPolicyMultiCluster getMultiCluster() {
            return this.multiCluster;
        }

    }

}

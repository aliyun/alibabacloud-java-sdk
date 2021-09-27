// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ComponentVersion extends TeaModel {
    // appVersion
    @NameInMap("appVersion")
    public String appVersion;

    // componentName
    @NameInMap("componentName")
    public String componentName;

    // componentUID
    @NameInMap("componentUID")
    public String componentUID;

    // description
    @NameInMap("description")
    public String description;

    // documents
    @NameInMap("documents")
    public String documents;

    // imagesMapping
    @NameInMap("imagesMapping")
    public String imagesMapping;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // orchestrationType
    @NameInMap("orchestrationType")
    public String orchestrationType;

    // orchestrationValues
    @NameInMap("orchestrationValues")
    public String orchestrationValues;

    // packageURL
    @NameInMap("packageURL")
    public String packageURL;

    // parentComponent
    @NameInMap("parentComponent")
    public Boolean parentComponent;

    // platforms
    @NameInMap("platforms")
    public java.util.List<Platform> platforms;

    // readme
    @NameInMap("readme")
    public String readme;

    // resources
    @NameInMap("resources")
    public String resources;

    // source
    @NameInMap("source")
    public String source;

    // uid
    @NameInMap("uid")
    public String uid;

    // version
    @NameInMap("version")
    public String version;

    public static ComponentVersion build(java.util.Map<String, ?> map) throws Exception {
        ComponentVersion self = new ComponentVersion();
        return TeaModel.build(map, self);
    }

    public ComponentVersion setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ComponentVersion setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ComponentVersion setComponentUID(String componentUID) {
        this.componentUID = componentUID;
        return this;
    }
    public String getComponentUID() {
        return this.componentUID;
    }

    public ComponentVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentVersion setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

    public ComponentVersion setImagesMapping(String imagesMapping) {
        this.imagesMapping = imagesMapping;
        return this;
    }
    public String getImagesMapping() {
        return this.imagesMapping;
    }

    public ComponentVersion setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ComponentVersion setOrchestrationType(String orchestrationType) {
        this.orchestrationType = orchestrationType;
        return this;
    }
    public String getOrchestrationType() {
        return this.orchestrationType;
    }

    public ComponentVersion setOrchestrationValues(String orchestrationValues) {
        this.orchestrationValues = orchestrationValues;
        return this;
    }
    public String getOrchestrationValues() {
        return this.orchestrationValues;
    }

    public ComponentVersion setPackageURL(String packageURL) {
        this.packageURL = packageURL;
        return this;
    }
    public String getPackageURL() {
        return this.packageURL;
    }

    public ComponentVersion setParentComponent(Boolean parentComponent) {
        this.parentComponent = parentComponent;
        return this;
    }
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    public ComponentVersion setPlatforms(java.util.List<Platform> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<Platform> getPlatforms() {
        return this.platforms;
    }

    public ComponentVersion setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

    public ComponentVersion setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ComponentVersion setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ComponentVersion setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ComponentVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

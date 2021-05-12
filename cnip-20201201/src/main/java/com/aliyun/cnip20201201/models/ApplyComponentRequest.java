// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyComponentRequest extends TeaModel {
    @NameInMap("annotations")
    public String annotations;

    @NameInMap("appVersion")
    public String appVersion;

    @NameInMap("category")
    public String category;

    @NameInMap("componentClass")
    public String componentClass;

    @NameInMap("description")
    public String description;

    @NameInMap("documents")
    public String documents;

    @NameInMap("imagesMapping")
    public String imagesMapping;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("orchestrationType")
    public String orchestrationType;

    @NameInMap("orchestrationValues")
    public String orchestrationValues;

    @NameInMap("packageURL")
    public String packageURL;

    @NameInMap("parentComponent")
    public Boolean parentComponent;

    @NameInMap("platforms")
    public java.util.List<ApplyComponentRequestPlatforms> platforms;

    @NameInMap("priority")
    public Integer priority;

    @NameInMap("provider")
    public String provider;

    @NameInMap("public")
    public Boolean _public;

    @NameInMap("readme")
    public String readme;

    @NameInMap("resources")
    public String resources;

    @NameInMap("singleton")
    public Boolean singleton;

    @NameInMap("version")
    public String version;

    public static ApplyComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyComponentRequest self = new ApplyComponentRequest();
        return TeaModel.build(map, self);
    }

    public ApplyComponentRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public ApplyComponentRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApplyComponentRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ApplyComponentRequest setComponentClass(String componentClass) {
        this.componentClass = componentClass;
        return this;
    }
    public String getComponentClass() {
        return this.componentClass;
    }

    public ApplyComponentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplyComponentRequest setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

    public ApplyComponentRequest setImagesMapping(String imagesMapping) {
        this.imagesMapping = imagesMapping;
        return this;
    }
    public String getImagesMapping() {
        return this.imagesMapping;
    }

    public ApplyComponentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplyComponentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ApplyComponentRequest setOrchestrationType(String orchestrationType) {
        this.orchestrationType = orchestrationType;
        return this;
    }
    public String getOrchestrationType() {
        return this.orchestrationType;
    }

    public ApplyComponentRequest setOrchestrationValues(String orchestrationValues) {
        this.orchestrationValues = orchestrationValues;
        return this;
    }
    public String getOrchestrationValues() {
        return this.orchestrationValues;
    }

    public ApplyComponentRequest setPackageURL(String packageURL) {
        this.packageURL = packageURL;
        return this;
    }
    public String getPackageURL() {
        return this.packageURL;
    }

    public ApplyComponentRequest setParentComponent(Boolean parentComponent) {
        this.parentComponent = parentComponent;
        return this;
    }
    public Boolean getParentComponent() {
        return this.parentComponent;
    }

    public ApplyComponentRequest setPlatforms(java.util.List<ApplyComponentRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<ApplyComponentRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public ApplyComponentRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ApplyComponentRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ApplyComponentRequest set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public ApplyComponentRequest setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

    public ApplyComponentRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ApplyComponentRequest setSingleton(Boolean singleton) {
        this.singleton = singleton;
        return this;
    }
    public Boolean getSingleton() {
        return this.singleton;
    }

    public ApplyComponentRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ApplyComponentRequestPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ApplyComponentRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            ApplyComponentRequestPlatforms self = new ApplyComponentRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public ApplyComponentRequestPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ApplyComponentRequestPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}

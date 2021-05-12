// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyComponentsRequest extends TeaModel {
    @NameInMap("childrenList")
    public java.util.List<ApplyComponentsRequestChildrenList> childrenList;

    @NameInMap("component")
    public String component;

    public static ApplyComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyComponentsRequest self = new ApplyComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyComponentsRequest setChildrenList(java.util.List<ApplyComponentsRequestChildrenList> childrenList) {
        this.childrenList = childrenList;
        return this;
    }
    public java.util.List<ApplyComponentsRequestChildrenList> getChildrenList() {
        return this.childrenList;
    }

    public ApplyComponentsRequest setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public static class ApplyComponentsRequestChildrenListPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ApplyComponentsRequestChildrenListPlatforms build(java.util.Map<String, ?> map) throws Exception {
            ApplyComponentsRequestChildrenListPlatforms self = new ApplyComponentsRequestChildrenListPlatforms();
            return TeaModel.build(map, self);
        }

        public ApplyComponentsRequestChildrenListPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ApplyComponentsRequestChildrenListPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class ApplyComponentsRequestChildrenList extends TeaModel {
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
        public java.util.List<ApplyComponentsRequestChildrenListPlatforms> platforms;

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

        public static ApplyComponentsRequestChildrenList build(java.util.Map<String, ?> map) throws Exception {
            ApplyComponentsRequestChildrenList self = new ApplyComponentsRequestChildrenList();
            return TeaModel.build(map, self);
        }

        public ApplyComponentsRequestChildrenList setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public ApplyComponentsRequestChildrenList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ApplyComponentsRequestChildrenList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ApplyComponentsRequestChildrenList setComponentClass(String componentClass) {
            this.componentClass = componentClass;
            return this;
        }
        public String getComponentClass() {
            return this.componentClass;
        }

        public ApplyComponentsRequestChildrenList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ApplyComponentsRequestChildrenList setDocuments(String documents) {
            this.documents = documents;
            return this;
        }
        public String getDocuments() {
            return this.documents;
        }

        public ApplyComponentsRequestChildrenList setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public ApplyComponentsRequestChildrenList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApplyComponentsRequestChildrenList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ApplyComponentsRequestChildrenList setOrchestrationType(String orchestrationType) {
            this.orchestrationType = orchestrationType;
            return this;
        }
        public String getOrchestrationType() {
            return this.orchestrationType;
        }

        public ApplyComponentsRequestChildrenList setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public ApplyComponentsRequestChildrenList setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public ApplyComponentsRequestChildrenList setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public ApplyComponentsRequestChildrenList setPlatforms(java.util.List<ApplyComponentsRequestChildrenListPlatforms> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<ApplyComponentsRequestChildrenListPlatforms> getPlatforms() {
            return this.platforms;
        }

        public ApplyComponentsRequestChildrenList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ApplyComponentsRequestChildrenList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ApplyComponentsRequestChildrenList set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public ApplyComponentsRequestChildrenList setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public ApplyComponentsRequestChildrenList setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public ApplyComponentsRequestChildrenList setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public ApplyComponentsRequestChildrenList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

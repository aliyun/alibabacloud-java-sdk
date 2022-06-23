// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class GetProductComponentDetailResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductComponentDetailResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("success")
    public Boolean success;

    public static GetProductComponentDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductComponentDetailResponseBody self = new GetProductComponentDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductComponentDetailResponseBody setData(GetProductComponentDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductComponentDetailResponseBodyData getData() {
        return this.data;
    }

    public GetProductComponentDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductComponentDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductComponentDetailResponseBodyDataChildrenComponentVersionList extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("category")
        public String category;

        @NameInMap("class")
        public String _class;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public java.util.List<String> documents;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("imagesMapping")
        public String imagesMapping;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("productComponentVersionUID")
        public String productComponentVersionUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("readme")
        public String readme;

        @NameInMap("resources")
        public String resources;

        @NameInMap("singleton")
        public Boolean singleton;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static GetProductComponentDetailResponseBodyDataChildrenComponentVersionList build(java.util.Map<String, ?> map) throws Exception {
            GetProductComponentDetailResponseBodyDataChildrenComponentVersionList self = new GetProductComponentDetailResponseBodyDataChildrenComponentVersionList();
            return TeaModel.build(map, self);
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductComponentDetailResponseBodyDataChildrenComponentVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetProductComponentDetailResponseBodyData extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("category")
        public String category;

        @NameInMap("childrenComponentVersionList")
        public java.util.List<GetProductComponentDetailResponseBodyDataChildrenComponentVersionList> childrenComponentVersionList;

        @NameInMap("class")
        public String _class;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public java.util.List<String> documents;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("hasDependency")
        public Boolean hasDependency;

        @NameInMap("imagesMapping")
        public String imagesMapping;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("productComponentVersionUID")
        public String productComponentVersionUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("readme")
        public String readme;

        @NameInMap("resources")
        public String resources;

        @NameInMap("singleton")
        public Boolean singleton;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static GetProductComponentDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductComponentDetailResponseBodyData self = new GetProductComponentDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductComponentDetailResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetProductComponentDetailResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetProductComponentDetailResponseBodyData setChildrenComponentVersionList(java.util.List<GetProductComponentDetailResponseBodyDataChildrenComponentVersionList> childrenComponentVersionList) {
            this.childrenComponentVersionList = childrenComponentVersionList;
            return this;
        }
        public java.util.List<GetProductComponentDetailResponseBodyDataChildrenComponentVersionList> getChildrenComponentVersionList() {
            return this.childrenComponentVersionList;
        }

        public GetProductComponentDetailResponseBodyData set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetProductComponentDetailResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetProductComponentDetailResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetProductComponentDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductComponentDetailResponseBodyData setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public GetProductComponentDetailResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetProductComponentDetailResponseBodyData setHasDependency(Boolean hasDependency) {
            this.hasDependency = hasDependency;
            return this;
        }
        public Boolean getHasDependency() {
            return this.hasDependency;
        }

        public GetProductComponentDetailResponseBodyData setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public GetProductComponentDetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetProductComponentDetailResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetProductComponentDetailResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetProductComponentDetailResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetProductComponentDetailResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetProductComponentDetailResponseBodyData setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public GetProductComponentDetailResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetProductComponentDetailResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetProductComponentDetailResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetProductComponentDetailResponseBodyData setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public GetProductComponentDetailResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductComponentDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class TestProResponseBody extends TeaModel {
    @NameInMap("data")
    public TestProResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("success")
    public Boolean success;

    public static TestProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestProResponseBody self = new TestProResponseBody();
        return TeaModel.build(map, self);
    }

    public TestProResponseBody setData(TestProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestProResponseBodyData getData() {
        return this.data;
    }

    public TestProResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public TestProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestProResponseBodyDataChildrenComponentVersionList extends TeaModel {
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

        public static TestProResponseBodyDataChildrenComponentVersionList build(java.util.Map<String, ?> map) throws Exception {
            TestProResponseBodyDataChildrenComponentVersionList self = new TestProResponseBodyDataChildrenComponentVersionList();
            return TeaModel.build(map, self);
        }

        public TestProResponseBodyDataChildrenComponentVersionList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public TestProResponseBodyDataChildrenComponentVersionList set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public TestProResponseBodyDataChildrenComponentVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class TestProResponseBodyData extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("category")
        public String category;

        @NameInMap("childrenComponentVersionList")
        public java.util.List<TestProResponseBodyDataChildrenComponentVersionList> childrenComponentVersionList;

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

        public static TestProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestProResponseBodyData self = new TestProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestProResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public TestProResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public TestProResponseBodyData setChildrenComponentVersionList(java.util.List<TestProResponseBodyDataChildrenComponentVersionList> childrenComponentVersionList) {
            this.childrenComponentVersionList = childrenComponentVersionList;
            return this;
        }
        public java.util.List<TestProResponseBodyDataChildrenComponentVersionList> getChildrenComponentVersionList() {
            return this.childrenComponentVersionList;
        }

        public TestProResponseBodyData set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public TestProResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public TestProResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public TestProResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TestProResponseBodyData setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public TestProResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public TestProResponseBodyData setHasDependency(Boolean hasDependency) {
            this.hasDependency = hasDependency;
            return this;
        }
        public Boolean getHasDependency() {
            return this.hasDependency;
        }

        public TestProResponseBodyData setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public TestProResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public TestProResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public TestProResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public TestProResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public TestProResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public TestProResponseBodyData setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public TestProResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public TestProResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public TestProResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public TestProResponseBodyData setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public TestProResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public TestProResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionRelatedComponentVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetProductVersionRelatedComponentVersionResponseBodyData> data;

    public static GetProductVersionRelatedComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRelatedComponentVersionResponseBody self = new GetProductVersionRelatedComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRelatedComponentVersionResponseBody setData(java.util.List<GetProductVersionRelatedComponentVersionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductVersionRelatedComponentVersionResponseBodyData> getData() {
        return this.data;
    }

    public static class GetProductVersionRelatedComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("relationUID")
        public String relationUID;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("parentComponentVersionRelationUID")
        public String parentComponentVersionRelationUID;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("values")
        public String values;

        @NameInMap("componentVersionPackageURL")
        public String componentVersionPackageURL;

        @NameInMap("releaseName")
        public String releaseName;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("sequence")
        public Integer sequence;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentDescription")
        public String componentDescription;

        @NameInMap("version")
        public String version;

        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("componentVersionDescription")
        public String componentVersionDescription;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("resources")
        public String resources;

        @NameInMap("namespace")
        public String namespace;

        public static GetProductVersionRelatedComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionRelatedComponentVersionResponseBodyData self = new GetProductVersionRelatedComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setRelationUID(String relationUID) {
            this.relationUID = relationUID;
            return this;
        }
        public String getRelationUID() {
            return this.relationUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setParentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
            this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
            return this;
        }
        public String getParentComponentVersionRelationUID() {
            return this.parentComponentVersionRelationUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentVersionPackageURL(String componentVersionPackageURL) {
            this.componentVersionPackageURL = componentVersionPackageURL;
            return this;
        }
        public String getComponentVersionPackageURL() {
            return this.componentVersionPackageURL;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
            return this;
        }
        public String getComponentDescription() {
            return this.componentDescription;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setComponentVersionDescription(String componentVersionDescription) {
            this.componentVersionDescription = componentVersionDescription;
            return this;
        }
        public String getComponentVersionDescription() {
            return this.componentVersionDescription;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetProductVersionRelatedComponentVersionResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}

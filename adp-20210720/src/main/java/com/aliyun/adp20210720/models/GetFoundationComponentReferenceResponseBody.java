// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationComponentReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetFoundationComponentReferenceResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationComponentReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationComponentReferenceResponseBody self = new GetFoundationComponentReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationComponentReferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationComponentReferenceResponseBody setData(java.util.List<GetFoundationComponentReferenceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFoundationComponentReferenceResponseBodyData> getData() {
        return this.data;
    }

    public GetFoundationComponentReferenceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetFoundationComponentReferenceResponseBodyData extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("componentDescription")
        public String componentDescription;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentReferenceUID")
        public String componentReferenceUID;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("componentVersionDescription")
        public String componentVersionDescription;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("parentComponentVersionRelationUID")
        public String parentComponentVersionRelationUID;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("releaseName")
        public String releaseName;

        @NameInMap("resources")
        public String resources;

        @NameInMap("sequence")
        public Integer sequence;

        @NameInMap("values")
        public String values;

        @NameInMap("version")
        public String version;

        public static GetFoundationComponentReferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationComponentReferenceResponseBodyData self = new GetFoundationComponentReferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFoundationComponentReferenceResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
            return this;
        }
        public String getComponentDescription() {
            return this.componentDescription;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentReferenceUID(String componentReferenceUID) {
            this.componentReferenceUID = componentReferenceUID;
            return this;
        }
        public String getComponentReferenceUID() {
            return this.componentReferenceUID;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentVersionDescription(String componentVersionDescription) {
            this.componentVersionDescription = componentVersionDescription;
            return this;
        }
        public String getComponentVersionDescription() {
            return this.componentVersionDescription;
        }

        public GetFoundationComponentReferenceResponseBodyData setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public GetFoundationComponentReferenceResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetFoundationComponentReferenceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetFoundationComponentReferenceResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetFoundationComponentReferenceResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetFoundationComponentReferenceResponseBodyData setParentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
            this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
            return this;
        }
        public String getParentComponentVersionRelationUID() {
            return this.parentComponentVersionRelationUID;
        }

        public GetFoundationComponentReferenceResponseBodyData setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public GetFoundationComponentReferenceResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetFoundationComponentReferenceResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetFoundationComponentReferenceResponseBodyData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public GetFoundationComponentReferenceResponseBodyData setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

        public GetFoundationComponentReferenceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

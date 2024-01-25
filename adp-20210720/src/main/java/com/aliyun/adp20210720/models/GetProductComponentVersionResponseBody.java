// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetProductComponentVersionResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static GetProductComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductComponentVersionResponseBody self = new GetProductComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductComponentVersionResponseBody setData(java.util.List<GetProductComponentVersionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductComponentVersionResponseBodyData> getData() {
        return this.data;
    }

    public GetProductComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("category")
        public String category;

        @NameInMap("componentDescription")
        public String componentDescription;

        @NameInMap("componentName")
        public String componentName;

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

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("relationUID")
        public String relationUID;

        @NameInMap("releaseName")
        public String releaseName;

        @NameInMap("resources")
        public String resources;

        @NameInMap("sequence")
        public Integer sequence;

        @NameInMap("source")
        public String source;

        @NameInMap("values")
        public String values;

        @NameInMap("version")
        public String version;

        public static GetProductComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductComponentVersionResponseBodyData self = new GetProductComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductComponentVersionResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetProductComponentVersionResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetProductComponentVersionResponseBodyData setComponentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
            return this;
        }
        public String getComponentDescription() {
            return this.componentDescription;
        }

        public GetProductComponentVersionResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetProductComponentVersionResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetProductComponentVersionResponseBodyData setComponentVersionDescription(String componentVersionDescription) {
            this.componentVersionDescription = componentVersionDescription;
            return this;
        }
        public String getComponentVersionDescription() {
            return this.componentVersionDescription;
        }

        public GetProductComponentVersionResponseBodyData setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public GetProductComponentVersionResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetProductComponentVersionResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetProductComponentVersionResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetProductComponentVersionResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetProductComponentVersionResponseBodyData setParentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
            this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
            return this;
        }
        public String getParentComponentVersionRelationUID() {
            return this.parentComponentVersionRelationUID;
        }

        public GetProductComponentVersionResponseBodyData setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public GetProductComponentVersionResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public GetProductComponentVersionResponseBodyData setRelationUID(String relationUID) {
            this.relationUID = relationUID;
            return this;
        }
        public String getRelationUID() {
            return this.relationUID;
        }

        public GetProductComponentVersionResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetProductComponentVersionResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetProductComponentVersionResponseBodyData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public GetProductComponentVersionResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetProductComponentVersionResponseBodyData setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

        public GetProductComponentVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

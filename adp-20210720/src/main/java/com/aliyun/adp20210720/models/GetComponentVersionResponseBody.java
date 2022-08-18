// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetComponentVersionResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static GetComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionResponseBody self = new GetComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComponentVersionResponseBody setData(java.util.List<GetComponentVersionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetComponentVersionResponseBodyData> getData() {
        return this.data;
    }

    public GetComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetComponentVersionResponseBodyDataResources extends TeaModel {
        @NameInMap("limits")
        public java.util.Map<String, ?> limits;

        @NameInMap("requests")
        public java.util.Map<String, ?> requests;

        public static GetComponentVersionResponseBodyDataResources build(java.util.Map<String, ?> map) throws Exception {
            GetComponentVersionResponseBodyDataResources self = new GetComponentVersionResponseBodyDataResources();
            return TeaModel.build(map, self);
        }

        public GetComponentVersionResponseBodyDataResources setLimits(java.util.Map<String, ?> limits) {
            this.limits = limits;
            return this;
        }
        public java.util.Map<String, ?> getLimits() {
            return this.limits;
        }

        public GetComponentVersionResponseBodyDataResources setRequests(java.util.Map<String, ?> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.Map<String, ?> getRequests() {
            return this.requests;
        }

    }

    public static class GetComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public String documents;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("productComponentVersionUID")
        public String productComponentVersionUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("readme")
        public String readme;

        @NameInMap("resources")
        public GetComponentVersionResponseBodyDataResources resources;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static GetComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComponentVersionResponseBodyData self = new GetComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComponentVersionResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetComponentVersionResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetComponentVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComponentVersionResponseBodyData setDocuments(String documents) {
            this.documents = documents;
            return this;
        }
        public String getDocuments() {
            return this.documents;
        }

        public GetComponentVersionResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetComponentVersionResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetComponentVersionResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetComponentVersionResponseBodyData setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public GetComponentVersionResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetComponentVersionResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetComponentVersionResponseBodyData setResources(GetComponentVersionResponseBodyDataResources resources) {
            this.resources = resources;
            return this;
        }
        public GetComponentVersionResponseBodyDataResources getResources() {
            return this.resources;
        }

        public GetComponentVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetComponentVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

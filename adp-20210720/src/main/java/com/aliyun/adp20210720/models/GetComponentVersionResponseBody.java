// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetComponentVersionResponseBodyData> data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static GetComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionResponseBody self = new GetComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionResponseBody setData(java.util.List<GetComponentVersionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetComponentVersionResponseBodyData> getData() {
        return this.data;
    }

    public GetComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public java.util.List<String> documents;

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
        public String resources;

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

        public GetComponentVersionResponseBodyData setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
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

        public GetComponentVersionResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
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

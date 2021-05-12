// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetComponentVersionChildrenResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetComponentVersionChildrenResponseBodyData> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("status")
    public String status;

    @NameInMap("success")
    public Boolean success;

    public static GetComponentVersionChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionChildrenResponseBody self = new GetComponentVersionChildrenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionChildrenResponseBody setData(java.util.List<GetComponentVersionChildrenResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetComponentVersionChildrenResponseBodyData> getData() {
        return this.data;
    }

    public GetComponentVersionChildrenResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetComponentVersionChildrenResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetComponentVersionChildrenResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetComponentVersionChildrenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComponentVersionChildrenResponseBodyData extends TeaModel {
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

        public static GetComponentVersionChildrenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComponentVersionChildrenResponseBodyData self = new GetComponentVersionChildrenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComponentVersionChildrenResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetComponentVersionChildrenResponseBodyData setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public GetComponentVersionChildrenResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComponentVersionChildrenResponseBodyData setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public GetComponentVersionChildrenResponseBodyData setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public GetComponentVersionChildrenResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetComponentVersionChildrenResponseBodyData setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public GetComponentVersionChildrenResponseBodyData setProductComponentVersionUID(String productComponentVersionUID) {
            this.productComponentVersionUID = productComponentVersionUID;
            return this;
        }
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        public GetComponentVersionChildrenResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetComponentVersionChildrenResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetComponentVersionChildrenResponseBodyData setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public GetComponentVersionChildrenResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetComponentVersionChildrenResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}

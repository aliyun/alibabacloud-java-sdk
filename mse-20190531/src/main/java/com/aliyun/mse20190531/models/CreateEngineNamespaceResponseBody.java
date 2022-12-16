// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateEngineNamespaceResponseBody extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The details of the data.
    @NameInMap("Data")
    public CreateEngineNamespaceResponseBodyData data;

    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static CreateEngineNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineNamespaceResponseBody self = new CreateEngineNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEngineNamespaceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateEngineNamespaceResponseBody setData(CreateEngineNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEngineNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateEngineNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateEngineNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEngineNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEngineNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEngineNamespaceResponseBodyData extends TeaModel {
        // The number of configurations.
        @NameInMap("ConfigCount")
        public Integer configCount;

        // The ID of the namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The description of the namespace.
        @NameInMap("NamespaceDesc")
        public String namespaceDesc;

        // The display name of the namespace.
        @NameInMap("NamespaceShowName")
        public String namespaceShowName;

        // The quota of configurations.
        @NameInMap("Quota")
        public Integer quota;

        // The number of active services.
        @NameInMap("ServiceCount")
        public Integer serviceCount;

        // The type of the namespace. Valid values:
        // 
        // *   `0`: global configuration
        // *   `1`: default namespace
        // *   `2`: custom namespace
        @NameInMap("Type")
        public Integer type;

        public static CreateEngineNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEngineNamespaceResponseBodyData self = new CreateEngineNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEngineNamespaceResponseBodyData setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public CreateEngineNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateEngineNamespaceResponseBodyData setNamespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        public CreateEngineNamespaceResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public CreateEngineNamespaceResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public CreateEngineNamespaceResponseBodyData setServiceCount(Integer serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }
        public Integer getServiceCount() {
            return this.serviceCount;
        }

        public CreateEngineNamespaceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public UpdateEngineNamespaceResponseBodyData data;

    // The error code returned if the request failed.
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

    public static UpdateEngineNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceResponseBody self = new UpdateEngineNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceResponseBody setData(UpdateEngineNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEngineNamespaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateEngineNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateEngineNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEngineNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEngineNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateEngineNamespaceResponseBodyData extends TeaModel {
        // The quota value.
        @NameInMap("ConfigCount")
        public Integer configCount;

        // The namespace.
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

        // The type of the namespace. Valid values:
        // 
        // *   `0`: global configuration
        // *   `1`: default namespace
        // *   `2`: custom namespace
        @NameInMap("Type")
        public Integer type;

        public static UpdateEngineNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEngineNamespaceResponseBodyData self = new UpdateEngineNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEngineNamespaceResponseBodyData setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public UpdateEngineNamespaceResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public UpdateEngineNamespaceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}

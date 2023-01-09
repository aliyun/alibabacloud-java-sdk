// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceResponseBody extends TeaModel {
    // The number of configurations.
    @NameInMap("ConfigCount")
    public String configCount;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

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
    public String quota;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The type of the namespace. Valid values:
    // 
    // *   0: global configuration
    // *   1: default namespace
    // *   2: custom namespace
    @NameInMap("Type")
    public String type;

    public static GetEngineNamepaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEngineNamepaceResponseBody self = new GetEngineNamepaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEngineNamepaceResponseBody setConfigCount(String configCount) {
        this.configCount = configCount;
        return this;
    }
    public String getConfigCount() {
        return this.configCount;
    }

    public GetEngineNamepaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEngineNamepaceResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetEngineNamepaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEngineNamepaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetEngineNamepaceResponseBody setNamespaceDesc(String namespaceDesc) {
        this.namespaceDesc = namespaceDesc;
        return this;
    }
    public String getNamespaceDesc() {
        return this.namespaceDesc;
    }

    public GetEngineNamepaceResponseBody setNamespaceShowName(String namespaceShowName) {
        this.namespaceShowName = namespaceShowName;
        return this;
    }
    public String getNamespaceShowName() {
        return this.namespaceShowName;
    }

    public GetEngineNamepaceResponseBody setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public GetEngineNamepaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEngineNamepaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEngineNamepaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

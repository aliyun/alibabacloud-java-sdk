// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Type")
    public String type;

    @NameInMap("Quota")
    public String quota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ConfigCount")
    public String configCount;

    @NameInMap("NamespaceShowName")
    public String namespaceShowName;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("NamespaceDesc")
    public String namespaceDesc;

    @NameInMap("Namespace")
    public String namespace;

    public static GetEngineNamepaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEngineNamepaceResponseBody self = new GetEngineNamepaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEngineNamepaceResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetEngineNamepaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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

    public GetEngineNamepaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEngineNamepaceResponseBody setConfigCount(String configCount) {
        this.configCount = configCount;
        return this;
    }
    public String getConfigCount() {
        return this.configCount;
    }

    public GetEngineNamepaceResponseBody setNamespaceShowName(String namespaceShowName) {
        this.namespaceShowName = namespaceShowName;
        return this;
    }
    public String getNamespaceShowName() {
        return this.namespaceShowName;
    }

    public GetEngineNamepaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEngineNamepaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEngineNamepaceResponseBody setNamespaceDesc(String namespaceDesc) {
        this.namespaceDesc = namespaceDesc;
        return this;
    }
    public String getNamespaceDesc() {
        return this.namespaceDesc;
    }

    public GetEngineNamepaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceResponseBody extends TeaModel {
    /**
     * <p>The number of configurations.</p>
     */
    @NameInMap("ConfigCount")
    public String configCount;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The description of the namespace.</p>
     */
    @NameInMap("NamespaceDesc")
    public String namespaceDesc;

    /**
     * <p>The display name of the namespace.</p>
     */
    @NameInMap("NamespaceShowName")
    public String namespaceShowName;

    /**
     * <p>The quota of configurations.</p>
     */
    @NameInMap("Quota")
    public String quota;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The type of the namespace. Valid values:</p>
     * <br>
     * <p>*   0: global configuration</p>
     * <p>*   1: default namespace</p>
     * <p>*   2: custom namespace</p>
     */
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

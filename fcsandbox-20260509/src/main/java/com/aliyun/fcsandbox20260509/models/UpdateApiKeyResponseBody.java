// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateApiKeyResponseBody extends TeaModel {
    @NameInMap("apiKey")
    public ApiKey apiKey;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyResponseBody self = new UpdateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyResponseBody setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    public UpdateApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

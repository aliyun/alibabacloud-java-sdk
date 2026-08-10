// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateApiKeyResponseBody extends TeaModel {
    /**
     * <p>API Key。</p>
     * 
     * <strong>example:</strong>
     * <p>asdfjoY87-9IUHH</p>
     */
    @NameInMap("apiKey")
    public ApiKey apiKey;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2BCFAE0A-9FA9-5F72-8E8B-724632BC19A9</p>
     */
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

    public UpdateApiKeyResponseBody setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public UpdateApiKeyResponseBody setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
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

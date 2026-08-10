// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponseBody extends TeaModel {
    /**
     * <p>API Key。</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;gmtCreate\&quot;: 1776997128000, \&quot;workspaceId\&quot;: \&quot;ws-3w77kird5sblwwfk\&quot;, \&quot;apiKeyId\&quot;: 4808780, \&quot;createdBy\&quot;: \&quot;AssumedRoleUser300873166069492100\&quot;, \&quot;apiKeyValue\&quot;: \&quot;sk-110ff0028ad64a24b9453c8955c4c191\&quot;}</p>
     */
    @NameInMap("apiKey")
    public ApiKey apiKey;

    /**
     * <p>The error code.</p>
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
     * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponseBody self = new CreateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponseBody setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    public CreateApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApiKeyResponseBody setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public CreateApiKeyResponseBody setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public CreateApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeApiKeyResponseBody extends TeaModel {
    /**
     * <p>The Bailian API key.</p>
     * 
     * <strong>example:</strong>
     * <p>asdfjoY87-9IUHH</p>
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

    @NameInMap("effectivePermissions")
    public EffectivePermissions effectivePermissions;

    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    /**
     * <p>The IP whitelist.</p>
     */
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

    @NameInMap("permissionPolicy")
    public PermissionPolicy permissionPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BCFAE0A-9FA9-5F72-8E8B-724632BC19A9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiKeyResponseBody self = new DescribeApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiKeyResponseBody setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    public DescribeApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApiKeyResponseBody setEffectivePermissions(EffectivePermissions effectivePermissions) {
        this.effectivePermissions = effectivePermissions;
        return this;
    }
    public EffectivePermissions getEffectivePermissions() {
        return this.effectivePermissions;
    }

    public DescribeApiKeyResponseBody setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public DescribeApiKeyResponseBody setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public DescribeApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApiKeyResponseBody setPermissionPolicy(PermissionPolicy permissionPolicy) {
        this.permissionPolicy = permissionPolicy;
        return this;
    }
    public PermissionPolicy getPermissionPolicy() {
        return this.permissionPolicy;
    }

    public DescribeApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

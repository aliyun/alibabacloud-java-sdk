// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("Code")
    public String code;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("Message")
    public String message;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("RequestId")
    public BaseRequest requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static GetOssCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialResponseBody self = new GetOssCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetOssCredentialResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GetOssCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssCredentialResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetOssCredentialResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public GetOssCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssCredentialResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public GetOssCredentialResponseBody setRequestId(BaseRequest requestId) {
        this.requestId = requestId;
        return this;
    }
    public BaseRequest getRequestId() {
        return this.requestId;
    }

    public GetOssCredentialResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

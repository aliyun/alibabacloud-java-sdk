// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetStsInfoAndOssPathResponseBody extends TeaModel {
    // Sts info of accessKeyId
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    // Sts info of accessKeySecret
    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    // Sts info expiration time
    @NameInMap("Expiration")
    public String expiration;

    // OssPath
    @NameInMap("OssPath")
    public String ossPath;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Sts info of securityToken
    @NameInMap("SecurityToken")
    public String securityToken;

    public static GetStsInfoAndOssPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStsInfoAndOssPathResponseBody self = new GetStsInfoAndOssPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStsInfoAndOssPathResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetStsInfoAndOssPathResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GetStsInfoAndOssPathResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public GetStsInfoAndOssPathResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public GetStsInfoAndOssPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStsInfoAndOssPathResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

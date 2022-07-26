// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetStsInfoAndOssPathResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("RequestId")
    public String requestId;

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

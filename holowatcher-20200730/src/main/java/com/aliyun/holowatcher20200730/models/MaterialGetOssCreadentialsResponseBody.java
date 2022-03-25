// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialGetOssCreadentialsResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("OssPath")
    public String ossPath;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static MaterialGetOssCreadentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialGetOssCreadentialsResponseBody self = new MaterialGetOssCreadentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialGetOssCreadentialsResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public MaterialGetOssCreadentialsResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public MaterialGetOssCreadentialsResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public MaterialGetOssCreadentialsResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public MaterialGetOssCreadentialsResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public MaterialGetOssCreadentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialGetOssCreadentialsResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

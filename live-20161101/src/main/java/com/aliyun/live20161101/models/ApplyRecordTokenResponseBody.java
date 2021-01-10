// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyRecordTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Expiration")
    public String expiration;

    public static ApplyRecordTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRecordTokenResponseBody self = new ApplyRecordTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRecordTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRecordTokenResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ApplyRecordTokenResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ApplyRecordTokenResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public ApplyRecordTokenResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

}

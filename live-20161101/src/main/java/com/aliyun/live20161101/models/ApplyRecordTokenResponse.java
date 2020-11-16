// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyRecordTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityToken")
    @Validation(required = true)
    public String securityToken;

    @NameInMap("AccessKeySecret")
    @Validation(required = true)
    public String accessKeySecret;

    @NameInMap("AccessKeyId")
    @Validation(required = true)
    public String accessKeyId;

    @NameInMap("Expiration")
    @Validation(required = true)
    public String expiration;

    public static ApplyRecordTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRecordTokenResponse self = new ApplyRecordTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRecordTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRecordTokenResponse setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ApplyRecordTokenResponse setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ApplyRecordTokenResponse setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public ApplyRecordTokenResponse setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class StsTokenVO extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static StsTokenVO build(java.util.Map<String, ?> map) throws Exception {
        StsTokenVO self = new StsTokenVO();
        return TeaModel.build(map, self);
    }

    public StsTokenVO setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public StsTokenVO setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public StsTokenVO setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public StsTokenVO setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

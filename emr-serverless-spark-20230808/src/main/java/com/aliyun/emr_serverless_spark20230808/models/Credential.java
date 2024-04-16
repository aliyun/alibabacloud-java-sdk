// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Credential extends TeaModel {
    @NameInMap("accessId")
    public String accessId;

    @NameInMap("dir")
    public String dir;

    @NameInMap("expire")
    public String expire;

    @NameInMap("host")
    public String host;

    @NameInMap("policy")
    public String policy;

    @NameInMap("securityToken")
    public String securityToken;

    @NameInMap("signature")
    public String signature;

    public static Credential build(java.util.Map<String, ?> map) throws Exception {
        Credential self = new Credential();
        return TeaModel.build(map, self);
    }

    public Credential setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public Credential setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public Credential setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public Credential setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public Credential setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public Credential setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public Credential setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}

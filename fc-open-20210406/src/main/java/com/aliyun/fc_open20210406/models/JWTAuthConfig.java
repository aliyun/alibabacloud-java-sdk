// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class JWTAuthConfig extends TeaModel {
    @NameInMap("blackList")
    public String blackList;

    @NameInMap("claimPassBy")
    public java.util.List<String> claimPassBy;

    @NameInMap("jwks")
    public String jwks;

    @NameInMap("tokenLookup")
    public java.util.List<String> tokenLookup;

    @NameInMap("whiteList")
    public java.util.List<String> whiteList;

    public static JWTAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        JWTAuthConfig self = new JWTAuthConfig();
        return TeaModel.build(map, self);
    }

    public JWTAuthConfig setBlackList(String blackList) {
        this.blackList = blackList;
        return this;
    }
    public String getBlackList() {
        return this.blackList;
    }

    public JWTAuthConfig setClaimPassBy(java.util.List<String> claimPassBy) {
        this.claimPassBy = claimPassBy;
        return this;
    }
    public java.util.List<String> getClaimPassBy() {
        return this.claimPassBy;
    }

    public JWTAuthConfig setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public JWTAuthConfig setTokenLookup(java.util.List<String> tokenLookup) {
        this.tokenLookup = tokenLookup;
        return this;
    }
    public java.util.List<String> getTokenLookup() {
        return this.tokenLookup;
    }

    public JWTAuthConfig setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}

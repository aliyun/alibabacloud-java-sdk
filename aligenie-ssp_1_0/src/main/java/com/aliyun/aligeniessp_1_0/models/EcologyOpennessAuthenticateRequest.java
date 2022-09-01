// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessAuthenticateRequest extends TeaModel {
    @NameInMap("EncodeKey")
    public String encodeKey;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("LoginStateAccessToken")
    public String loginStateAccessToken;

    public static EcologyOpennessAuthenticateRequest build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessAuthenticateRequest self = new EcologyOpennessAuthenticateRequest();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessAuthenticateRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public EcologyOpennessAuthenticateRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public EcologyOpennessAuthenticateRequest setLoginStateAccessToken(String loginStateAccessToken) {
        this.loginStateAccessToken = loginStateAccessToken;
        return this;
    }
    public String getLoginStateAccessToken() {
        return this.loginStateAccessToken;
    }

}

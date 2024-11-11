// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessAuthenticateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d15aa*****ee</p>
     */
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

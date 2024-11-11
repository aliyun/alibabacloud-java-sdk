// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessSendVerificationCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18612345678</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>+86</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static EcologyOpennessSendVerificationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessSendVerificationCodeRequest self = new EcologyOpennessSendVerificationCodeRequest();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessSendVerificationCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public EcologyOpennessSendVerificationCodeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public EcologyOpennessSendVerificationCodeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}

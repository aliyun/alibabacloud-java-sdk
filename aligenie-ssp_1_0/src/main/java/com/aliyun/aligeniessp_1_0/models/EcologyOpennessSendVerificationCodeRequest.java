// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessSendVerificationCodeRequest extends TeaModel {
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Region")
    public String region;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateAuthenticatorRegistrationResponseBody extends TeaModel {
    @NameInMap("ChallengeBase64")
    public String challengeBase64;

    @NameInMap("Options")
    public String options;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuthenticatorRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthenticatorRegistrationResponseBody self = new CreateAuthenticatorRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthenticatorRegistrationResponseBody setChallengeBase64(String challengeBase64) {
        this.challengeBase64 = challengeBase64;
        return this;
    }
    public String getChallengeBase64() {
        return this.challengeBase64;
    }

    public CreateAuthenticatorRegistrationResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateAuthenticatorRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

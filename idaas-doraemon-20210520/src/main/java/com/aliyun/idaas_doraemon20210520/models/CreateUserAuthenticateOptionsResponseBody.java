// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateUserAuthenticateOptionsResponseBody extends TeaModel {
    // 防重放挑战码
    @NameInMap("ChallengeBase64")
    public String challengeBase64;

    // 创建认证的Options，内容是JSON
    @NameInMap("Options")
    public String options;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserAuthenticateOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthenticateOptionsResponseBody self = new CreateUserAuthenticateOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthenticateOptionsResponseBody setChallengeBase64(String challengeBase64) {
        this.challengeBase64 = challengeBase64;
        return this;
    }
    public String getChallengeBase64() {
        return this.challengeBase64;
    }

    public CreateUserAuthenticateOptionsResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateUserAuthenticateOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

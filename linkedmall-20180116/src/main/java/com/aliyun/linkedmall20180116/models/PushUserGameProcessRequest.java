// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("CurrentStepId")
    @Validation(required = true)
    public String currentStepId;

    @NameInMap("ProcessId")
    @Validation(required = true)
    public String processId;

    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    public String thirdPartyUserId;

    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static PushUserGameProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessRequest self = new PushUserGameProcessRequest();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public PushUserGameProcessRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushUserGameProcessRequest setCurrentStepId(String currentStepId) {
        this.currentStepId = currentStepId;
        return this;
    }
    public String getCurrentStepId() {
        return this.currentStepId;
    }

    public PushUserGameProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public PushUserGameProcessRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public PushUserGameProcessRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}

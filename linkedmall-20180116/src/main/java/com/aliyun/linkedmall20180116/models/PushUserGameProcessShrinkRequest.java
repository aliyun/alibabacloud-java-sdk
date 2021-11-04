// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CurrentStepId")
    public String currentStepId;

    @NameInMap("ExtInfo")
    public String extInfoShrink;

    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("body")
    public String bodyShrink;

    public static PushUserGameProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessShrinkRequest self = new PushUserGameProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public PushUserGameProcessShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushUserGameProcessShrinkRequest setCurrentStepId(String currentStepId) {
        this.currentStepId = currentStepId;
        return this;
    }
    public String getCurrentStepId() {
        return this.currentStepId;
    }

    public PushUserGameProcessShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public PushUserGameProcessShrinkRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public PushUserGameProcessShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public PushUserGameProcessShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}

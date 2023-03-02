// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class StartBackToBackCallRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CallCenterNumber")
    public String callCenterNumber;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("MobileKey")
    public String mobileKey;

    @NameInMap("SkillType")
    public Long skillType;

    public static StartBackToBackCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBackToBackCallRequest self = new StartBackToBackCallRequest();
        return TeaModel.build(map, self);
    }

    public StartBackToBackCallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartBackToBackCallRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartBackToBackCallRequest setCallCenterNumber(String callCenterNumber) {
        this.callCenterNumber = callCenterNumber;
        return this;
    }
    public String getCallCenterNumber() {
        return this.callCenterNumber;
    }

    public StartBackToBackCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartBackToBackCallRequest setMobileKey(String mobileKey) {
        this.mobileKey = mobileKey;
        return this;
    }
    public String getMobileKey() {
        return this.mobileKey;
    }

    public StartBackToBackCallRequest setSkillType(Long skillType) {
        this.skillType = skillType;
        return this;
    }
    public Long getSkillType() {
        return this.skillType;
    }

}

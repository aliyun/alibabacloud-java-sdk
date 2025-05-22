// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class StartBackToBackCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20211203180209000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>02131584184</p>
     */
    @NameInMap("CallCenterNumber")
    public String callCenterNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13162828888</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <strong>example:</strong>
     * <p>mobile1</p>
     */
    @NameInMap("MobileKey")
    public String mobileKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

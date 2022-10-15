// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DuplexDecisionShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizRequestId")
    public String bizRequestId;

    @NameInMap("CallTime")
    public Integer callTime;

    @NameInMap("CustomKeywords")
    public String customKeywordsShrink;

    @NameInMap("DialogContext")
    public String dialogContextShrink;

    @NameInMap("DialogStatus")
    public String dialogStatus;

    @NameInMap("InterruptType")
    public Integer interruptType;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    public static DuplexDecisionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DuplexDecisionShrinkRequest self = new DuplexDecisionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DuplexDecisionShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DuplexDecisionShrinkRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public DuplexDecisionShrinkRequest setCallTime(Integer callTime) {
        this.callTime = callTime;
        return this;
    }
    public Integer getCallTime() {
        return this.callTime;
    }

    public DuplexDecisionShrinkRequest setCustomKeywordsShrink(String customKeywordsShrink) {
        this.customKeywordsShrink = customKeywordsShrink;
        return this;
    }
    public String getCustomKeywordsShrink() {
        return this.customKeywordsShrink;
    }

    public DuplexDecisionShrinkRequest setDialogContextShrink(String dialogContextShrink) {
        this.dialogContextShrink = dialogContextShrink;
        return this;
    }
    public String getDialogContextShrink() {
        return this.dialogContextShrink;
    }

    public DuplexDecisionShrinkRequest setDialogStatus(String dialogStatus) {
        this.dialogStatus = dialogStatus;
        return this;
    }
    public String getDialogStatus() {
        return this.dialogStatus;
    }

    public DuplexDecisionShrinkRequest setInterruptType(Integer interruptType) {
        this.interruptType = interruptType;
        return this;
    }
    public Integer getInterruptType() {
        return this.interruptType;
    }

    public DuplexDecisionShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DuplexDecisionShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DuplexDecisionShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}

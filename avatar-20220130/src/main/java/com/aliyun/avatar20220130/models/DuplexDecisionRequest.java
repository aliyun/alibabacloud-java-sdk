// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DuplexDecisionRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizRequestId")
    public String bizRequestId;

    @NameInMap("CallTime")
    public Integer callTime;

    @NameInMap("CustomKeywords")
    public java.util.List<String> customKeywords;

    @NameInMap("DialogContext")
    public DuplexDecisionRequestDialogContext dialogContext;

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

    public static DuplexDecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DuplexDecisionRequest self = new DuplexDecisionRequest();
        return TeaModel.build(map, self);
    }

    public DuplexDecisionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DuplexDecisionRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public DuplexDecisionRequest setCallTime(Integer callTime) {
        this.callTime = callTime;
        return this;
    }
    public Integer getCallTime() {
        return this.callTime;
    }

    public DuplexDecisionRequest setCustomKeywords(java.util.List<String> customKeywords) {
        this.customKeywords = customKeywords;
        return this;
    }
    public java.util.List<String> getCustomKeywords() {
        return this.customKeywords;
    }

    public DuplexDecisionRequest setDialogContext(DuplexDecisionRequestDialogContext dialogContext) {
        this.dialogContext = dialogContext;
        return this;
    }
    public DuplexDecisionRequestDialogContext getDialogContext() {
        return this.dialogContext;
    }

    public DuplexDecisionRequest setDialogStatus(String dialogStatus) {
        this.dialogStatus = dialogStatus;
        return this;
    }
    public String getDialogStatus() {
        return this.dialogStatus;
    }

    public DuplexDecisionRequest setInterruptType(Integer interruptType) {
        this.interruptType = interruptType;
        return this;
    }
    public Integer getInterruptType() {
        return this.interruptType;
    }

    public DuplexDecisionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DuplexDecisionRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DuplexDecisionRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public static class DuplexDecisionRequestDialogContextHistories extends TeaModel {
        @NameInMap("Robot")
        public String robot;

        @NameInMap("User")
        public String user;

        public static DuplexDecisionRequestDialogContextHistories build(java.util.Map<String, ?> map) throws Exception {
            DuplexDecisionRequestDialogContextHistories self = new DuplexDecisionRequestDialogContextHistories();
            return TeaModel.build(map, self);
        }

        public DuplexDecisionRequestDialogContextHistories setRobot(String robot) {
            this.robot = robot;
            return this;
        }
        public String getRobot() {
            return this.robot;
        }

        public DuplexDecisionRequestDialogContextHistories setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DuplexDecisionRequestDialogContext extends TeaModel {
        @NameInMap("CurUtteranceIdx")
        public Integer curUtteranceIdx;

        @NameInMap("Histories")
        public java.util.List<DuplexDecisionRequestDialogContextHistories> histories;

        public static DuplexDecisionRequestDialogContext build(java.util.Map<String, ?> map) throws Exception {
            DuplexDecisionRequestDialogContext self = new DuplexDecisionRequestDialogContext();
            return TeaModel.build(map, self);
        }

        public DuplexDecisionRequestDialogContext setCurUtteranceIdx(Integer curUtteranceIdx) {
            this.curUtteranceIdx = curUtteranceIdx;
            return this;
        }
        public Integer getCurUtteranceIdx() {
            return this.curUtteranceIdx;
        }

        public DuplexDecisionRequestDialogContext setHistories(java.util.List<DuplexDecisionRequestDialogContextHistories> histories) {
            this.histories = histories;
            return this;
        }
        public java.util.List<DuplexDecisionRequestDialogContextHistories> getHistories() {
            return this.histories;
        }

    }

}

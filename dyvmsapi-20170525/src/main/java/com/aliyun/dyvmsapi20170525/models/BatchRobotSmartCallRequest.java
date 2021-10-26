// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("DialogId")
    public String dialogId;

    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScheduleCall")
    public Boolean scheduleCall;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("TtsParamHead")
    public String ttsParamHead;

    public static BatchRobotSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRobotSmartCallRequest self = new BatchRobotSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public BatchRobotSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public BatchRobotSmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public BatchRobotSmartCallRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public BatchRobotSmartCallRequest setDialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public String getDialogId() {
        return this.dialogId;
    }

    public BatchRobotSmartCallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public BatchRobotSmartCallRequest setIsSelfLine(Boolean isSelfLine) {
        this.isSelfLine = isSelfLine;
        return this;
    }
    public Boolean getIsSelfLine() {
        return this.isSelfLine;
    }

    public BatchRobotSmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchRobotSmartCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchRobotSmartCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchRobotSmartCallRequest setScheduleCall(Boolean scheduleCall) {
        this.scheduleCall = scheduleCall;
        return this;
    }
    public Boolean getScheduleCall() {
        return this.scheduleCall;
    }

    public BatchRobotSmartCallRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public BatchRobotSmartCallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public BatchRobotSmartCallRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public BatchRobotSmartCallRequest setTtsParamHead(String ttsParamHead) {
        this.ttsParamHead = ttsParamHead;
        return this;
    }
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

}

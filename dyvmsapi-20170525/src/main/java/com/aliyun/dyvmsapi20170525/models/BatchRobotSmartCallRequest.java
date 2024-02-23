// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallRequest extends TeaModel {
    /**
     * <p>The called number. Only mobile phone numbers in the Chinese mainland are supported.</p>
     * <br>
     * <p>You can set up to 1,000 called numbers and separate the numbers with commas (,).</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The number displayed to called parties, which must be a number you purchased. You can view the numbers you purchased in the [Voice Messaging Service console](https://dyvms.console.aliyun.com/dyvms.htm#/number/normal).</p>
     * <br>
     * <p>You can set up to 100 numbers and separate the numbers with commas (,).</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The company name, which must be the same as the **company name** specified on the [qualification management page](https://dyvms.console.aliyun.com/dyvms.htm#/corp/normal).</p>
     * <br>
     * <p>> This parameter is optional if **isSelfLine** is set to **true**.</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The ID of the robot or communication script that is used to initiate a call.</p>
     * <br>
     * <p>You can obtain the **communication script ID** from the [Communication script management](https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list) page.</p>
     */
    @NameInMap("DialogId")
    public String dialogId;

    /**
     * <p>The speech recognition identifier of early media. The default value is **false**, which means that the speech recognition identifier of early media is not enabled.</p>
     * <br>
     * <p>Set the parameter to **true** if you want to enable the speech recognition identifier of early media.</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Specifies whether to call the self-managed line. Default value: **false**.</p>
     */
    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the call is scheduled. If you set this parameter to **true**, the **ScheduleTime** parameter is required.</p>
     */
    @NameInMap("ScheduleCall")
    public Boolean scheduleCall;

    /**
     * <p>The preset call time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * <br>
     * <p>>  This parameter is required only when **ScheduleCall** is set to **true**.</p>
     */
    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    /**
     * <p>The task name. The task name can be up to 30 characters in length.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The variable value of the TTS template, in the JSON format.</p>
     * <br>
     * <p>The variable value must correspond to a number. The TtsParam parameter must be used together with the TtsParamHead parameter.</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>The call tasks with variables, in the JSON format.</p>
     * <br>
     * <p>The parameter value is a list of variable names. The TtsParamHead parameter must be used together with the TtsParam parameter.</p>
     */
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

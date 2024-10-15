// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallRequest extends TeaModel {
    /**
     * <p>The called number. Only mobile phone numbers in the Chinese mainland are supported.</p>
     * <p>You can set up to 1,000 called numbers and separate the numbers with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The number displayed to called parties, which must be a number you purchased. You can view the numbers you purchased in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</p>
     * <p>You can set up to 100 numbers and separate the numbers with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>222</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The company name, which must be the same as the <strong>company name</strong> specified on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/corp/normal">qualification management page</a>.</p>
     * <blockquote>
     * <p>This parameter is optional if <strong>isSelfLine</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The ID of the robot or communication script that is used to initiate a call.</p>
     * <p>You can obtain the <strong>communication script ID</strong> from the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("DialogId")
    public String dialogId;

    /**
     * <p>The speech recognition identifier of early media. The default value is <strong>false</strong>, which means that the speech recognition identifier of early media is not enabled.</p>
     * <p>Set the parameter to <strong>true</strong> if you want to enable the speech recognition identifier of early media.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Specifies whether to call the self-managed line. Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>Specifies whether the call is scheduled. If you set this parameter to <strong>true</strong>, the <strong>ScheduleTime</strong> parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScheduleCall")
    public Boolean scheduleCall;

    /**
     * <p>The preset call time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p> This parameter is required only when <strong>ScheduleCall</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    /**
     * <p>The task name. The task name can be up to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Batch Tasks</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The variable value of the TTS template, in the JSON format.</p>
     * <p>The variable value must correspond to a number. The TtsParam parameter must be used together with the TtsParamHead parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;number&quot;:&quot;1390000****&quot;,&quot;params&quot;:[“Miss li”,&quot;miss wang&quot;,&quot;Mr.li&quot;]}]</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>The call tasks with variables, in the JSON format.</p>
     * <p>The parameter value is a list of variable names. The TtsParamHead parameter must be used together with the TtsParam parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;name1&quot;,&quot;name2&quot;,&quot;name3&quot;]</p>
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

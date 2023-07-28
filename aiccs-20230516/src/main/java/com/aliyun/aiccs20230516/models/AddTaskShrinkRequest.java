// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddTaskShrinkRequest extends TeaModel {
    /**
     * <p>外呼时间</p>
     */
    @NameInMap("CallTimeList")
    public String callTimeListShrink;

    /**
     * <p>回调地址</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>并发数</p>
     */
    @NameInMap("MaxConcurrency")
    public Long maxConcurrency;

    /**
     * <p>任务名称</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>播放间隔时长</p>
     */
    @NameInMap("PlaySleepVal")
    public Long playSleepVal;

    /**
     * <p>录音播放次数</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    /**
     * <p>重呼配置</p>
     */
    @NameInMap("RecallType")
    public Long recallType;

    /**
     * <p>录音地址</p>
     */
    @NameInMap("RecordPath")
    public String recordPath;

    /**
     * <p>重呼次数</p>
     */
    @NameInMap("RepeatCount")
    public Long repeatCount;

    /**
     * <p>重呼间隔</p>
     */
    @NameInMap("RepeatInterval")
    public Long repeatInterval;

    /**
     * <p>重呼条件</p>
     */
    @NameInMap("RepeatReason")
    public String repeatReasonShrink;

    /**
     * <p>重呼时间</p>
     */
    @NameInMap("RepeatTimes")
    public String repeatTimesShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>短信发送规则</p>
     */
    @NameInMap("SendSmsPlan")
    public String sendSmsPlanShrink;

    /**
     * <p>任务启动日期</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>任务类型</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <p>话术模板ID</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>话术模板类型</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static AddTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTaskShrinkRequest self = new AddTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddTaskShrinkRequest setCallTimeListShrink(String callTimeListShrink) {
        this.callTimeListShrink = callTimeListShrink;
        return this;
    }
    public String getCallTimeListShrink() {
        return this.callTimeListShrink;
    }

    public AddTaskShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddTaskShrinkRequest setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public AddTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTaskShrinkRequest setPlaySleepVal(Long playSleepVal) {
        this.playSleepVal = playSleepVal;
        return this;
    }
    public Long getPlaySleepVal() {
        return this.playSleepVal;
    }

    public AddTaskShrinkRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public AddTaskShrinkRequest setRecallType(Long recallType) {
        this.recallType = recallType;
        return this;
    }
    public Long getRecallType() {
        return this.recallType;
    }

    public AddTaskShrinkRequest setRecordPath(String recordPath) {
        this.recordPath = recordPath;
        return this;
    }
    public String getRecordPath() {
        return this.recordPath;
    }

    public AddTaskShrinkRequest setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }
    public Long getRepeatCount() {
        return this.repeatCount;
    }

    public AddTaskShrinkRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public AddTaskShrinkRequest setRepeatReasonShrink(String repeatReasonShrink) {
        this.repeatReasonShrink = repeatReasonShrink;
        return this;
    }
    public String getRepeatReasonShrink() {
        return this.repeatReasonShrink;
    }

    public AddTaskShrinkRequest setRepeatTimesShrink(String repeatTimesShrink) {
        this.repeatTimesShrink = repeatTimesShrink;
        return this;
    }
    public String getRepeatTimesShrink() {
        return this.repeatTimesShrink;
    }

    public AddTaskShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTaskShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTaskShrinkRequest setSendSmsPlanShrink(String sendSmsPlanShrink) {
        this.sendSmsPlanShrink = sendSmsPlanShrink;
        return this;
    }
    public String getSendSmsPlanShrink() {
        return this.sendSmsPlanShrink;
    }

    public AddTaskShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddTaskShrinkRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

    public AddTaskShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AddTaskShrinkRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}

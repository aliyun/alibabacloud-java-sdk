// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddTaskRequest extends TeaModel {
    /**
     * <p>外呼时间</p>
     */
    @NameInMap("CallTimeList")
    public java.util.List<AddTaskRequestCallTimeList> callTimeList;

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
    public java.util.List<String> repeatReason;

    /**
     * <p>重呼时间</p>
     */
    @NameInMap("RepeatTimes")
    public java.util.List<String> repeatTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>短信发送规则</p>
     */
    @NameInMap("SendSmsPlan")
    public java.util.List<AddTaskRequestSendSmsPlan> sendSmsPlan;

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

    public static AddTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTaskRequest self = new AddTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddTaskRequest setCallTimeList(java.util.List<AddTaskRequestCallTimeList> callTimeList) {
        this.callTimeList = callTimeList;
        return this;
    }
    public java.util.List<AddTaskRequestCallTimeList> getCallTimeList() {
        return this.callTimeList;
    }

    public AddTaskRequest setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public AddTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTaskRequest setPlaySleepVal(Long playSleepVal) {
        this.playSleepVal = playSleepVal;
        return this;
    }
    public Long getPlaySleepVal() {
        return this.playSleepVal;
    }

    public AddTaskRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public AddTaskRequest setRecallType(Long recallType) {
        this.recallType = recallType;
        return this;
    }
    public Long getRecallType() {
        return this.recallType;
    }

    public AddTaskRequest setRecordPath(String recordPath) {
        this.recordPath = recordPath;
        return this;
    }
    public String getRecordPath() {
        return this.recordPath;
    }

    public AddTaskRequest setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }
    public Long getRepeatCount() {
        return this.repeatCount;
    }

    public AddTaskRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public AddTaskRequest setRepeatReason(java.util.List<String> repeatReason) {
        this.repeatReason = repeatReason;
        return this;
    }
    public java.util.List<String> getRepeatReason() {
        return this.repeatReason;
    }

    public AddTaskRequest setRepeatTimes(java.util.List<String> repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }
    public java.util.List<String> getRepeatTimes() {
        return this.repeatTimes;
    }

    public AddTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTaskRequest setSendSmsPlan(java.util.List<AddTaskRequestSendSmsPlan> sendSmsPlan) {
        this.sendSmsPlan = sendSmsPlan;
        return this;
    }
    public java.util.List<AddTaskRequestSendSmsPlan> getSendSmsPlan() {
        return this.sendSmsPlan;
    }

    public AddTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddTaskRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

    public AddTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AddTaskRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public static class AddTaskRequestCallTimeList extends TeaModel {
        @NameInMap("CallTime")
        public java.util.List<String> callTime;

        public static AddTaskRequestCallTimeList build(java.util.Map<String, ?> map) throws Exception {
            AddTaskRequestCallTimeList self = new AddTaskRequestCallTimeList();
            return TeaModel.build(map, self);
        }

        public AddTaskRequestCallTimeList setCallTime(java.util.List<String> callTime) {
            this.callTime = callTime;
            return this;
        }
        public java.util.List<String> getCallTime() {
            return this.callTime;
        }

    }

    public static class AddTaskRequestSendSmsPlan extends TeaModel {
        /**
         * <p>意向标签</p>
         */
        @NameInMap("IntentTags")
        public java.util.List<String> intentTags;

        /**
         * <p>重呼条件</p>
         */
        @NameInMap("SmsTemplateId")
        public Long smsTemplateId;

        public static AddTaskRequestSendSmsPlan build(java.util.Map<String, ?> map) throws Exception {
            AddTaskRequestSendSmsPlan self = new AddTaskRequestSendSmsPlan();
            return TeaModel.build(map, self);
        }

        public AddTaskRequestSendSmsPlan setIntentTags(java.util.List<String> intentTags) {
            this.intentTags = intentTags;
            return this;
        }
        public java.util.List<String> getIntentTags() {
            return this.intentTags;
        }

        public AddTaskRequestSendSmsPlan setSmsTemplateId(Long smsTemplateId) {
            this.smsTemplateId = smsTemplateId;
            return this;
        }
        public Long getSmsTemplateId() {
            return this.smsTemplateId;
        }

    }

}

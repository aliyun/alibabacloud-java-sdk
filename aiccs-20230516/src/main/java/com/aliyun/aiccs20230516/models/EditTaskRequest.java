// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class EditTaskRequest extends TeaModel {
    /**
     * <p>外呼时间</p>
     */
    @NameInMap("CallTimeList")
    public java.util.List<EditTaskRequestCallTimeList> callTimeList;

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
    public java.util.List<Long> repeatReason;

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
    public java.util.List<EditTaskRequestSendSmsPlan> sendSmsPlan;

    /**
     * <p>任务状态</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>任务id</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

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

    public static EditTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EditTaskRequest self = new EditTaskRequest();
        return TeaModel.build(map, self);
    }

    public EditTaskRequest setCallTimeList(java.util.List<EditTaskRequestCallTimeList> callTimeList) {
        this.callTimeList = callTimeList;
        return this;
    }
    public java.util.List<EditTaskRequestCallTimeList> getCallTimeList() {
        return this.callTimeList;
    }

    public EditTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public EditTaskRequest setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public EditTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditTaskRequest setPlaySleepVal(Long playSleepVal) {
        this.playSleepVal = playSleepVal;
        return this;
    }
    public Long getPlaySleepVal() {
        return this.playSleepVal;
    }

    public EditTaskRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public EditTaskRequest setRecallType(Long recallType) {
        this.recallType = recallType;
        return this;
    }
    public Long getRecallType() {
        return this.recallType;
    }

    public EditTaskRequest setRecordPath(String recordPath) {
        this.recordPath = recordPath;
        return this;
    }
    public String getRecordPath() {
        return this.recordPath;
    }

    public EditTaskRequest setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }
    public Long getRepeatCount() {
        return this.repeatCount;
    }

    public EditTaskRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public EditTaskRequest setRepeatReason(java.util.List<Long> repeatReason) {
        this.repeatReason = repeatReason;
        return this;
    }
    public java.util.List<Long> getRepeatReason() {
        return this.repeatReason;
    }

    public EditTaskRequest setRepeatTimes(java.util.List<String> repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }
    public java.util.List<String> getRepeatTimes() {
        return this.repeatTimes;
    }

    public EditTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EditTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EditTaskRequest setSendSmsPlan(java.util.List<EditTaskRequestSendSmsPlan> sendSmsPlan) {
        this.sendSmsPlan = sendSmsPlan;
        return this;
    }
    public java.util.List<EditTaskRequestSendSmsPlan> getSendSmsPlan() {
        return this.sendSmsPlan;
    }

    public EditTaskRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public EditTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public EditTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public EditTaskRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public static class EditTaskRequestCallTimeList extends TeaModel {
        @NameInMap("CallTime")
        public java.util.List<String> callTime;

        public static EditTaskRequestCallTimeList build(java.util.Map<String, ?> map) throws Exception {
            EditTaskRequestCallTimeList self = new EditTaskRequestCallTimeList();
            return TeaModel.build(map, self);
        }

        public EditTaskRequestCallTimeList setCallTime(java.util.List<String> callTime) {
            this.callTime = callTime;
            return this;
        }
        public java.util.List<String> getCallTime() {
            return this.callTime;
        }

    }

    public static class EditTaskRequestSendSmsPlan extends TeaModel {
        /**
         * <p>意向标签</p>
         */
        @NameInMap("IntentTags")
        public java.util.List<String> intentTags;

        /**
         * <p>短信模板ID</p>
         */
        @NameInMap("SmsTemplateId")
        public Long smsTemplateId;

        public static EditTaskRequestSendSmsPlan build(java.util.Map<String, ?> map) throws Exception {
            EditTaskRequestSendSmsPlan self = new EditTaskRequestSendSmsPlan();
            return TeaModel.build(map, self);
        }

        public EditTaskRequestSendSmsPlan setIntentTags(java.util.List<String> intentTags) {
            this.intentTags = intentTags;
            return this;
        }
        public java.util.List<String> getIntentTags() {
            return this.intentTags;
        }

        public EditTaskRequestSendSmsPlan setSmsTemplateId(Long smsTemplateId) {
            this.smsTemplateId = smsTemplateId;
            return this;
        }
        public Long getSmsTemplateId() {
            return this.smsTemplateId;
        }

    }

}

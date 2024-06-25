// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class EditTaskShrinkRequest extends TeaModel {
    /**
     * <p>外呼时间</p>
     */
    @NameInMap("CallTimeList")
    public String callTimeListShrink;

    /**
     * <p>回调地址</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>并发数</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("MaxConcurrency")
    public Long maxConcurrency;

    /**
     * <p>任务名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>播放间隔时长</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("PlaySleepVal")
    public Long playSleepVal;

    /**
     * <p>录音播放次数</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    /**
     * <p>重呼配置</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallType")
    public Long recallType;

    /**
     * <p>录音地址</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RecordPath")
    public String recordPath;

    /**
     * <p>重呼次数</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("RepeatCount")
    public Long repeatCount;

    /**
     * <p>重呼间隔</p>
     * 
     * <strong>example:</strong>
     * <p>91</p>
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
     * <p>任务状态</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>任务id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>话术模板ID</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>话术模板类型</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static EditTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditTaskShrinkRequest self = new EditTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditTaskShrinkRequest setCallTimeListShrink(String callTimeListShrink) {
        this.callTimeListShrink = callTimeListShrink;
        return this;
    }
    public String getCallTimeListShrink() {
        return this.callTimeListShrink;
    }

    public EditTaskShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public EditTaskShrinkRequest setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public EditTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditTaskShrinkRequest setPlaySleepVal(Long playSleepVal) {
        this.playSleepVal = playSleepVal;
        return this;
    }
    public Long getPlaySleepVal() {
        return this.playSleepVal;
    }

    public EditTaskShrinkRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public EditTaskShrinkRequest setRecallType(Long recallType) {
        this.recallType = recallType;
        return this;
    }
    public Long getRecallType() {
        return this.recallType;
    }

    public EditTaskShrinkRequest setRecordPath(String recordPath) {
        this.recordPath = recordPath;
        return this;
    }
    public String getRecordPath() {
        return this.recordPath;
    }

    public EditTaskShrinkRequest setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }
    public Long getRepeatCount() {
        return this.repeatCount;
    }

    public EditTaskShrinkRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public EditTaskShrinkRequest setRepeatReasonShrink(String repeatReasonShrink) {
        this.repeatReasonShrink = repeatReasonShrink;
        return this;
    }
    public String getRepeatReasonShrink() {
        return this.repeatReasonShrink;
    }

    public EditTaskShrinkRequest setRepeatTimesShrink(String repeatTimesShrink) {
        this.repeatTimesShrink = repeatTimesShrink;
        return this;
    }
    public String getRepeatTimesShrink() {
        return this.repeatTimesShrink;
    }

    public EditTaskShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EditTaskShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EditTaskShrinkRequest setSendSmsPlanShrink(String sendSmsPlanShrink) {
        this.sendSmsPlanShrink = sendSmsPlanShrink;
        return this;
    }
    public String getSendSmsPlanShrink() {
        return this.sendSmsPlanShrink;
    }

    public EditTaskShrinkRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public EditTaskShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public EditTaskShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public EditTaskShrinkRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}

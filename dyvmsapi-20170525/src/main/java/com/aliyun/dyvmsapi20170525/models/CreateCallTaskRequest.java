// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCallTaskRequest extends TeaModel {
    /**
     * <p>The type of the task template. Valid values:</p>
     * <br>
     * <p>*   **VMS_VOICE_TTS**: the text-to-speech (TTS) notification template.</p>
     * <p>*   **VMS_VOICE_CODE**: the voice notification template.</p>
     * <p>*   **VMS_TTS**: the voice verification code template.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The called numbers.</p>
     * <br>
     * <p>*   If you set DataType to LIST, the value of Data is in the LIST format.</p>
     * <p>*   If you set DataType to JSON, the value of Data is in the JSON format.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The type of called numbers. Valid values:</p>
     * <br>
     * <p>*   **LIST**: the called numbers that are separated by commas (,).</p>
     * <p>*   **JSON**: a JSON-formatted list of called numbers with template parameters.</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("FireTime")
    public String fireTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The calling number. Only virtual numbers are supported.</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the calling number. Set the value to **LIST**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("StopTime")
    public String stopTime;

    /**
     * <p>The task name.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The template ID.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTaskRequest self = new CreateCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCallTaskRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateCallTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateCallTaskRequest setFireTime(String fireTime) {
        this.fireTime = fireTime;
        return this;
    }
    public String getFireTime() {
        return this.fireTime;
    }

    public CreateCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCallTaskRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCallTaskRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateCallTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateCallTaskRequest setStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public String getStopTime() {
        return this.stopTime;
    }

    public CreateCallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateCallTaskRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateCallTaskRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

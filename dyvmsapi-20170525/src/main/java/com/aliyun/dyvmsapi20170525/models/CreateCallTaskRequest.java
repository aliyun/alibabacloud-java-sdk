// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCallTaskRequest extends TeaModel {
    /**
     * <p>The type of the task template. Valid values:</p>
     * <ul>
     * <li><strong>VMS_VOICE_TTS</strong>: the text-to-speech (TTS) notification template.</li>
     * <li><strong>VMS_VOICE_CODE</strong>: the voice notification template.</li>
     * <li><strong>VMS_TTS</strong>: the voice verification code template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VMS_VOICE_TTS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The called numbers.</p>
     * <ul>
     * <li>If you set DataType to LIST, the value of Data is in the LIST format.</li>
     * <li>If you set DataType to JSON, the value of Data is in the JSON format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;paramNames&quot;:[&quot;name1&quot;,&quot;name2&quot;,&quot;key3&quot;], &quot;calleeList&quot;:[ { &quot;callee&quot;:&quot;131222222&quot;, &quot;params&quot;:[&quot;zangsan&quot;,&quot;zhangsan01&quot;,&quot;zhangsan02&quot;] }, { &quot;callee&quot;:&quot;131222222&quot;, &quot;params&quot;:[&quot;zangsan&quot;,&quot;zhangsan01&quot;,&quot;zhangsan02&quot;] }, ] }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The type of called numbers. Valid values:</p>
     * <ul>
     * <li><strong>LIST</strong>: the called numbers that are separated by commas (,).</li>
     * <li><strong>JSON</strong>: a JSON-formatted list of called numbers with template parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FireTime")
    public String fireTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The calling number. Only virtual numbers are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>05516214****</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the calling number. Set the value to <strong>LIST</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>LIST</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>This parameter is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StopTime")
    public String stopTime;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TTS_2122****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Template</p>
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

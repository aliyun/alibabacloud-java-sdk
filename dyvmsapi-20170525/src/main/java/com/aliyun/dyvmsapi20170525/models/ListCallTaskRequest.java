// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskRequest extends TeaModel {
    /**
     * <p>The type of the task template. Valid values:</p>
     * <ul>
     * <li><strong>VMS_VOICE_TTS</strong>: the text-to-speech (TTS) notification template.</li>
     * <li><strong>VMS_VOICE_CODE</strong>: the voice notification template.</li>
     * <li><strong>VMS_TTS</strong>: the voice verification code template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VMS_VOICE_CODE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task state. Valid values:</p>
     * <ul>
     * <li><strong>INIT</strong>: The task is in the initial state.</li>
     * <li><strong>RELEASE</strong>: The task is being parsed.</li>
     * <li><strong>RUNNING</strong>: The task is running.</li>
     * <li><strong>STOP</strong>: The task is suspended.</li>
     * <li><strong>SYSTEM_STOP</strong>: The task is suspended by the system.</li>
     * <li><strong>CANCEL</strong>: The task is canceled.</li>
     * <li><strong>SYSTEM_CANCEL</strong>: The task is canceled by the system.</li>
     * <li><strong>DONE</strong>: The task is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DONE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>151001****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskRequest self = new ListCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListCallTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCallTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCallTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCallTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListCallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListCallTaskRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

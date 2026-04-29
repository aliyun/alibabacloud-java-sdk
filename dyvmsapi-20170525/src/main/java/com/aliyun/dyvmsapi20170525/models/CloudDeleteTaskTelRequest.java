// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteTaskTelRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>批次Id</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>批次名称；按照名称删除会删除最近添加的批次</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>号码状态；0:未呼叫 1:已呼叫</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>任务Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>电话号码；支持多个，多个号码用英文逗号&quot;,&quot;分隔；任务在运行中，号码也会被删除，最多支持10W个号码；支持加密号码删除，加密号码传参时需URL Encode</p>
     * 
     * <strong>example:</strong>
     * <p>18360957135</p>
     */
    @NameInMap("Tels")
    public String tels;

    public static CloudDeleteTaskTelRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteTaskTelRequest self = new CloudDeleteTaskTelRequest();
        return TeaModel.build(map, self);
    }

    public CloudDeleteTaskTelRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudDeleteTaskTelRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public CloudDeleteTaskTelRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CloudDeleteTaskTelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudDeleteTaskTelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudDeleteTaskTelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudDeleteTaskTelRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudDeleteTaskTelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CloudDeleteTaskTelRequest setTels(String tels) {
        this.tels = tels;
        return this;
    }
    public String getTels() {
        return this.tels;
    }

}

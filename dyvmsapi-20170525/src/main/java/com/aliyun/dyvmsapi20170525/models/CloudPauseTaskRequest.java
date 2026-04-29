// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudPauseTaskRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>暂停时长；默认0</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PauseDuration")
    public Long pauseDuration;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>外呼任务id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static CloudPauseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudPauseTaskRequest self = new CloudPauseTaskRequest();
        return TeaModel.build(map, self);
    }

    public CloudPauseTaskRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudPauseTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudPauseTaskRequest setPauseDuration(Long pauseDuration) {
        this.pauseDuration = pauseDuration;
        return this;
    }
    public Long getPauseDuration() {
        return this.pauseDuration;
    }

    public CloudPauseTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudPauseTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudPauseTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

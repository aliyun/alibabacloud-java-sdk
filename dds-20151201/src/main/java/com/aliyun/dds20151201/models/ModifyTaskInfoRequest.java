// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    @NameInMap("ActionParams")
    public String actionParams;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StepName")
    public String stepName;

    @NameInMap("TaskAction")
    public String taskAction;

    @NameInMap("TaskId")
    public String taskId;

    public static ModifyTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskInfoRequest self = new ModifyTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTaskInfoRequest setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public ModifyTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTaskInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTaskInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTaskInfoRequest setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public ModifyTaskInfoRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public ModifyTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

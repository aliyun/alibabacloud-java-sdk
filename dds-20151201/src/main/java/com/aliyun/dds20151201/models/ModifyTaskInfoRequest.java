// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    /**
     * <p>The parameters related to the action. These parameters can be extended based on business requirements. Different values must be passed for different taskAction names.</p>
     * <blockquote>
     * <p>When TaskAction is set to modifySwitchTime, this parameter is required. It must be a JSON string that contains the recoverMode key. Valid values for recoverMode: immediate, maintainTime, and timePoint.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;recoverMode\&quot;:\&quot;immediate\&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the step visible to the current user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec_task</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The name of the operation. The value is the action name corresponding to the status in the actionInfo obtained from the <a href="https://help.aliyun.com/document_detail/2639186.html">DescribeHistoryTasks</a> operation.</p>
     * <blockquote>
     * <p>Valid values: retry, cancel, and modifySwitchTime.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modifySwitchTime</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The task ID. Separate multiple IDs with commas (,). You can specify up to 10 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hlpdrw3uxxxx</p>
     */
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

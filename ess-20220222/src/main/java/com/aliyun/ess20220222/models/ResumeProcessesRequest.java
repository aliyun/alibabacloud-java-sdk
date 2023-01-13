// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ResumeProcessesRequest extends TeaModel {
    /**
     * <p>Details of the processes that you want to resume.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the process that you want to resume. Valid values:</p>
     * <br>
     * <p>*   ScaleIn</p>
     * <p>*   ScaleOut</p>
     * <p>*   HealthCheck</p>
     * <p>*   AlarmNotification</p>
     * <p>*   ScheduledAction</p>
     * <br>
     * <p>You can resume five processes of the preceding types at the same time. If you try to resume more than five processes at the same time, Auto Scaling automatically removes the duplicate processes.</p>
     */
    @NameInMap("Processes")
    public java.util.List<String> processes;

    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ResumeProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeProcessesRequest self = new ResumeProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ResumeProcessesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResumeProcessesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResumeProcessesRequest setProcesses(java.util.List<String> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<String> getProcesses() {
        return this.processes;
    }

    public ResumeProcessesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResumeProcessesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResumeProcessesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}

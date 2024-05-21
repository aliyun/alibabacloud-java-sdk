// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SuspendProcessesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/25965.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The types of the processes that you want to suspend. Valid values:</p>
     * <br>
     * <p>*   scalein: the scale-in process.</p>
     * <p>*   scaleout: the scale-out process.</p>
     * <p>*   healthcheck: the health check process.</p>
     * <p>*   alarmnotification: the process of executing an event-triggered task.</p>
     * <p>*   scheduledaction: the process of executing a scheduled task.</p>
     * <br>
     * <p>Presently, Auto Scaling supports suspending the five mentioned process types. In cases where more than five types are specified, Auto Scaling will automatically disregard duplicates and proceed with suspending the unique process types.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Processes")
    public java.util.List<String> processes;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static SuspendProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendProcessesRequest self = new SuspendProcessesRequest();
        return TeaModel.build(map, self);
    }

    public SuspendProcessesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SuspendProcessesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SuspendProcessesRequest setProcesses(java.util.List<String> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<String> getProcesses() {
        return this.processes;
    }

    public SuspendProcessesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SuspendProcessesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SuspendProcessesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}

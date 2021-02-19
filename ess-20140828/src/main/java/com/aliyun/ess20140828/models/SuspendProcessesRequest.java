// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SuspendProcessesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Process")
    public java.util.List<String> process;

    public static SuspendProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendProcessesRequest self = new SuspendProcessesRequest();
        return TeaModel.build(map, self);
    }

    public SuspendProcessesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public SuspendProcessesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SuspendProcessesRequest setProcess(java.util.List<String> process) {
        this.process = process;
        return this;
    }
    public java.util.List<String> getProcess() {
        return this.process;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ResumeProcessesRequest extends TeaModel {
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

    public static ResumeProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeProcessesRequest self = new ResumeProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ResumeProcessesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ResumeProcessesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResumeProcessesRequest setProcess(java.util.List<String> process) {
        this.process = process;
        return this;
    }
    public java.util.List<String> getProcess() {
        return this.process;
    }

}

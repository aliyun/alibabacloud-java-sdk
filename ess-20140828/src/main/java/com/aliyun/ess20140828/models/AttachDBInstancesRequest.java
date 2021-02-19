// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachDBInstancesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstance")
    public java.util.List<String> DBInstance;

    public static AttachDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDBInstancesRequest self = new AttachDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachDBInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachDBInstancesRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachDBInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachDBInstancesRequest setDBInstance(java.util.List<String> DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public java.util.List<String> getDBInstance() {
        return this.DBInstance;
    }

}

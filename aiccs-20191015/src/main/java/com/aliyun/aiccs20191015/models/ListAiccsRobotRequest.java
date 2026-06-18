// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAiccsRobotRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The robot name. You can view the robot name in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>测试机器人</p>
     */
    @NameInMap("RobotName")
    public String robotName;

    public static ListAiccsRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiccsRobotRequest self = new ListAiccsRobotRequest();
        return TeaModel.build(map, self);
    }

    public ListAiccsRobotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAiccsRobotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAiccsRobotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListAiccsRobotRequest setRobotName(String robotName) {
        this.robotName = robotName;
        return this;
    }
    public String getRobotName() {
        return this.robotName;
    }

}

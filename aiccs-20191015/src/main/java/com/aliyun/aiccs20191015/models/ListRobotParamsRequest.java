// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotParamsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Robot ID, which is also the script ID. You can view it on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface or obtain it by using the <a href="https://help.aliyun.com/document_detail/2717998.html">ListAiccsRobot</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("RobotId")
    public Long robotId;

    public static ListRobotParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRobotParamsRequest self = new ListRobotParamsRequest();
        return TeaModel.build(map, self);
    }

    public ListRobotParamsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRobotParamsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListRobotParamsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListRobotParamsRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

}

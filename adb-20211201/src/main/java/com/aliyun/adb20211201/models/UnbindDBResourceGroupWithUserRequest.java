// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UnbindDBResourceGroupWithUserRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("GroupUser")
    public String groupUser;

    public static UnbindDBResourceGroupWithUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourceGroupWithUserRequest self = new UnbindDBResourceGroupWithUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourceGroupWithUserRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UnbindDBResourceGroupWithUserRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UnbindDBResourceGroupWithUserRequest setGroupUser(String groupUser) {
        this.groupUser = groupUser;
        return this;
    }
    public String getGroupUser() {
        return this.groupUser;
    }

}

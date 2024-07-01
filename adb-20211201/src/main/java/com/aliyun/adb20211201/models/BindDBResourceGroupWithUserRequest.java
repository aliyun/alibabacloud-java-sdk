// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindDBResourceGroupWithUserRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The name of the database account. It can be a standard account or a privileged account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accout</p>
     */
    @NameInMap("GroupUser")
    public String groupUser;

    public static BindDBResourceGroupWithUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourceGroupWithUserRequest self = new BindDBResourceGroupWithUserRequest();
        return TeaModel.build(map, self);
    }

    public BindDBResourceGroupWithUserRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindDBResourceGroupWithUserRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public BindDBResourceGroupWithUserRequest setGroupUser(String groupUser) {
        this.groupUser = groupUser;
        return this;
    }
    public String getGroupUser() {
        return this.groupUser;
    }

}

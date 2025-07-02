// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewGroupName")
    public String newGroupName;

    public static ModifyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupRequest self = new ModifyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }
    public String getNewGroupName() {
        return this.newGroupName;
    }

}

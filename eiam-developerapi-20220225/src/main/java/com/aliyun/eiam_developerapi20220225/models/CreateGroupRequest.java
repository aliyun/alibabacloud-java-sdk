// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>group_2bo6lefcewdausyyxxxx</p>
     */
    @NameInMap("groupExternalId")
    public String groupExternalId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("groupName")
    public String groupName;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setGroupExternalId(String groupExternalId) {
        this.groupExternalId = groupExternalId;
        return this;
    }
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    public CreateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

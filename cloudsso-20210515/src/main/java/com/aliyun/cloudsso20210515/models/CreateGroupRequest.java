// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>The description of the user group.</p>
     * <p>Length: The description can be up to 1024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The name of the user group.</p>
     * <p>Format: The name can contain letters, digits, and the special characters <code>_-.</code>.</p>
     * <p>Length: The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

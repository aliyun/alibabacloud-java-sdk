// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * <br>
     * <p>The value can be up to 128 characters in length.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The display name of the RAM user group.</p>
     * <br>
     * <p>The name can be up to 24 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The name of the RAM user group. You must specify this parameter.</p>
     * <br>
     * <p>The name can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

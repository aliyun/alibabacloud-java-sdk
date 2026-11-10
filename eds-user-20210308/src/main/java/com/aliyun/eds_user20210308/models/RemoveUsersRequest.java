// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveUsersRequest extends TeaModel {
    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Specifies whether to automatically revoke cloud desktop authorization before deleting convenience users. Valid values:</p>
     * <ul>
     * <li>true: Asynchronously revokes cloud desktop authorization and deletes convenience users. The API returns the task acceptance result.</li>
     * <li>false (default): Synchronously deletes convenience users without automatically revoking cloud desktop authorization. If associated resources prevent deletion, a deletion failure is returned.</li>
     * </ul>
     * <p>When this parameter is set to true, the caller must also have the ecd:ModifyUserEntitlement permission. Task acceptance does not mean that the convenience users have been deleted.</p>
     */
    @NameInMap("UnbindDesktops")
    public Boolean unbindDesktops;

    /**
     * <p>The list of usernames of the convenience users to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static RemoveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersRequest self = new RemoveUsersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public RemoveUsersRequest setUnbindDesktops(Boolean unbindDesktops) {
        this.unbindDesktops = unbindDesktops;
        return this;
    }
    public Boolean getUnbindDesktops() {
        return this.unbindDesktops;
    }

    public RemoveUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}

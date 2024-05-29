// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUserFromOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The organization IDs. You can remove an account from a maximum of 100 organizations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The account ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RemoveUserFromOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromOrganizationalUnitsRequest self = new RemoveUserFromOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUserFromOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public RemoveUserFromOrganizationalUnitsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

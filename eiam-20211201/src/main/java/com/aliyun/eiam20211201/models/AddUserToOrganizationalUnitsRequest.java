// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The organization IDs. You can add an account to a maximum of 100 organizations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddUserToOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToOrganizationalUnitsRequest self = new AddUserToOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUserToOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public AddUserToOrganizationalUnitsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

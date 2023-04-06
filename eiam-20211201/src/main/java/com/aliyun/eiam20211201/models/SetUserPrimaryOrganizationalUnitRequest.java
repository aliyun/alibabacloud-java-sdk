// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetUserPrimaryOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>主组织ID</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>账户ID</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static SetUserPrimaryOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserPrimaryOrganizationalUnitRequest self = new SetUserPrimaryOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public SetUserPrimaryOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetUserPrimaryOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public SetUserPrimaryOrganizationalUnitRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

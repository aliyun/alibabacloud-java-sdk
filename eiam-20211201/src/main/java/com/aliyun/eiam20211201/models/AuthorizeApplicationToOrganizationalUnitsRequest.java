// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The ID of the application on which you want to grant permissions.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the organizations to which you want to grant permissions. You can grant permissions to a maximum of 100 organizations at a time.</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static AuthorizeApplicationToOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToOrganizationalUnitsRequest self = new AuthorizeApplicationToOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToOrganizationalUnitsRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 被授权的组织ID的列表，必填，列表中最多包含100个元素。
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

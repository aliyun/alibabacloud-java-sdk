// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromOrganizationalUnitsRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 被取消授权的组织ID列表，必填，列表中最多包含100个元素。
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static RevokeApplicationFromOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromOrganizationalUnitsRequest self = new RevokeApplicationFromOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromOrganizationalUnitsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RevokeApplicationFromOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeApplicationFromOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}

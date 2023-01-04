// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningScopeRequest extends TeaModel {
    // IDaaS的应用主键id
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM的实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 授权同步出的组织机构列表
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static SetApplicationProvisioningScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningScopeRequest self = new SetApplicationProvisioningScopeRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningScopeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationProvisioningScopeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetApplicationProvisioningScopeRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}

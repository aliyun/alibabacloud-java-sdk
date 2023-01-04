// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitRequest extends TeaModel {
    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 机构Id
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    public static GetOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitRequest self = new GetOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

}

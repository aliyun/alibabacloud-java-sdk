// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetRootOrganizationalUnitRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRootOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRootOrganizationalUnitRequest self = new GetRootOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public GetRootOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

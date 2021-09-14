// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleRequest self = new GetServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetTrailStatusRequest extends TeaModel {
    @NameInMap("IsOrganizationTrail")
    public Boolean isOrganizationTrail;

    @NameInMap("Name")
    public String name;

    public static GetTrailStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusRequest self = new GetTrailStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusRequest setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
        return this;
    }
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    public GetTrailStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

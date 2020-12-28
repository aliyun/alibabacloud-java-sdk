// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class GetTrailStatusRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("IsOrganizationTrail")
    public Boolean isOrganizationTrail;

    public static GetTrailStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusRequest self = new GetTrailStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTrailStatusRequest setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
        return this;
    }
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

}

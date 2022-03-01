// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationMembersRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationMembersRequest self = new DescribeFabricOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationMembersRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationMembersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

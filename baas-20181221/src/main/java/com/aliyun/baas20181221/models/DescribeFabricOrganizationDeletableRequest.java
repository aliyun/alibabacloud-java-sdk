// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationDeletableRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Location")
    public String location;

    public static DescribeFabricOrganizationDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationDeletableRequest self = new DescribeFabricOrganizationDeletableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationDeletableRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeFabricOrganizationDeletableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}

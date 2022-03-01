// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationDeletableRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationDeletableRequest self = new DescribeFabricOrganizationDeletableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationDeletableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationDeletableRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationPeersRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationPeersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationPeersRequest self = new DescribeFabricOrganizationPeersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationPeersRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationPeersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChannelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChannelsRequest self = new DescribeFabricOrganizationChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChannelsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationChannelsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

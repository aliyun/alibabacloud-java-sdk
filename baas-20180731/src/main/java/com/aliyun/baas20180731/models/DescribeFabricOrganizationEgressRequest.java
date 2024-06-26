// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationEgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationEgressRequest self = new DescribeFabricOrganizationEgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationEgressRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

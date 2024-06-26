// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricJoinRequestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricJoinRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricJoinRequestRequest self = new DescribeFabricJoinRequestRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricJoinRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

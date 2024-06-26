// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationChaincodesRequest extends TeaModel {
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
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeOrganizationChaincodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationChaincodesRequest self = new DescribeOrganizationChaincodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationChaincodesRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeOrganizationChaincodesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

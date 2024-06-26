// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrgnaizationChaincodesRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeOrgnaizationChaincodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgnaizationChaincodesRequest self = new DescribeOrgnaizationChaincodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgnaizationChaincodesRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeOrgnaizationChaincodesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

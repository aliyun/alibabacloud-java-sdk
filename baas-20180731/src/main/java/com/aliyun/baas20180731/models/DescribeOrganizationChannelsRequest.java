// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationChannelsRequest extends TeaModel {
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

    public static DescribeOrganizationChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationChannelsRequest self = new DescribeOrganizationChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationChannelsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeOrganizationChannelsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

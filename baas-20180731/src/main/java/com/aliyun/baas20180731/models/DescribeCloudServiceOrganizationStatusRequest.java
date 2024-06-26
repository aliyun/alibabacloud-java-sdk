// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceOrganizationStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeCloudServiceOrganizationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceOrganizationStatusRequest self = new DescribeCloudServiceOrganizationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceOrganizationStatusRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

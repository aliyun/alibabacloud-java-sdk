// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceTypeStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static DescribeCloudServiceTypeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceTypeStatusRequest self = new DescribeCloudServiceTypeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceTypeStatusRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeCloudServiceTypeStatusRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}

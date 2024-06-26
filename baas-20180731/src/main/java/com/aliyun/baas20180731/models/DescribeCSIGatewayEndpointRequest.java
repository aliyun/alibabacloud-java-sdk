// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCSIGatewayEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeCSIGatewayEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSIGatewayEndpointRequest self = new DescribeCSIGatewayEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCSIGatewayEndpointRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

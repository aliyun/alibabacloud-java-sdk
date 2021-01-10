// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeApiGatewayAppSecurityRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("GatewayAppId")
    public String gatewayAppId;

    public static DescribeApiGatewayAppSecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGatewayAppSecurityRequest self = new DescribeApiGatewayAppSecurityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGatewayAppSecurityRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeApiGatewayAppSecurityRequest setGatewayAppId(String gatewayAppId) {
        this.gatewayAppId = gatewayAppId;
        return this;
    }
    public String getGatewayAppId() {
        return this.gatewayAppId;
    }

}

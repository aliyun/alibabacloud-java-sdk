// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateApiGatewayAppStatusRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("GatewayAppId")
    public String gatewayAppId;

    @NameInMap("Status")
    public Integer status;

    public static UpdateApiGatewayAppStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiGatewayAppStatusRequest self = new UpdateApiGatewayAppStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiGatewayAppStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateApiGatewayAppStatusRequest setGatewayAppId(String gatewayAppId) {
        this.gatewayAppId = gatewayAppId;
        return this;
    }
    public String getGatewayAppId() {
        return this.gatewayAppId;
    }

    public UpdateApiGatewayAppStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

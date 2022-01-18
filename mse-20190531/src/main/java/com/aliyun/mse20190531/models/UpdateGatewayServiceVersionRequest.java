// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceVersionRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static UpdateGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceVersionRequest self = new UpdateGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceVersionRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceVersionRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public UpdateGatewayServiceVersionRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}

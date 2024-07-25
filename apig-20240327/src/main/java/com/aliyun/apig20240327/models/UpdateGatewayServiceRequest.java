// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceRequest extends TeaModel {
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    public static UpdateGatewayServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceRequest self = new UpdateGatewayServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdateGatewayServiceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}

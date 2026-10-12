// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cloud-native API gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The ID of the HTTP API.</p>
     * 
     * <strong>example:</strong>
     * <p>api-123456</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    public static GetApiPathFieldConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldConfigRequest self = new GetApiPathFieldConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldConfigRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GetApiPathFieldConfigRequest setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

}

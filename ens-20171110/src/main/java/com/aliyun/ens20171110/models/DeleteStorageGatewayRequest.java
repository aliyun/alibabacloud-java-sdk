// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageGatewayRequest extends TeaModel {
    /**
     * <p>The ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgw-****</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    public static DeleteStorageGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageGatewayRequest self = new DeleteStorageGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStorageGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}

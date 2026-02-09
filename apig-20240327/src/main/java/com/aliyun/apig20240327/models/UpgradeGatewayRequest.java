// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpgradeGatewayRequest extends TeaModel {
    /**
     * <p>The destination instance version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.2</p>
     */
    @NameInMap("version")
    public String version;

    public static UpgradeGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeGatewayRequest self = new UpgradeGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeGatewayRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

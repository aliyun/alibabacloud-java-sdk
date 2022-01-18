// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSSLCertRequest extends TeaModel {
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static ListSSLCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSSLCertRequest self = new ListSSLCertRequest();
        return TeaModel.build(map, self);
    }

    public ListSSLCertRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}

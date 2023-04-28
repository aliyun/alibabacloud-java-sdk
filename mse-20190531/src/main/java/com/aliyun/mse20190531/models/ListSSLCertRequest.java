// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSSLCertRequest extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The expiration time.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static ListSSLCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSSLCertRequest self = new ListSSLCertRequest();
        return TeaModel.build(map, self);
    }

    public ListSSLCertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListSSLCertRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    public static GetKubernetesSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesSourceRequest self = new GetKubernetesSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetKubernetesSourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetKubernetesSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetKubernetesSourceRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

}

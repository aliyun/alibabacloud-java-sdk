// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies the type of the returned service source. If this parameter is not specified, service sources of all types are returned. Valid values:</p>
     * <br>
     * <p>*   K8S</p>
     * <p>*   MSE</p>
     * <p>*   MSE_ZK</p>
     * <p>*   SAE</p>
     * <p>*   EDAS</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSourceRequest self = new ListServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceSourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListServiceSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ListServiceSourceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

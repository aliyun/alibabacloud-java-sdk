// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c51a15c7ee934a4fb945ccf35fe1****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies the type of the returned service source. If this parameter is not specified, service sources of all types are returned. Valid values:</p>
     * <ul>
     * <li>K8s</li>
     * <li>MSE</li>
     * <li>MSE_ZK</li>
     * <li>SAE</li>
     * <li>EDAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE</p>
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

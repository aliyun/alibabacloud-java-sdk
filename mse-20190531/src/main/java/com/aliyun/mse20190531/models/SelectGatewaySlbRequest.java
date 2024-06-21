// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class SelectGatewaySlbRequest extends TeaModel {
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
     * <p>gw-492af9b04bb4474cae9d645be850****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test-slb</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PUB_NET</p>
     */
    @NameInMap("Type")
    public String type;

    public static SelectGatewaySlbRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectGatewaySlbRequest self = new SelectGatewaySlbRequest();
        return TeaModel.build(map, self);
    }

    public SelectGatewaySlbRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public SelectGatewaySlbRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public SelectGatewaySlbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SelectGatewaySlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

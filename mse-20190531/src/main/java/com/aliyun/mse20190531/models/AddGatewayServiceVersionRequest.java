// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayServiceVersionRequest extends TeaModel {
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
     * <p>gw-913a49bab6c5461187a3305fb8da****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;:\&quot;v1\&quot;,\&quot;labels\&quot;:[{\&quot;key\&quot;:\&quot;version\&quot;,\&quot;value\&quot;:\&quot;v1\&quot;}]}</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static AddGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayServiceVersionRequest self = new AddGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayServiceVersionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayServiceVersionRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayServiceVersionRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public AddGatewayServiceVersionRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}

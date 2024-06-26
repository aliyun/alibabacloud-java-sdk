// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceVersionRequest extends TeaModel {
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
     * <p>gw-eccf313e2224438ba53d95d039e5****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>575</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;:\&quot;v3\&quot;,\&quot;labels\&quot;:[{\&quot;key\&quot;:\&quot;version\&quot;,\&quot;value\&quot;:\&quot;v3\&quot;}]}</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static UpdateGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceVersionRequest self = new UpdateGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceVersionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceVersionRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceVersionRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public UpdateGatewayServiceVersionRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}

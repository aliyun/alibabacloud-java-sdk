// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayServiceVersionRequest extends TeaModel {
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
     * <p>gw-b6988bd16920479d9104e1729f97****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>777</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;:\&quot;app\&quot;,\&quot;labels\&quot;:[{\&quot;key\&quot;:\&quot;app\&quot;,\&quot;value\&quot;:\&quot;demo-server\&quot;}]}</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static DeleteGatewayServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayServiceVersionRequest self = new DeleteGatewayServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayServiceVersionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteGatewayServiceVersionRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteGatewayServiceVersionRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeleteGatewayServiceVersionRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}

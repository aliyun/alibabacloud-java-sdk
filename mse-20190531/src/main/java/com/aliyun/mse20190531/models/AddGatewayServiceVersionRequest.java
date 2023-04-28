// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayServiceVersionRequest extends TeaModel {
    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    /**
     * <p>duplicatedClusterAliasName</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceCheckShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Check")
    public Boolean check;

    @NameInMap("ExpectedStatuses")
    public String expectedStatusesShrink;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("HttpHost")
    public String httpHost;

    @NameInMap("HttpPath")
    public String httpPath;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static UpdateGatewayServiceCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceCheckShrinkRequest self = new UpdateGatewayServiceCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceCheckShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceCheckShrinkRequest setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public UpdateGatewayServiceCheckShrinkRequest setExpectedStatusesShrink(String expectedStatusesShrink) {
        this.expectedStatusesShrink = expectedStatusesShrink;
        return this;
    }
    public String getExpectedStatusesShrink() {
        return this.expectedStatusesShrink;
    }

    public UpdateGatewayServiceCheckShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceCheckShrinkRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UpdateGatewayServiceCheckShrinkRequest setHttpHost(String httpHost) {
        this.httpHost = httpHost;
        return this;
    }
    public String getHttpHost() {
        return this.httpHost;
    }

    public UpdateGatewayServiceCheckShrinkRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public UpdateGatewayServiceCheckShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateGatewayServiceCheckShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateGatewayServiceCheckShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateGatewayServiceCheckShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateGatewayServiceCheckShrinkRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceCheckRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable the health check.</p>
     */
    @NameInMap("Check")
    public Boolean check;

    /**
     * <p>The expected status code, which is required if the health check protocol is HTTP.</p>
     */
    @NameInMap("ExpectedStatuses")
    public java.util.List<Integer> expectedStatuses;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The healthy threshold of the health check.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The health check domain name, which is optional if the health check protocol is HTTP.</p>
     */
    @NameInMap("HttpHost")
    public String httpHost;

    /**
     * <p>The health check path, which is required if the health check protocol is HTTP.</p>
     */
    @NameInMap("HttpPath")
    public String httpPath;

    /**
     * <p>The interval at which the health check is performed.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The health check protocol. Valid values:</p>
     * <br>
     * <p>*   HTTP</p>
     * <p>*   TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the service.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The timeout period of responses to the health check. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The unhealthy threshold of the health check.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static UpdateGatewayServiceCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceCheckRequest self = new UpdateGatewayServiceCheckRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceCheckRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceCheckRequest setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public UpdateGatewayServiceCheckRequest setExpectedStatuses(java.util.List<Integer> expectedStatuses) {
        this.expectedStatuses = expectedStatuses;
        return this;
    }
    public java.util.List<Integer> getExpectedStatuses() {
        return this.expectedStatuses;
    }

    public UpdateGatewayServiceCheckRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceCheckRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UpdateGatewayServiceCheckRequest setHttpHost(String httpHost) {
        this.httpHost = httpHost;
        return this;
    }
    public String getHttpHost() {
        return this.httpHost;
    }

    public UpdateGatewayServiceCheckRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public UpdateGatewayServiceCheckRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateGatewayServiceCheckRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateGatewayServiceCheckRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateGatewayServiceCheckRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateGatewayServiceCheckRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}

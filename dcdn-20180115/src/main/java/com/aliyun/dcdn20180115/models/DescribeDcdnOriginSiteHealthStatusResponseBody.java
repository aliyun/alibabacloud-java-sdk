// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOriginSiteHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The information about the origin server of the accelerated domain name.</p>
     */
    @NameInMap("OriginSiteStatus")
    public java.util.List<DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus> originSiteStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnOriginSiteHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOriginSiteHealthStatusResponseBody self = new DescribeDcdnOriginSiteHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOriginSiteHealthStatusResponseBody setOriginSiteStatus(java.util.List<DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus> originSiteStatus) {
        this.originSiteStatus = originSiteStatus;
        return this;
    }
    public java.util.List<DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus> getOriginSiteStatus() {
        return this.originSiteStatus;
    }

    public DescribeDcdnOriginSiteHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus extends TeaModel {
        /**
         * <p>The health status of the origin server. Each point of presence (POP) periodically initiates a probe request to the configured origin domain name. If the POP receives a response from the origin server in 5 seconds, the probe is considered successful. After the probe data for each POP is collected, the health status of the origin server is calculated based on the proportion of successful probes. Valid values:</p>
         * <br>
         * <p>*   unknown: The probe data of the origin server is not obtained because the configurations of the origin server have been changed recently. Try again later.</p>
         * <p>*   healthy: The proportion of successful probes is higher than 80%.</p>
         * <p>*   degraded: The proportion of successful probes is higher than 0% and lower than or equal to 80%.</p>
         * <p>*   critical: All probing requests to the origin server failed.</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The origin domain name that you configured in the DCDN console, which can be an IPv4 address, IPv6 address, common domain name, or Object Storage Service (OSS) domain name.</p>
         */
        @NameInMap("Host")
        public String host;

        public static DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus self = new DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

}

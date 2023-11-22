// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOriginSiteHealthStatusResponseBody extends TeaModel {
    @NameInMap("OriginSiteStatus")
    public java.util.List<DescribeDcdnOriginSiteHealthStatusResponseBodyOriginSiteStatus> originSiteStatus;

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
        @NameInMap("HealthStatus")
        public String healthStatus;

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

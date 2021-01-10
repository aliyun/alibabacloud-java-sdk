// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TrafficDataPerInterval")
    public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeLiveDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTrafficDataResponseBody self = new DescribeLiveDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public DescribeLiveDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TrafficValue")
        public String trafficValue;

        @NameInMap("HttpTrafficValue")
        public String httpTrafficValue;

        @NameInMap("HttpsTrafficValue")
        public String httpsTrafficValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpTrafficValue(String httpTrafficValue) {
            this.httpTrafficValue = httpTrafficValue;
            return this;
        }
        public String getHttpTrafficValue() {
            return this.httpTrafficValue;
        }

        public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsTrafficValue(String httpsTrafficValue) {
            this.httpsTrafficValue = httpsTrafficValue;
            return this;
        }
        public String getHttpsTrafficValue() {
            return this.httpsTrafficValue;
        }

        public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

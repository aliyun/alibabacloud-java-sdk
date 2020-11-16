// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTrafficDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("TrafficDataPerInterval")
    @Validation(required = true)
    public DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeLiveDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTrafficDataResponse self = new DescribeLiveDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTrafficDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainTrafficDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainTrafficDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainTrafficDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainTrafficDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainTrafficDataResponse setTrafficDataPerInterval(DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("TrafficValue")
        @Validation(required = true)
        public String trafficValue;

        @NameInMap("HttpTrafficValue")
        @Validation(required = true)
        public String httpTrafficValue;

        @NameInMap("HttpsTrafficValue")
        @Validation(required = true)
        public String httpsTrafficValue;

        public static DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule self = new DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule setHttpTrafficValue(String httpTrafficValue) {
            this.httpTrafficValue = httpTrafficValue;
            return this;
        }
        public String getHttpTrafficValue() {
            return this.httpTrafficValue;
        }

        public DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule setHttpsTrafficValue(String httpsTrafficValue) {
            this.httpsTrafficValue = httpsTrafficValue;
            return this;
        }
        public String getHttpsTrafficValue() {
            return this.httpsTrafficValue;
        }

    }

    public static class DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval self = new DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTrafficDataResponseTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainTrafficDataResponseTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    public DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeLiveDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataResponseBody self = new DescribeLiveDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainBpsDataResponseBody setBpsDataPerInterval(DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpsBpsValue")
        public String httpsBpsValue;

        @NameInMap("BpsValue")
        public String bpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("HttpBpsValue")
        public String httpBpsValue;

        public static DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsBpsValue(String httpsBpsValue) {
            this.httpsBpsValue = httpsBpsValue;
            return this;
        }
        public String getHttpsBpsValue() {
            return this.httpsBpsValue;
        }

        public DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setBpsValue(String bpsValue) {
            this.bpsValue = bpsValue;
            return this;
        }
        public String getBpsValue() {
            return this.bpsValue;
        }

        public DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpBpsValue(String httpBpsValue) {
            this.httpBpsValue = httpBpsValue;
            return this;
        }
        public String getHttpBpsValue() {
            return this.httpBpsValue;
        }

    }

    public static class DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

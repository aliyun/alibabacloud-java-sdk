// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcBpsDataResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    // 
    // The time granularity varies with the time range to query. Supported values: 60 (1 minute), 300 (5 minutes), and 3600(1 hour). For more information, see **Usage notes**.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query.
    @NameInMap("EndTime")
    public String endTime;

    // The back-to-origin bandwidth information at each interval.
    @NameInMap("RealTimeSrcBpsDataPerInterval")
    public DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval realTimeSrcBpsDataPerInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range to query.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeSrcBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcBpsDataResponseBody self = new DescribeDomainRealTimeSrcBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setRealTimeSrcBpsDataPerInterval(DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval realTimeSrcBpsDataPerInterval) {
        this.realTimeSrcBpsDataPerInterval = realTimeSrcBpsDataPerInterval;
        return this;
    }
    public DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval getRealTimeSrcBpsDataPerInterval() {
        return this.realTimeSrcBpsDataPerInterval;
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealTimeSrcBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule extends TeaModel {
        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The bandwidth during back-to-origin routing. Unit: bit/s.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule self = new DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval self = new DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval setDataModule(java.util.List<DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

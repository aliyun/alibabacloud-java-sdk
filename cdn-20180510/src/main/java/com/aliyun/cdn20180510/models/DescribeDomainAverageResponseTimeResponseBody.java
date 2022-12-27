// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainAverageResponseTimeResponseBody extends TeaModel {
    // The average response time collected at each time interval.
    @NameInMap("AvgRTPerInterval")
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval;

    // The time interval between the data entries returned.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range during which data was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range during which data was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainAverageResponseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAverageResponseTimeResponseBody self = new DescribeDomainAverageResponseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAverageResponseTimeResponseBody setAvgRTPerInterval(DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval) {
        this.avgRTPerInterval = avgRTPerInterval;
        return this;
    }
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval getAvgRTPerInterval() {
        return this.avgRTPerInterval;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainAverageResponseTimeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainAverageResponseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAverageResponseTimeResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule extends TeaModel {
        // The timestamp of the returned data.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The average response time.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule self = new DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> dataModule;

        public static DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval self = new DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval setDataModule(java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

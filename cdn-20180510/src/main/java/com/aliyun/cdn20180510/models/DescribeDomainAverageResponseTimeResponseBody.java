// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainAverageResponseTimeResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("AvgRTPerInterval")
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval;

    public static DescribeDomainAverageResponseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAverageResponseTimeResponseBody self = new DescribeDomainAverageResponseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAverageResponseTimeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainAverageResponseTimeResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainAverageResponseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainAverageResponseTimeResponseBody setAvgRTPerInterval(DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval) {
        this.avgRTPerInterval = avgRTPerInterval;
        return this;
    }
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval getAvgRTPerInterval() {
        return this.avgRTPerInterval;
    }

    public static class DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule self = new DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * <br>
     * <p>The time granularity varies with the time range to query. Supported values: 60 (1 minute), 300 (5 minutes), and 3600(1 hour). For more information, see the usage notes.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The amount of network traffic at each time interval. Unit: bytes.</p>
     */
    @NameInMap("RealTimeTrafficDataPerInterval")
    public DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeTrafficDataResponseBody self = new DescribeDomainRealTimeTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setRealTimeTrafficDataPerInterval(DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval) {
        this.realTimeTrafficDataPerInterval = realTimeTrafficDataPerInterval;
        return this;
    }
    public DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval getRealTimeTrafficDataPerInterval() {
        return this.realTimeTrafficDataPerInterval;
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealTimeTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The amount of network traffic.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule self = new DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval self = new DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval setDataModule(java.util.List<DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

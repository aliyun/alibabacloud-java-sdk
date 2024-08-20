// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries. Unit: seconds.</p>
     * <p>The time granularity varies with the maximum time range per query. Valid values: 60 (1 minute), 300 (5 minutes), and 3600(1 hour). For more information, see <strong>Usage notes</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The amount of back-to-origin traffic returned at each interval.</p>
     */
    @NameInMap("RealTimeTrafficDataPerInterval")
    public DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A666D44F-19D6-490E-97CF-1A64AB962C57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainRealTimeTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeTrafficDataResponseBody self = new DescribeDcdnDomainRealTimeTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setRealTimeTrafficDataPerInterval(DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval) {
        this.realTimeTrafficDataPerInterval = realTimeTrafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval getRealTimeTrafficDataPerInterval() {
        return this.realTimeTrafficDataPerInterval;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The traffic value at each time interval.</p>
         * <blockquote>
         * <p>The network traffic is measured in bytes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule self = new DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval self = new DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

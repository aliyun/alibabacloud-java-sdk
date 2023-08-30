// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPvDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
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
     * <p>The number of PVs at each interval.</p>
     */
    @NameInMap("PvDataInterval")
    public DescribeDcdnDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPvDataResponseBody self = new DescribeDcdnDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainPvDataResponseBody setPvDataInterval(DescribeDcdnDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeDcdnDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public DescribeDcdnDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The number of PVs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData self = new DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainPvDataResponseBodyPvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData> usageData;

        public static DescribeDcdnDomainPvDataResponseBodyPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainPvDataResponseBodyPvDataInterval self = new DescribeDcdnDomainPvDataResponseBodyPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainPvDataResponseBodyPvDataInterval setUsageData(java.util.List<DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainPvDataResponseBodyPvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

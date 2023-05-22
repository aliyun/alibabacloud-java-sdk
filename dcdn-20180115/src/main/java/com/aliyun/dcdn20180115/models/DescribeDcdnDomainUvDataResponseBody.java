// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUvDataResponseBody extends TeaModel {
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
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The number of UVs at each interval.</p>
     */
    @NameInMap("UvDataInterval")
    public DescribeDcdnDomainUvDataResponseBodyUvDataInterval uvDataInterval;

    public static DescribeDcdnDomainUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUvDataResponseBody self = new DescribeDcdnDomainUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainUvDataResponseBody setUvDataInterval(DescribeDcdnDomainUvDataResponseBodyUvDataInterval uvDataInterval) {
        this.uvDataInterval = uvDataInterval;
        return this;
    }
    public DescribeDcdnDomainUvDataResponseBodyUvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static class DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The number of UVs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData self = new DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainUvDataResponseBodyUvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData> usageData;

        public static DescribeDcdnDomainUvDataResponseBodyUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainUvDataResponseBodyUvDataInterval self = new DescribeDcdnDomainUvDataResponseBodyUvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainUvDataResponseBodyUvDataInterval setUsageData(java.util.List<DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainUvDataResponseBodyUvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

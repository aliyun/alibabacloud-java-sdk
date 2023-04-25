// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUvDataResponseBody extends TeaModel {
    /**
     * <p>The time interval. Unit: seconds.</p>
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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The number of UVs at each interval.</p>
     */
    @NameInMap("UvDataInterval")
    public DescribeDomainUvDataResponseBodyUvDataInterval uvDataInterval;

    public static DescribeDomainUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUvDataResponseBody self = new DescribeDomainUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainUvDataResponseBody setUvDataInterval(DescribeDomainUvDataResponseBodyUvDataInterval uvDataInterval) {
        this.uvDataInterval = uvDataInterval;
        return this;
    }
    public DescribeDomainUvDataResponseBodyUvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static class DescribeDomainUvDataResponseBodyUvDataIntervalUsageData extends TeaModel {
        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The number of UVs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainUvDataResponseBodyUvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainUvDataResponseBodyUvDataIntervalUsageData self = new DescribeDomainUvDataResponseBodyUvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainUvDataResponseBodyUvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainUvDataResponseBodyUvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainUvDataResponseBodyUvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainUvDataResponseBodyUvDataIntervalUsageData> usageData;

        public static DescribeDomainUvDataResponseBodyUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainUvDataResponseBodyUvDataInterval self = new DescribeDomainUvDataResponseBodyUvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainUvDataResponseBodyUvDataInterval setUsageData(java.util.List<DescribeDomainUvDataResponseBodyUvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainUvDataResponseBodyUvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

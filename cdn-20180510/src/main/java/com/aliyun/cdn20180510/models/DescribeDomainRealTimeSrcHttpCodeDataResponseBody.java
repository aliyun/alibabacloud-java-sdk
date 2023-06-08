// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcHttpCodeDataResponseBody extends TeaModel {
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
     * <p>The proportions of HTTP status codes at each time interval.</p>
     */
    @NameInMap("RealTimeSrcHttpCodeData")
    public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData realTimeSrcHttpCodeData;

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

    public static DescribeDomainRealTimeSrcHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcHttpCodeDataResponseBody self = new DescribeDomainRealTimeSrcHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData realTimeSrcHttpCodeData) {
        this.realTimeSrcHttpCodeData = realTimeSrcHttpCodeData;
        return this;
    }
    public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData getRealTimeSrcHttpCodeData() {
        return this.realTimeSrcHttpCodeData;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData extends TeaModel {
        /**
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The count of each HTTP status code.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The proportion of the HTTP status code.</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        public static DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData self = new DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeSrcCodeProportionData")
        public java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData> realTimeSrcCodeProportionData;

        public static DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue self = new DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue setRealTimeSrcCodeProportionData(java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData> realTimeSrcCodeProportionData) {
            this.realTimeSrcCodeProportionData = realTimeSrcCodeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValueRealTimeSrcCodeProportionData> getRealTimeSrcCodeProportionData() {
            return this.realTimeSrcCodeProportionData;
        }

    }

    public static class DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData extends TeaModel {
        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The proportions of the HTTP status codes.</p>
         */
        @NameInMap("Value")
        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue value;

        public static DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData self = new DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData setValue(DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData> usageData;

        public static DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData self = new DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData setUsageData(java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

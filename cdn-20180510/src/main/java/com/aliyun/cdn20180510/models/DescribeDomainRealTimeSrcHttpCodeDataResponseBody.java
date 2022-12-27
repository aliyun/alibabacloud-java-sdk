// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcHttpCodeDataResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The proportions of HTTP status codes at each time interval.
    @NameInMap("RealTimeSrcHttpCodeData")
    public DescribeDomainRealTimeSrcHttpCodeDataResponseBodyRealTimeSrcHttpCodeData realTimeSrcHttpCodeData;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
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
        // The HTTP status code.
        @NameInMap("Code")
        public String code;

        // The total number of HTTP status codes returned.
        @NameInMap("Count")
        public String count;

        // The proportion of the HTTP status code.
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
        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The proportions of HTTP status codes.
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

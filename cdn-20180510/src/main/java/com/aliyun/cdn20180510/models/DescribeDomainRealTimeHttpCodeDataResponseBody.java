// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RealTimeHttpCodeData")
    public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData;

    public static DescribeDomainRealTimeHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeHttpCodeDataResponseBody self = new DescribeDomainRealTimeHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainRealTimeHttpCodeDataResponseBody setRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData) {
        this.realTimeHttpCodeData = realTimeHttpCodeData;
        return this;
    }
    public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData getRealTimeHttpCodeData() {
        return this.realTimeHttpCodeData;
    }

    public static class DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("Count")
        public String count;

        public static DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData self = new DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

    }

    public static class DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeCodeProportionData")
        public java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData;

        public static DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue self = new DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue setRealTimeCodeProportionData(java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData) {
            this.realTimeCodeProportionData = realTimeCodeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> getRealTimeCodeProportionData() {
            return this.realTimeCodeProportionData;
        }

    }

    public static class DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData extends TeaModel {
        @NameInMap("Value")
        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData self = new DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setValue(DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData;

        public static DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData self = new DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData setUsageData(java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeHttpCodeDataResponseBody extends TeaModel {
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
    public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData;

    public static DescribeLiveDomainRealTimeHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeHttpCodeDataResponseBody self = new DescribeLiveDomainRealTimeHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody setRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData) {
        this.realTimeHttpCodeData = realTimeHttpCodeData;
        return this;
    }
    public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData getRealTimeHttpCodeData() {
        return this.realTimeHttpCodeData;
    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("Count")
        public String count;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeCodeProportionData")
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue self = new DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue setRealTimeCodeProportionData(java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData) {
            this.realTimeCodeProportionData = realTimeCodeProportionData;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> getRealTimeCodeProportionData() {
            return this.realTimeCodeProportionData;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData extends TeaModel {
        @NameInMap("Value")
        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setValue(DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData setUsageData(java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

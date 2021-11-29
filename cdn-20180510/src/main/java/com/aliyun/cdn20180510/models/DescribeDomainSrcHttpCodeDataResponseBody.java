// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HttpCodeData")
    public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData httpCodeData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcHttpCodeDataResponseBody self = new DescribeDomainSrcHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setHttpCodeData(DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData httpCodeData) {
        this.httpCodeData = httpCodeData;
        return this;
    }
    public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData getHttpCodeData() {
        return this.httpCodeData;
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public String count;

        @NameInMap("Proportion")
        public String proportion;

        public static DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData self = new DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("CodeProportionData")
        public java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData;

        public static DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue self = new DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue setCodeProportionData(java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData) {
            this.codeProportionData = codeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> getCodeProportionData() {
            return this.codeProportionData;
        }

    }

    public static class DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value;

        public static DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData self = new DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData setValue(DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData;

        public static DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData self = new DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeData setUsageData(java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainSrcHttpCodeDataResponseBodyHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

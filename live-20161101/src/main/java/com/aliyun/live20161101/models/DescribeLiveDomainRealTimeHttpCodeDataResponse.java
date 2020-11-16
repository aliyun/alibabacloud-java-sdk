// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeHttpCodeDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("RealTimeHttpCodeData")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData realTimeHttpCodeData;

    public static DescribeLiveDomainRealTimeHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeHttpCodeDataResponse self = new DescribeLiveDomainRealTimeHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData realTimeHttpCodeData) {
        this.realTimeHttpCodeData = realTimeHttpCodeData;
        return this;
    }
    public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData getRealTimeHttpCodeData() {
        return this.realTimeHttpCodeData;
    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Proportion")
        @Validation(required = true)
        public String proportion;

        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeCodeProportionData")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue self = new DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue setRealTimeCodeProportionData(java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData) {
            this.realTimeCodeProportionData = realTimeCodeProportionData;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> getRealTimeCodeProportionData() {
            return this.realTimeCodeProportionData;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue value;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData setValue(DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData> usageData;

        public static DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData self = new DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData setUsageData(java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

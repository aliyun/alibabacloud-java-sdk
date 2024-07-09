// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataResponseBody extends TeaModel {
    /**
     * <p>The time interval.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
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
     * <p>2021-06-29T05:45:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The proportions of HTTP status codes at each time interval.</p>
     */
    @NameInMap("HttpCodeData")
    public DescribeDomainHttpCodeDataResponseBodyHttpCodeData httpCodeData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T05:30:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataResponseBody self = new DescribeDomainHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainHttpCodeDataResponseBody setHttpCodeData(DescribeDomainHttpCodeDataResponseBodyHttpCodeData httpCodeData) {
        this.httpCodeData = httpCodeData;
        return this;
    }
    public DescribeDomainHttpCodeDataResponseBodyHttpCodeData getHttpCodeData() {
        return this.httpCodeData;
    }

    public DescribeDomainHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData extends TeaModel {
        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The count of each HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The proportion of the HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>66.046511627907</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("CodeProportionData")
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue setCodeProportionData(java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> codeProportionData) {
            this.codeProportionData = codeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValueCodeProportionData> getCodeProportionData() {
            return this.codeProportionData;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData extends TeaModel {
        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T05:40:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The information about the HTTP status codes.</p>
         */
        @NameInMap("Value")
        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData setValue(DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainHttpCodeDataResponseBodyHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData;

        public static DescribeDomainHttpCodeDataResponseBodyHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataResponseBodyHttpCodeData self = new DescribeDomainHttpCodeDataResponseBodyHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataResponseBodyHttpCodeData setUsageData(java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataResponseBodyHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

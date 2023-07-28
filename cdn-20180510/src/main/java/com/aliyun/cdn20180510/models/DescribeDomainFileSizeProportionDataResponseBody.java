// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainFileSizeProportionDataResponseBody extends TeaModel {
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
     * <p>The proportions of files in different sizes.</p>
     */
    @NameInMap("FileSizeProportionDataInterval")
    public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval fileSizeProportionDataInterval;

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

    public static DescribeDomainFileSizeProportionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainFileSizeProportionDataResponseBody self = new DescribeDomainFileSizeProportionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainFileSizeProportionDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainFileSizeProportionDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainFileSizeProportionDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainFileSizeProportionDataResponseBody setFileSizeProportionDataInterval(DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval fileSizeProportionDataInterval) {
        this.fileSizeProportionDataInterval = fileSizeProportionDataInterval;
        return this;
    }
    public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval getFileSizeProportionDataInterval() {
        return this.fileSizeProportionDataInterval;
    }

    public DescribeDomainFileSizeProportionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainFileSizeProportionDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData extends TeaModel {
        /**
         * <p>The size of the file.</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The proportion of the file.</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        public static DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData self = new DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue extends TeaModel {
        @NameInMap("FileSizeProportionData")
        public java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData> fileSizeProportionData;

        public static DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue self = new DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue setFileSizeProportionData(java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData> fileSizeProportionData) {
            this.fileSizeProportionData = fileSizeProportionData;
            return this;
        }
        public java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValueFileSizeProportionData> getFileSizeProportionData() {
            return this.fileSizeProportionData;
        }

    }

    public static class DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData extends TeaModel {
        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The proportions of files in different sizes.</p>
         */
        @NameInMap("Value")
        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue value;

        public static DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData self = new DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData setValue(DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageDataValue getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData> usageData;

        public static DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval self = new DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataInterval setUsageData(java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainFileSizeProportionDataResponseBodyFileSizeProportionDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

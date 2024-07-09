// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the billable region where the data was collected.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
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
     * <p>2015-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content.</p>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The resource usage that was collected at each interval.</p>
     */
    @NameInMap("UsageDataPerInterval")
    public DescribeDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval;

    public static DescribeDomainUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsageDataResponseBody self = new DescribeDomainUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsageDataResponseBody setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeDomainUsageDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainUsageDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainUsageDataResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDomainUsageDataResponseBody setUsageDataPerInterval(DescribeDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval) {
        this.usageDataPerInterval = usageDataPerInterval;
        return this;
    }
    public DescribeDomainUsageDataResponseBodyUsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public static class DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The time of the peak bandwidth value if the <strong>Field</strong> parameter in the request is set to <strong>bps</strong>. Otherwise, this parameter returns the same value as the <strong>TimeStamp</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:30:00Z</p>
         */
        @NameInMap("PeakTime")
        public String peakTime;

        /**
         * <p>The resource usage in a specific scenario.</p>
         * <blockquote>
         * <p>SpecialValue indicates the data usage in a specific scenario. If no special billable item is specified, ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("SpecialValue")
        public String specialValue;

        /**
         * <p>The timestamp of the data returned.</p>
         * <blockquote>
         * <p><strong>TimeStamp</strong> indicates the timestamp of the data returned at each interval.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:30:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The amount of resource usage.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule self = new DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setSpecialValue(String specialValue) {
            this.specialValue = specialValue;
            return this;
        }
        public String getSpecialValue() {
            return this.specialValue;
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainUsageDataResponseBodyUsageDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule;

        public static DescribeDomainUsageDataResponseBodyUsageDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainUsageDataResponseBodyUsageDataPerInterval self = new DescribeDomainUsageDataResponseBodyUsageDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerInterval setDataModule(java.util.List<DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

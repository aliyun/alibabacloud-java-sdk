// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUsageDataResponseBody extends TeaModel {
    /**
     * <p>The billable region where the usage data was collected.</p>
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
     * <p>/</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name that was queried.</p>
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
     * <p>The type of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The traffic that was collected at each interval.</p>
     */
    @NameInMap("UsageDataPerInterval")
    public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval;

    public static DescribeDcdnDomainUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUsageDataResponseBody self = new DescribeDcdnDomainUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUsageDataResponseBody setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeDcdnDomainUsageDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainUsageDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainUsageDataResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDcdnDomainUsageDataResponseBody setUsageDataPerInterval(DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval) {
        this.usageDataPerInterval = usageDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public static class DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The time of the peak bandwidth value if the <strong>Field</strong> parameter in the request is set to <strong>bps</strong>. Otherwise, this parameter returns the same value as the <strong>TimeStamp</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:30:00Z</p>
         */
        @NameInMap("PeakTime")
        public String peakTime;

        /**
         * <p>The data usage in a specific scenario.</p>
         * <blockquote>
         * <p> This parameter indicates the data usage in a specific scenario. If no special billable item is specified, ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4233041**</p>
         */
        @NameInMap("SpecialValue")
        public String specialValue;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:30:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The usage.</p>
         * 
         * <strong>example:</strong>
         * <p>4233041**</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule self = new DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setSpecialValue(String specialValue) {
            this.specialValue = specialValue;
            return this;
        }
        public String getSpecialValue() {
            return this.specialValue;
        }

        public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval self = new DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainUsageDataResponseBodyUsageDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

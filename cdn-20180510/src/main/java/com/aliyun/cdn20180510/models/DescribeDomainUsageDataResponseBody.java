// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataResponseBody extends TeaModel {
    // The billable region where the usage information was collected.
    @NameInMap("Area")
    public String area;

    // The time interval between the data entries. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    // The type of content based on which the usage information was collected.
    @NameInMap("Type")
    public String type;

    // The network traffic that was collected at each interval.
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
        // If the **Field** parameter in the request is set to **bps**, this parameter returns the time of the peak bandwidth value. Otherwise, this parameter returns the same value as the **TimeStamp** parameter.
        @NameInMap("PeakTime")
        public String peakTime;

        // The data usage in a specific scenario.
        // 
        // >  Indicates the data usage in a specific scenario. If no special billable item is specified, ignore this parameter.
        @NameInMap("SpecialValue")
        public String specialValue;

        // The timestamp of the data returned.
        // 
        // >  The **TimeStamp** parameter may return multiple values.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The usage.
        // 
        // >  Usage data includes network traffic (measured in bytes), bandwidth values (measured in bits/s), and the number of requests.
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

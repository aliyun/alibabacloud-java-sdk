// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataResponseBody extends TeaModel {
    @NameInMap("UsageDataPerInterval")
    public DescribeDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval;

    @NameInMap("Field")
    public String field;

    @NameInMap("Area")
    public String area;

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

    public static DescribeDomainUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsageDataResponseBody self = new DescribeDomainUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsageDataResponseBody setUsageDataPerInterval(DescribeDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval) {
        this.usageDataPerInterval = usageDataPerInterval;
        return this;
    }
    public DescribeDomainUsageDataResponseBodyUsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public DescribeDomainUsageDataResponseBody setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDomainUsageDataResponseBody setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
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

    public DescribeDomainUsageDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainUsageDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule self = new DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
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

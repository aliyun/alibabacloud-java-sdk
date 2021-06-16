// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("PvDataInterval")
    public DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    public static DescribeDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataResponseBody self = new DescribeDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainPvDataResponseBody setPvDataInterval(DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public static class DescribeDomainPvDataResponseBodyPvDataIntervalUsageData extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainPvDataResponseBodyPvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPvDataResponseBodyPvDataIntervalUsageData self = new DescribeDomainPvDataResponseBodyPvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainPvDataResponseBodyPvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> usageData;

        public static DescribeDomainPvDataResponseBodyPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPvDataResponseBodyPvDataInterval self = new DescribeDomainPvDataResponseBodyPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPvDataResponseBodyPvDataInterval setUsageData(java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainPvDataResponseBodyPvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

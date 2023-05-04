// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataResponseBody extends TeaModel {
    /**
     * <p>The statistical analytics feature of Alibaba Cloud CDN is discontinued. The API operations related to the statistical analytics feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](https://www.alibabacloud.com/help/en/alibaba-cloud-cdn/latest/customize-an-operations-report-template-and-create-a-tracking-task) feature to for data analysis.  </p>
     * <br>
     * <p>> - If you do not set StartTime or EndTime, monitoring data within the last 24 hours is queried. If you set both StartTime and EndTime, monitoring data within the specified time range is queried.</p>
     * <p>- You can call this operation up to 50 times per second per account.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The timestamp of the returned data.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time interval between the data entries. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("PvDataInterval")
    public DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    /**
     * <p>The number of PVs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of PVs at each interval.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataResponseBody self = new DescribeDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPvDataResponseBody setPvDataInterval(DescribeDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public DescribeDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainPvDataResponseBodyPvDataIntervalUsageData extends TeaModel {
        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The number of PVs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainPvDataResponseBodyPvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPvDataResponseBodyPvDataIntervalUsageData self = new DescribeDomainPvDataResponseBodyPvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainPvDataResponseBodyPvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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

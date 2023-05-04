// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainAverageResponseTimeResponseBody extends TeaModel {
    /**
     * <p>The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list. If you do not set this parameter, all regions are queried.</p>
     */
    @NameInMap("AvgRTPerInterval")
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval;

    /**
     * <p>The statistical analytics feature of Alibaba Cloud CDN is discontinued. The API operations related to the statistical analytics feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](https://www.alibabacloud.com/help/en/alibaba-cloud-cdn/latest/customize-an-operations-report-template-and-create-a-tracking-task) feature to for data analysis.  </p>
     * <br>
     * <p>> - If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data collected within the specified time range is queried.</p>
     * <p>- You can call this operation up to 100 times per second per account.</p>
     * <p>- You can specify multiple domain names and separate them with commas (,). You can specify at most 50 domain names in each call.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The timestamp of the returned data.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time interval between the data entries returned.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The average response time.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The average response time collected at each time interval.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainAverageResponseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAverageResponseTimeResponseBody self = new DescribeDomainAverageResponseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAverageResponseTimeResponseBody setAvgRTPerInterval(DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval avgRTPerInterval) {
        this.avgRTPerInterval = avgRTPerInterval;
        return this;
    }
    public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval getAvgRTPerInterval() {
        return this.avgRTPerInterval;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainAverageResponseTimeResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainAverageResponseTimeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainAverageResponseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAverageResponseTimeResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule extends TeaModel {
        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The type of the query condition. Valid values: When you set the value to dynamic, this operation queries the average response time of dynamic resources and static resources. If you do not set this parameter, this operation queries the average response time of only static resources. By default, this parameter is not set.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule self = new DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> dataModule;

        public static DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval self = new DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAverageResponseTimeResponseBodyAvgRTPerInterval setDataModule(java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainAverageResponseTimeResponseBodyAvgRTPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

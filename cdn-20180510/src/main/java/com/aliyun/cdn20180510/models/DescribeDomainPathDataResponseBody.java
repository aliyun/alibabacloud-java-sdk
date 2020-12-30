// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPathDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("PathDataPerInterval")
    public DescribeDomainPathDataResponseBodyPathDataPerInterval pathDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeDomainPathDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPathDataResponseBody self = new DescribeDomainPathDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPathDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainPathDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPathDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainPathDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainPathDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPathDataResponseBody setPathDataPerInterval(DescribeDomainPathDataResponseBodyPathDataPerInterval pathDataPerInterval) {
        this.pathDataPerInterval = pathDataPerInterval;
        return this;
    }
    public DescribeDomainPathDataResponseBodyPathDataPerInterval getPathDataPerInterval() {
        return this.pathDataPerInterval;
    }

    public DescribeDomainPathDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainPathDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Acc")
        public Integer acc;

        @NameInMap("Traffic")
        public Integer traffic;

        @NameInMap("Path")
        public String path;

        public static DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData self = new DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setAcc(Integer acc) {
            this.acc = acc;
            return this;
        }
        public Integer getAcc() {
            return this.acc;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeDomainPathDataResponseBodyPathDataPerInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> usageData;

        public static DescribeDomainPathDataResponseBodyPathDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPathDataResponseBodyPathDataPerInterval self = new DescribeDomainPathDataResponseBodyPathDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPathDataResponseBodyPathDataPerInterval setUsageData(java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}

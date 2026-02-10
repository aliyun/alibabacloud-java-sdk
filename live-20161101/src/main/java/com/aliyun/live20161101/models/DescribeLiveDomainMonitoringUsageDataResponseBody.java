// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMonitoringUsageDataResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the monitoring session.</p>
     * 
     * <strong>example:</strong>
     * <p>e62af24d-a354-3b0c-9f1f-da592c4b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MonitoringData")
    public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData monitoringData;

    /**
     * <p>The region of the live center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainMonitoringUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMonitoringUsageDataResponseBody self = new DescribeLiveDomainMonitoringUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setMonitoringData(DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData monitoringData) {
        this.monitoringData = monitoringData;
        return this;
    }
    public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData getMonitoringData() {
        return this.monitoringData;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainMonitoringUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem self = new DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData extends TeaModel {
        @NameInMap("MonitoringDataItem")
        public java.util.List<DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem> monitoringDataItem;

        public static DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData self = new DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringData setMonitoringDataItem(java.util.List<DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem> monitoringDataItem) {
            this.monitoringDataItem = monitoringDataItem;
            return this;
        }
        public java.util.List<DescribeLiveDomainMonitoringUsageDataResponseBodyMonitoringDataMonitoringDataItem> getMonitoringDataItem() {
            return this.monitoringDataItem;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePushProxyUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PushProxyData")
    public DescribeLivePushProxyUsageDataResponseBodyPushProxyData pushProxyData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLivePushProxyUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePushProxyUsageDataResponseBody self = new DescribeLivePushProxyUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePushProxyUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLivePushProxyUsageDataResponseBody setPushProxyData(DescribeLivePushProxyUsageDataResponseBodyPushProxyData pushProxyData) {
        this.pushProxyData = pushProxyData;
        return this;
    }
    public DescribeLivePushProxyUsageDataResponseBodyPushProxyData getPushProxyData() {
        return this.pushProxyData;
    }

    public DescribeLivePushProxyUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePushProxyUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Region")
        public String region;

        @NameInMap("StreamCount")
        public Long streamCount;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem self = new DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem setStreamCount(Long streamCount) {
            this.streamCount = streamCount;
            return this;
        }
        public Long getStreamCount() {
            return this.streamCount;
        }

        public DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLivePushProxyUsageDataResponseBodyPushProxyData extends TeaModel {
        @NameInMap("PushProxyDataItem")
        public java.util.List<DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem> pushProxyDataItem;

        public static DescribeLivePushProxyUsageDataResponseBodyPushProxyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyUsageDataResponseBodyPushProxyData self = new DescribeLivePushProxyUsageDataResponseBodyPushProxyData();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyUsageDataResponseBodyPushProxyData setPushProxyDataItem(java.util.List<DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem> pushProxyDataItem) {
            this.pushProxyDataItem = pushProxyDataItem;
            return this;
        }
        public java.util.List<DescribeLivePushProxyUsageDataResponseBodyPushProxyDataPushProxyDataItem> getPushProxyDataItem() {
            return this.pushProxyDataItem;
        }

    }

}

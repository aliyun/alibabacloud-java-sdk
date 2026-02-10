// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigResponseBody extends TeaModel {
    @NameInMap("LiveAppRecordList")
    public DescribeLivePullStreamConfigResponseBodyLiveAppRecordList liveAppRecordList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePullStreamConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigResponseBody self = new DescribeLivePullStreamConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigResponseBody setLiveAppRecordList(DescribeLivePullStreamConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeLivePullStreamConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public DescribeLivePullStreamConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("SourceUsing")
        public String sourceUsing;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setSourceUsing(String sourceUsing) {
            this.sourceUsing = sourceUsing;
            return this;
        }
        public String getSourceUsing() {
            return this.sourceUsing;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeLivePullStreamConfigResponseBodyLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        public java.util.List<DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeLivePullStreamConfigResponseBodyLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullStreamConfigResponseBodyLiveAppRecordList self = new DescribeLivePullStreamConfigResponseBodyLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullStreamConfigResponseBodyLiveAppRecordList setLiveAppRecord(java.util.List<DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeLivePullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}

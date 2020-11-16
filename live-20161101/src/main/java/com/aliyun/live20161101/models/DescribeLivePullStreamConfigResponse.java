// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveAppRecordList")
    @Validation(required = true)
    public DescribeLivePullStreamConfigResponseLiveAppRecordList liveAppRecordList;

    public static DescribeLivePullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigResponse self = new DescribeLivePullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePullStreamConfigResponse setLiveAppRecordList(DescribeLivePullStreamConfigResponseLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeLivePullStreamConfigResponseLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public static class DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("SourceUrl")
        @Validation(required = true)
        public String sourceUrl;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord self = new DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class DescribeLivePullStreamConfigResponseLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        @Validation(required = true)
        public java.util.List<DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeLivePullStreamConfigResponseLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullStreamConfigResponseLiveAppRecordList self = new DescribeLivePullStreamConfigResponseLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullStreamConfigResponseLiveAppRecordList setLiveAppRecord(java.util.List<DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeLivePullStreamConfigResponseLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMergeResponseBody extends TeaModel {
    @NameInMap("LiveStreamMergeList")
    public DescribeLiveStreamMergeResponseBodyLiveStreamMergeList liveStreamMergeList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamMergeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMergeResponseBody self = new DescribeLiveStreamMergeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMergeResponseBody setLiveStreamMergeList(DescribeLiveStreamMergeResponseBodyLiveStreamMergeList liveStreamMergeList) {
        this.liveStreamMergeList = liveStreamMergeList;
        return this;
    }
    public DescribeLiveStreamMergeResponseBodyLiveStreamMergeList getLiveStreamMergeList() {
        return this.liveStreamMergeList;
    }

    public DescribeLiveStreamMergeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppUsing")
        public String appUsing;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtraInAppStreams")
        public String extraInAppStreams;

        @NameInMap("InAppName1")
        public String inAppName1;

        @NameInMap("InAppName2")
        public String inAppName2;

        @NameInMap("InStreamName1")
        public String inStreamName1;

        @NameInMap("InStreamName2")
        public String inStreamName2;

        @NameInMap("LiveMerger")
        public String liveMerger;

        @NameInMap("MergeParameters")
        public String mergeParameters;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StreamUsing")
        public String streamUsing;

        public static DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge self = new DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setAppUsing(String appUsing) {
            this.appUsing = appUsing;
            return this;
        }
        public String getAppUsing() {
            return this.appUsing;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setExtraInAppStreams(String extraInAppStreams) {
            this.extraInAppStreams = extraInAppStreams;
            return this;
        }
        public String getExtraInAppStreams() {
            return this.extraInAppStreams;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setInAppName1(String inAppName1) {
            this.inAppName1 = inAppName1;
            return this;
        }
        public String getInAppName1() {
            return this.inAppName1;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setInAppName2(String inAppName2) {
            this.inAppName2 = inAppName2;
            return this;
        }
        public String getInAppName2() {
            return this.inAppName2;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setInStreamName1(String inStreamName1) {
            this.inStreamName1 = inStreamName1;
            return this;
        }
        public String getInStreamName1() {
            return this.inStreamName1;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setInStreamName2(String inStreamName2) {
            this.inStreamName2 = inStreamName2;
            return this;
        }
        public String getInStreamName2() {
            return this.inStreamName2;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setLiveMerger(String liveMerger) {
            this.liveMerger = liveMerger;
            return this;
        }
        public String getLiveMerger() {
            return this.liveMerger;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setMergeParameters(String mergeParameters) {
            this.mergeParameters = mergeParameters;
            return this;
        }
        public String getMergeParameters() {
            return this.mergeParameters;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge setStreamUsing(String streamUsing) {
            this.streamUsing = streamUsing;
            return this;
        }
        public String getStreamUsing() {
            return this.streamUsing;
        }

    }

    public static class DescribeLiveStreamMergeResponseBodyLiveStreamMergeList extends TeaModel {
        @NameInMap("LiveStreamMerge")
        public java.util.List<DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge> liveStreamMerge;

        public static DescribeLiveStreamMergeResponseBodyLiveStreamMergeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMergeResponseBodyLiveStreamMergeList self = new DescribeLiveStreamMergeResponseBodyLiveStreamMergeList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMergeResponseBodyLiveStreamMergeList setLiveStreamMerge(java.util.List<DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge> liveStreamMerge) {
            this.liveStreamMerge = liveStreamMerge;
            return this;
        }
        public java.util.List<DescribeLiveStreamMergeResponseBodyLiveStreamMergeListLiveStreamMerge> getLiveStreamMerge() {
            return this.liveStreamMerge;
        }

    }

}

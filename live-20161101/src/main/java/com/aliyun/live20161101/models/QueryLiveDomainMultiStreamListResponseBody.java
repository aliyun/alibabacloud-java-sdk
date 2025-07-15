// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryLiveDomainMultiStreamListResponseBody extends TeaModel {
    /**
     * <p>The online streams returned.</p>
     */
    @NameInMap("OnlineStreams")
    public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreams> onlineStreams;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryLiveDomainMultiStreamListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveDomainMultiStreamListResponseBody self = new QueryLiveDomainMultiStreamListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLiveDomainMultiStreamListResponseBody setOnlineStreams(java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreams> onlineStreams) {
        this.onlineStreams = onlineStreams;
        return this;
    }
    public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreams> getOnlineStreams() {
        return this.onlineStreams;
    }

    public QueryLiveDomainMultiStreamListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryLiveDomainMultiStreamListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryLiveDomainMultiStreamListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLiveDomainMultiStreamListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs extends TeaModel {
        /**
         * <p>The reason for the switchover.</p>
         * <ul>
         * <li>merge cut manually: You proactively switched the stream.</li>
         * <li>master stream no data: No data is available in the active stream.</li>
         * <li>master stream low quality: The quality of the active stream deteriorated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>merge cut manually</p>
         */
        @NameInMap("ChangeReason")
        public String changeReason;

        /**
         * <p>The switchover time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-13T09:20:47Z</p>
         */
        @NameInMap("ChangeTime")
        public String changeTime;

        /**
         * <p>The stream used after the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://118.178.168.35:1936/wwMultitest/pull.livetest2.aliyunlive.com_wwMultitest428_AliRewrite_2?vhost=pull.livetest2.aliyunlive.com&amp;live_rtmp_test=on</p>
         */
        @NameInMap("MasterUpstream")
        public String masterUpstream;

        /**
         * <p>The IP address used after the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("UpstreamIp")
        public String upstreamIp;

        /**
         * <p>The identifier of the stream after the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>***test_AliRewrite_2</p>
         */
        @NameInMap("UpstreamSequence")
        public String upstreamSequence;

        public static QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs self = new QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs();
            return TeaModel.build(map, self);
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs setChangeReason(String changeReason) {
            this.changeReason = changeReason;
            return this;
        }
        public String getChangeReason() {
            return this.changeReason;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs setChangeTime(String changeTime) {
            this.changeTime = changeTime;
            return this;
        }
        public String getChangeTime() {
            return this.changeTime;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs setMasterUpstream(String masterUpstream) {
            this.masterUpstream = masterUpstream;
            return this;
        }
        public String getMasterUpstream() {
            return this.masterUpstream;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs setUpstreamIp(String upstreamIp) {
            this.upstreamIp = upstreamIp;
            return this;
        }
        public String getUpstreamIp() {
            return this.upstreamIp;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs setUpstreamSequence(String upstreamSequence) {
            this.upstreamSequence = upstreamSequence;
            return this;
        }
        public String getUpstreamSequence() {
            return this.upstreamSequence;
        }

    }

    public static class QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList extends TeaModel {
        /**
         * <p>The active/standby tag.</p>
         * <blockquote>
         * <p> This parameter indicates whether the active or standby stream is being distributed.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MasterFlag")
        public Boolean masterFlag;

        /**
         * <p>The IP address of the stream ingest client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("UpstreamIp")
        public String upstreamIp;

        /**
         * <p>The unique identifier of the stream ingest.</p>
         * 
         * <strong>example:</strong>
         * <p>***test_Alirewrite1</p>
         */
        @NameInMap("UpstreamSequence")
        public String upstreamSequence;

        /**
         * <p>The stream ingest time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-13T09:20:47Z</p>
         */
        @NameInMap("UpstreamTime")
        public String upstreamTime;

        public static QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList self = new QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList();
            return TeaModel.build(map, self);
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList setMasterFlag(Boolean masterFlag) {
            this.masterFlag = masterFlag;
            return this;
        }
        public Boolean getMasterFlag() {
            return this.masterFlag;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList setUpstreamIp(String upstreamIp) {
            this.upstreamIp = upstreamIp;
            return this;
        }
        public String getUpstreamIp() {
            return this.upstreamIp;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList setUpstreamSequence(String upstreamSequence) {
            this.upstreamSequence = upstreamSequence;
            return this;
        }
        public String getUpstreamSequence() {
            return this.upstreamSequence;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList setUpstreamTime(String upstreamTime) {
            this.upstreamTime = upstreamTime;
            return this;
        }
        public String getUpstreamTime() {
            return this.upstreamTime;
        }

    }

    public static class QueryLiveDomainMultiStreamListResponseBodyOnlineStreams extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>apptest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The switchover records.</p>
         */
        @NameInMap("ChangeLogs")
        public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs> changeLogs;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>play.***.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the dual-stream disaster recovery feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OptimalMode")
        public String optimalMode;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The standby streams.</p>
         */
        @NameInMap("UpstreamList")
        public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList> upstreamList;

        public static QueryLiveDomainMultiStreamListResponseBodyOnlineStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveDomainMultiStreamListResponseBodyOnlineStreams self = new QueryLiveDomainMultiStreamListResponseBodyOnlineStreams();
            return TeaModel.build(map, self);
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setChangeLogs(java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs> changeLogs) {
            this.changeLogs = changeLogs;
            return this;
        }
        public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsChangeLogs> getChangeLogs() {
            return this.changeLogs;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setOptimalMode(String optimalMode) {
            this.optimalMode = optimalMode;
            return this;
        }
        public String getOptimalMode() {
            return this.optimalMode;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public QueryLiveDomainMultiStreamListResponseBodyOnlineStreams setUpstreamList(java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList> upstreamList) {
            this.upstreamList = upstreamList;
            return this;
        }
        public java.util.List<QueryLiveDomainMultiStreamListResponseBodyOnlineStreamsUpstreamList> getUpstreamList() {
            return this.upstreamList;
        }

    }

}

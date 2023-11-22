// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlayList")
    public java.util.List<DescribePlayListResponseBodyPlayList> playList;

    /**
     * <p>Id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    public static DescribePlayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayListResponseBody self = new DescribePlayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayListResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribePlayListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayListResponseBody setPlayList(java.util.List<DescribePlayListResponseBodyPlayList> playList) {
        this.playList = playList;
        return this;
    }
    public java.util.List<DescribePlayListResponseBodyPlayList> getPlayList() {
        return this.playList;
    }

    public DescribePlayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayListResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class DescribePlayListResponseBodyPlayList extends TeaModel {
        @NameInMap("FirstFrameDuration")
        public String firstFrameDuration;

        @NameInMap("PlayDuration")
        public String playDuration;

        @NameInMap("PlayTs")
        public String playTs;

        @NameInMap("PlayType")
        public String playType;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StuckDuration")
        public String stuckDuration;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("VideoDuration")
        public String videoDuration;

        @NameInMap("VideoId")
        public String videoId;

        public static DescribePlayListResponseBodyPlayList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayListResponseBodyPlayList self = new DescribePlayListResponseBodyPlayList();
            return TeaModel.build(map, self);
        }

        public DescribePlayListResponseBodyPlayList setFirstFrameDuration(String firstFrameDuration) {
            this.firstFrameDuration = firstFrameDuration;
            return this;
        }
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        public DescribePlayListResponseBodyPlayList setPlayDuration(String playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public String getPlayDuration() {
            return this.playDuration;
        }

        public DescribePlayListResponseBodyPlayList setPlayTs(String playTs) {
            this.playTs = playTs;
            return this;
        }
        public String getPlayTs() {
            return this.playTs;
        }

        public DescribePlayListResponseBodyPlayList setPlayType(String playType) {
            this.playType = playType;
            return this;
        }
        public String getPlayType() {
            return this.playType;
        }

        public DescribePlayListResponseBodyPlayList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePlayListResponseBodyPlayList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePlayListResponseBodyPlayList setStuckDuration(String stuckDuration) {
            this.stuckDuration = stuckDuration;
            return this;
        }
        public String getStuckDuration() {
            return this.stuckDuration;
        }

        public DescribePlayListResponseBodyPlayList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribePlayListResponseBodyPlayList setVideoDuration(String videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public String getVideoDuration() {
            return this.videoDuration;
        }

        public DescribePlayListResponseBodyPlayList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}

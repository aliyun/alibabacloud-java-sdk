// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlayList")
    public java.util.List<DescribePalyListResponseBodyPlayList> playList;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCnt")
    public Long totalCnt;

    public static DescribePalyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyListResponseBody self = new DescribePalyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePalyListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePalyListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePalyListResponseBody setPlayList(java.util.List<DescribePalyListResponseBodyPlayList> playList) {
        this.playList = playList;
        return this;
    }
    public java.util.List<DescribePalyListResponseBodyPlayList> getPlayList() {
        return this.playList;
    }

    public DescribePalyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePalyListResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribePalyListResponseBodyPlayList extends TeaModel {
        @NameInMap("FirstFrameDuration")
        public String firstFrameDuration;

        @NameInMap("PlayDuration")
        public String playDuration;

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

        public static DescribePalyListResponseBodyPlayList build(java.util.Map<String, ?> map) throws Exception {
            DescribePalyListResponseBodyPlayList self = new DescribePalyListResponseBodyPlayList();
            return TeaModel.build(map, self);
        }

        public DescribePalyListResponseBodyPlayList setFirstFrameDuration(String firstFrameDuration) {
            this.firstFrameDuration = firstFrameDuration;
            return this;
        }
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        public DescribePalyListResponseBodyPlayList setPlayDuration(String playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public String getPlayDuration() {
            return this.playDuration;
        }

        public DescribePalyListResponseBodyPlayList setPlayType(String playType) {
            this.playType = playType;
            return this;
        }
        public String getPlayType() {
            return this.playType;
        }

        public DescribePalyListResponseBodyPlayList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePalyListResponseBodyPlayList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePalyListResponseBodyPlayList setStuckDuration(String stuckDuration) {
            this.stuckDuration = stuckDuration;
            return this;
        }
        public String getStuckDuration() {
            return this.stuckDuration;
        }

        public DescribePalyListResponseBodyPlayList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribePalyListResponseBodyPlayList setVideoDuration(String videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public String getVideoDuration() {
            return this.videoDuration;
        }

        public DescribePalyListResponseBodyPlayList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}

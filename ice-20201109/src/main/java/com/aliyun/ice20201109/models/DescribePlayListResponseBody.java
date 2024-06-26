// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlayList")
    public java.util.List<DescribePlayListResponseBodyPlayList> playList;

    /**
     * <p>Id</p>
     * 
     * <strong>example:</strong>
     * <p>B960580D-26FA-5547-8AFC-3CDC812DBF27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>49</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("FirstFrameDuration")
        public String firstFrameDuration;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PlayDuration")
        public String playDuration;

        /**
         * <strong>example:</strong>
         * <p>1675922209572</p>
         */
        @NameInMap("PlayTs")
        public String playTs;

        /**
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("PlayType")
        public String playType;

        /**
         * <strong>example:</strong>
         * <p>91488be2-8381-40c9-8494-e8afe22c4a2d</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("StuckDuration")
        public String stuckDuration;

        /**
         * <strong>example:</strong>
         * <p>0b736abf16724820210842673d9543</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("VideoDuration")
        public String videoDuration;

        /**
         * <strong>example:</strong>
         * <p>250314203f0171eebff17035d0b20102</p>
         */
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

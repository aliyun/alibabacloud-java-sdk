// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetLiveRoomStatisticsResponseBodyResult result;

    public static GetLiveRoomStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomStatisticsResponseBody self = new GetLiveRoomStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveRoomStatisticsResponseBody setResult(GetLiveRoomStatisticsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveRoomStatisticsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveRoomStatisticsResponseBodyResult extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LikeCount")
        public Long likeCount;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("MessageCount")
        public Long messageCount;

        @NameInMap("OnlineCount")
        public Long onlineCount;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uv")
        public Long uv;

        @NameInMap("WatchLiveTime")
        public Long watchLiveTime;

        public static GetLiveRoomStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomStatisticsResponseBodyResult self = new GetLiveRoomStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomStatisticsResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLiveRoomStatisticsResponseBodyResult setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Long getLikeCount() {
            return this.likeCount;
        }

        public GetLiveRoomStatisticsResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveRoomStatisticsResponseBodyResult setMessageCount(Long messageCount) {
            this.messageCount = messageCount;
            return this;
        }
        public Long getMessageCount() {
            return this.messageCount;
        }

        public GetLiveRoomStatisticsResponseBodyResult setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public GetLiveRoomStatisticsResponseBodyResult setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public GetLiveRoomStatisticsResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLiveRoomStatisticsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetLiveRoomStatisticsResponseBodyResult setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public GetLiveRoomStatisticsResponseBodyResult setWatchLiveTime(Long watchLiveTime) {
            this.watchLiveTime = watchLiveTime;
            return this;
        }
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

    }

}

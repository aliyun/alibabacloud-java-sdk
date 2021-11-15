// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomStatisticsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
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
        // 直播结束时间，单位：毫秒。
        @NameInMap("EndTime")
        public Long endTime;

        // 点赞数。
        @NameInMap("LikeCount")
        public Long likeCount;

        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 互动消息数。
        @NameInMap("MessageCount")
        public Long messageCount;

        // 在线用户数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 访问用户人次。
        @NameInMap("Pv")
        public Long pv;

        // 直播开始时间，单位：毫秒。
        @NameInMap("StartTime")
        public Long startTime;

        // 直播状态，0-已创建 1-直播中 2-已关闭。
        @NameInMap("Status")
        public Integer status;

        // 访问用户数。
        @NameInMap("Uv")
        public Long uv;

        // 总观看时长，单位：毫秒。
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

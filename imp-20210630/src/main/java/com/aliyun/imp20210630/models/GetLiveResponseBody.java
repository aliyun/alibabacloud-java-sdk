// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetLiveResponseBodyResult result;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static GetLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveResponseBody self = new GetLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveResponseBody setResult(GetLiveResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveResponseBodyResult getResult() {
        return this.result;
    }

    public GetLiveResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLiveResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class GetLiveResponseBodyResultPlayUrlInfoList extends TeaModel {
        // 直播拉取分辨率 -1:lld 1:lsd 2:lhd 3:lud
        @NameInMap("CodeLevel")
        public Integer codeLevel;

        // flv拉流地址
        @NameInMap("FlvUrl")
        public String flvUrl;

        // hls拉流地址
        @NameInMap("HlsUrl")
        public String hlsUrl;

        // rtmp拉流地址
        @NameInMap("RtmpUrl")
        public String rtmpUrl;

        public static GetLiveResponseBodyResultPlayUrlInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveResponseBodyResultPlayUrlInfoList self = new GetLiveResponseBodyResultPlayUrlInfoList();
            return TeaModel.build(map, self);
        }

        public GetLiveResponseBodyResultPlayUrlInfoList setCodeLevel(Integer codeLevel) {
            this.codeLevel = codeLevel;
            return this;
        }
        public Integer getCodeLevel() {
            return this.codeLevel;
        }

        public GetLiveResponseBodyResultPlayUrlInfoList setFlvUrl(String flvUrl) {
            this.flvUrl = flvUrl;
            return this;
        }
        public String getFlvUrl() {
            return this.flvUrl;
        }

        public GetLiveResponseBodyResultPlayUrlInfoList setHlsUrl(String hlsUrl) {
            this.hlsUrl = hlsUrl;
            return this;
        }
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        public GetLiveResponseBodyResultPlayUrlInfoList setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

    }

    public static class GetLiveResponseBodyResult extends TeaModel {
        // 主播ID
        @NameInMap("AnchorId")
        public String anchorId;

        // 直播资源的唯一标识ID
        @NameInMap("LiveId")
        public String liveId;

        // 直播标题
        @NameInMap("Title")
        public String title;

        // 直播回放地址
        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        // 直播创建时间（毫秒ms）
        @NameInMap("CreateTime")
        public Long createTime;

        // 直播结束时间（毫秒ms）
        @NameInMap("EndTime")
        public Long endTime;

        // 直播持续时间（毫秒ms）
        @NameInMap("Duration")
        public Long duration;

        // 直播推流地址
        @NameInMap("PushUrl")
        public String pushUrl;

        // 直播拉流地址
        @NameInMap("LiveUrl")
        public String liveUrl;

        // 直播状态：Created-已创建，未开播，Living-直播中，End-直播结束
        @NameInMap("Status")
        public String status;

        // 直播简介
        @NameInMap("Introduction")
        public String introduction;

        // 房间id
        @NameInMap("RoomId")
        public String roomId;

        // 租户名
        @NameInMap("AppId")
        public String appId;

        // 创建直播用户
        @NameInMap("UserId")
        public String userId;

        // 直播推送分辨率 -1:lld 1:lsd 2:lhd 3:lud
        @NameInMap("CodeLevel")
        public Integer codeLevel;

        // 多分辨率多协议播放信息
        @NameInMap("PlayUrlInfoList")
        public java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> playUrlInfoList;

        public static GetLiveResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveResponseBodyResult self = new GetLiveResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveResponseBodyResult setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public GetLiveResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLiveResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetLiveResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLiveResponseBodyResult setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetLiveResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public GetLiveResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public GetLiveResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLiveResponseBodyResult setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public GetLiveResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetLiveResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLiveResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetLiveResponseBodyResult setCodeLevel(Integer codeLevel) {
            this.codeLevel = codeLevel;
            return this;
        }
        public Integer getCodeLevel() {
            return this.codeLevel;
        }

        public GetLiveResponseBodyResult setPlayUrlInfoList(java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> playUrlInfoList) {
            this.playUrlInfoList = playUrlInfoList;
            return this;
        }
        public java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> getPlayUrlInfoList() {
            return this.playUrlInfoList;
        }

    }

}

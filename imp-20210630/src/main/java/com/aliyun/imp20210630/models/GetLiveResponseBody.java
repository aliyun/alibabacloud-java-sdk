// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetLiveResponseBodyResult result;

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

    public static class GetLiveResponseBodyResultArtcInfo extends TeaModel {
        @NameInMap("ArtcH5Url")
        public String artcH5Url;

        @NameInMap("ArtcUrl")
        public String artcUrl;

        public static GetLiveResponseBodyResultArtcInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLiveResponseBodyResultArtcInfo self = new GetLiveResponseBodyResultArtcInfo();
            return TeaModel.build(map, self);
        }

        public GetLiveResponseBodyResultArtcInfo setArtcH5Url(String artcH5Url) {
            this.artcH5Url = artcH5Url;
            return this;
        }
        public String getArtcH5Url() {
            return this.artcH5Url;
        }

        public GetLiveResponseBodyResultArtcInfo setArtcUrl(String artcUrl) {
            this.artcUrl = artcUrl;
            return this;
        }
        public String getArtcUrl() {
            return this.artcUrl;
        }

    }

    public static class GetLiveResponseBodyResultPlayUrlInfoList extends TeaModel {
        @NameInMap("CodeLevel")
        public Integer codeLevel;

        @NameInMap("FlvUrl")
        public String flvUrl;

        @NameInMap("HlsUrl")
        public String hlsUrl;

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
        @NameInMap("AnchorId")
        public String anchorId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ArtcInfo")
        public GetLiveResponseBodyResultArtcInfo artcInfo;

        @NameInMap("CodeLevel")
        public Integer codeLevel;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HlsUrl")
        public String hlsUrl;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("LiveUrl")
        public String liveUrl;

        @NameInMap("PlayUrlInfoList")
        public java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> playUrlInfoList;

        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserDefineField")
        public String userDefineField;

        @NameInMap("UserId")
        public String userId;

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

        public GetLiveResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLiveResponseBodyResult setArtcInfo(GetLiveResponseBodyResultArtcInfo artcInfo) {
            this.artcInfo = artcInfo;
            return this;
        }
        public GetLiveResponseBodyResultArtcInfo getArtcInfo() {
            return this.artcInfo;
        }

        public GetLiveResponseBodyResult setCodeLevel(Integer codeLevel) {
            this.codeLevel = codeLevel;
            return this;
        }
        public Integer getCodeLevel() {
            return this.codeLevel;
        }

        public GetLiveResponseBodyResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetLiveResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveResponseBodyResult setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetLiveResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLiveResponseBodyResult setHlsUrl(String hlsUrl) {
            this.hlsUrl = hlsUrl;
            return this;
        }
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        public GetLiveResponseBodyResult setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public GetLiveResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public GetLiveResponseBodyResult setPlayUrlInfoList(java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> playUrlInfoList) {
            this.playUrlInfoList = playUrlInfoList;
            return this;
        }
        public java.util.List<GetLiveResponseBodyResultPlayUrlInfoList> getPlayUrlInfoList() {
            return this.playUrlInfoList;
        }

        public GetLiveResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetLiveResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public GetLiveResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetLiveResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLiveResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLiveResponseBodyResult setUserDefineField(String userDefineField) {
            this.userDefineField = userDefineField;
            return this;
        }
        public String getUserDefineField() {
            return this.userDefineField;
        }

        public GetLiveResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

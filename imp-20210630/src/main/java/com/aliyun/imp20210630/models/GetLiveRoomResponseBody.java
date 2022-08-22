// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetLiveRoomResponseBodyResult result;

    public static GetLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomResponseBody self = new GetLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveRoomResponseBody setResult(GetLiveRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveRoomResponseBodyResultArtcInfo extends TeaModel {
        @NameInMap("ArtcH5Url")
        public String artcH5Url;

        @NameInMap("ArtcUrl")
        public String artcUrl;

        public static GetLiveRoomResponseBodyResultArtcInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomResponseBodyResultArtcInfo self = new GetLiveRoomResponseBodyResultArtcInfo();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomResponseBodyResultArtcInfo setArtcH5Url(String artcH5Url) {
            this.artcH5Url = artcH5Url;
            return this;
        }
        public String getArtcH5Url() {
            return this.artcH5Url;
        }

        public GetLiveRoomResponseBodyResultArtcInfo setArtcUrl(String artcUrl) {
            this.artcUrl = artcUrl;
            return this;
        }
        public String getArtcUrl() {
            return this.artcUrl;
        }

    }

    public static class GetLiveRoomResponseBodyResultPluginInstanceInfoList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("PluginId")
        public String pluginId;

        @NameInMap("PluginType")
        public String pluginType;

        public static GetLiveRoomResponseBodyResultPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomResponseBodyResultPluginInstanceInfoList self = new GetLiveRoomResponseBodyResultPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

    }

    public static class GetLiveRoomResponseBodyResult extends TeaModel {
        @NameInMap("AnchorId")
        public String anchorId;

        @NameInMap("AnchorNick")
        public String anchorNick;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ArtcInfo")
        public GetLiveRoomResponseBodyResultArtcInfo artcInfo;

        @NameInMap("ChatId")
        public String chatId;

        @NameInMap("ConfId")
        public String confId;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableLinkMic")
        public Boolean enableLinkMic;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("HlsUrl")
        public String hlsUrl;

        @NameInMap("HlsUrlHttps")
        public String hlsUrlHttps;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("LiveUrl")
        public String liveUrl;

        @NameInMap("LiveUrlHttps")
        public String liveUrlHttps;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("OnlineCount")
        public Long onlineCount;

        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        @NameInMap("PlaybackUrlHttps")
        public String playbackUrlHttps;

        @NameInMap("PluginInstanceInfoList")
        public java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RtmpUrl")
        public String rtmpUrl;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Uv")
        public Long uv;

        public static GetLiveRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomResponseBodyResult self = new GetLiveRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomResponseBodyResult setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public GetLiveRoomResponseBodyResult setAnchorNick(String anchorNick) {
            this.anchorNick = anchorNick;
            return this;
        }
        public String getAnchorNick() {
            return this.anchorNick;
        }

        public GetLiveRoomResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLiveRoomResponseBodyResult setArtcInfo(GetLiveRoomResponseBodyResultArtcInfo artcInfo) {
            this.artcInfo = artcInfo;
            return this;
        }
        public GetLiveRoomResponseBodyResultArtcInfo getArtcInfo() {
            return this.artcInfo;
        }

        public GetLiveRoomResponseBodyResult setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public GetLiveRoomResponseBodyResult setConfId(String confId) {
            this.confId = confId;
            return this;
        }
        public String getConfId() {
            return this.confId;
        }

        public GetLiveRoomResponseBodyResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetLiveRoomResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveRoomResponseBodyResult setEnableLinkMic(Boolean enableLinkMic) {
            this.enableLinkMic = enableLinkMic;
            return this;
        }
        public Boolean getEnableLinkMic() {
            return this.enableLinkMic;
        }

        public GetLiveRoomResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLiveRoomResponseBodyResult setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetLiveRoomResponseBodyResult setHlsUrl(String hlsUrl) {
            this.hlsUrl = hlsUrl;
            return this;
        }
        public String getHlsUrl() {
            return this.hlsUrl;
        }

        public GetLiveRoomResponseBodyResult setHlsUrlHttps(String hlsUrlHttps) {
            this.hlsUrlHttps = hlsUrlHttps;
            return this;
        }
        public String getHlsUrlHttps() {
            return this.hlsUrlHttps;
        }

        public GetLiveRoomResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveRoomResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public GetLiveRoomResponseBodyResult setLiveUrlHttps(String liveUrlHttps) {
            this.liveUrlHttps = liveUrlHttps;
            return this;
        }
        public String getLiveUrlHttps() {
            return this.liveUrlHttps;
        }

        public GetLiveRoomResponseBodyResult setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public GetLiveRoomResponseBodyResult setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public GetLiveRoomResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetLiveRoomResponseBodyResult setPlaybackUrlHttps(String playbackUrlHttps) {
            this.playbackUrlHttps = playbackUrlHttps;
            return this;
        }
        public String getPlaybackUrlHttps() {
            return this.playbackUrlHttps;
        }

        public GetLiveRoomResponseBodyResult setPluginInstanceInfoList(java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        public GetLiveRoomResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public GetLiveRoomResponseBodyResult setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public GetLiveRoomResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetLiveRoomResponseBodyResult setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public GetLiveRoomResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLiveRoomResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetLiveRoomResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLiveRoomResponseBodyResult setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

}

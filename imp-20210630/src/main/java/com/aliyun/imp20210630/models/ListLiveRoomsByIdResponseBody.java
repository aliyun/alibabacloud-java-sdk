// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsByIdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public ListLiveRoomsByIdResponseBodyResult result;

    public static ListLiveRoomsByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsByIdResponseBody self = new ListLiveRoomsByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRoomsByIdResponseBody setResult(ListLiveRoomsByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLiveRoomsByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLiveRoomsByIdResponseBodyResultLiveList extends TeaModel {
        // 主播ID。
        @NameInMap("AnchorId")
        public String anchorId;

        // 主播昵称。
        @NameInMap("AnchorNick")
        public String anchorNick;

        // 应用ID。
        @NameInMap("AppId")
        public String appId;

        // 聊天ID。
        @NameInMap("ChatId")
        public String chatId;

        // 封面。
        @NameInMap("CoverUrl")
        public String coverUrl;

        // 直播拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 公告。
        @NameInMap("Notice")
        public String notice;

        // 在线用户数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 访问用户人次。
        @NameInMap("Pv")
        public Long pv;

        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 直播状态，0-在播 1-下播。
        @NameInMap("Status")
        public Integer status;

        // 标题。
        @NameInMap("Title")
        public String title;

        // 访问用户数。
        @NameInMap("Uv")
        public Long uv;

        public static ListLiveRoomsByIdResponseBodyResultLiveList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRoomsByIdResponseBodyResultLiveList self = new ListLiveRoomsByIdResponseBodyResultLiveList();
            return TeaModel.build(map, self);
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setAnchorNick(String anchorNick) {
            this.anchorNick = anchorNick;
            return this;
        }
        public String getAnchorNick() {
            return this.anchorNick;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

    public static class ListLiveRoomsByIdResponseBodyResult extends TeaModel {
        // 直播列表信息。
        @NameInMap("LiveList")
        public java.util.List<ListLiveRoomsByIdResponseBodyResultLiveList> liveList;

        public static ListLiveRoomsByIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRoomsByIdResponseBodyResult self = new ListLiveRoomsByIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLiveRoomsByIdResponseBodyResult setLiveList(java.util.List<ListLiveRoomsByIdResponseBodyResultLiveList> liveList) {
            this.liveList = liveList;
            return this;
        }
        public java.util.List<ListLiveRoomsByIdResponseBodyResultLiveList> getLiveList() {
            return this.liveList;
        }

    }

}

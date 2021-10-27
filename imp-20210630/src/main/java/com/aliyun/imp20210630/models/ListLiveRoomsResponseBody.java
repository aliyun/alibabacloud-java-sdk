// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public ListLiveRoomsResponseBodyResult result;

    public static ListLiveRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsResponseBody self = new ListLiveRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRoomsResponseBody setResult(ListLiveRoomsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLiveRoomsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLiveRoomsResponseBodyResultLiveList extends TeaModel {
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

        public static ListLiveRoomsResponseBodyResultLiveList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRoomsResponseBodyResultLiveList self = new ListLiveRoomsResponseBodyResultLiveList();
            return TeaModel.build(map, self);
        }

        public ListLiveRoomsResponseBodyResultLiveList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public ListLiveRoomsResponseBodyResultLiveList setAnchorNick(String anchorNick) {
            this.anchorNick = anchorNick;
            return this;
        }
        public String getAnchorNick() {
            return this.anchorNick;
        }

        public ListLiveRoomsResponseBodyResultLiveList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLiveRoomsResponseBodyResultLiveList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListLiveRoomsResponseBodyResultLiveList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListLiveRoomsResponseBodyResultLiveList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListLiveRoomsResponseBodyResultLiveList setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public ListLiveRoomsResponseBodyResultLiveList setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListLiveRoomsResponseBodyResultLiveList setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public ListLiveRoomsResponseBodyResultLiveList setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public ListLiveRoomsResponseBodyResultLiveList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListLiveRoomsResponseBodyResultLiveList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListLiveRoomsResponseBodyResultLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListLiveRoomsResponseBodyResultLiveList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

    public static class ListLiveRoomsResponseBodyResult extends TeaModel {
        // 是否还有下一页。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 直播列表信息。
        @NameInMap("LiveList")
        public java.util.List<ListLiveRoomsResponseBodyResultLiveList> liveList;

        // 直播总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 直播总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLiveRoomsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRoomsResponseBodyResult self = new ListLiveRoomsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLiveRoomsResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListLiveRoomsResponseBodyResult setLiveList(java.util.List<ListLiveRoomsResponseBodyResultLiveList> liveList) {
            this.liveList = liveList;
            return this;
        }
        public java.util.List<ListLiveRoomsResponseBodyResultLiveList> getLiveList() {
            return this.liveList;
        }

        public ListLiveRoomsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListLiveRoomsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

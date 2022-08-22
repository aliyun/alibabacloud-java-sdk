// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AnchorId")
        public String anchorId;

        @NameInMap("AnchorNick")
        public String anchorNick;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChatId")
        public String chatId;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("OnlineCount")
        public Long onlineCount;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

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

        public ListLiveRoomsResponseBodyResultLiveList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLiveRoomsResponseBodyResultLiveList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
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

        public ListLiveRoomsResponseBodyResultLiveList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("LiveList")
        public java.util.List<ListLiveRoomsResponseBodyResultLiveList> liveList;

        @NameInMap("PageTotal")
        public Integer pageTotal;

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

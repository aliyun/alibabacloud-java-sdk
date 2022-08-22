// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

        public ListLiveRoomsByIdResponseBodyResultLiveList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLiveRoomsByIdResponseBodyResultLiveList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
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

        public ListLiveRoomsByIdResponseBodyResultLiveList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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

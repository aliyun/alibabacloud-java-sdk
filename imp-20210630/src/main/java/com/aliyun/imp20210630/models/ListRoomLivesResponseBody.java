// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomLivesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public ListRoomLivesResponseBodyResult result;

    public static ListRoomLivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomLivesResponseBody self = new ListRoomLivesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoomLivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoomLivesResponseBody setResult(ListRoomLivesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomLivesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomLivesResponseBodyResultLiveList extends TeaModel {
        // 应用唯一标识，由6位小写字母、数字组成。
        @NameInMap("AppId")
        public String appId;

        // 房间拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 直播id。
        @NameInMap("LiveId")
        public String liveId;

        // 房间公告。
        @NameInMap("Notice")
        public String notice;

        // 在线用户数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 用户访问人次。
        @NameInMap("Pv")
        public Long pv;

        // 房间唯一标识。
        @NameInMap("RoomId")
        public String roomId;

        // 房主用户id。
        @NameInMap("RoomOwnerId")
        public String roomOwnerId;

        // 直播状态，0-在播 1-不在播。
        @NameInMap("Status")
        public Integer status;

        // 房间标题。
        @NameInMap("Title")
        public String title;

        // 用户访问数。
        @NameInMap("Uv")
        public Long uv;

        public static ListRoomLivesResponseBodyResultLiveList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomLivesResponseBodyResultLiveList self = new ListRoomLivesResponseBodyResultLiveList();
            return TeaModel.build(map, self);
        }

        public ListRoomLivesResponseBodyResultLiveList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRoomLivesResponseBodyResultLiveList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListRoomLivesResponseBodyResultLiveList setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public ListRoomLivesResponseBodyResultLiveList setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListRoomLivesResponseBodyResultLiveList setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public ListRoomLivesResponseBodyResultLiveList setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public ListRoomLivesResponseBodyResultLiveList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomLivesResponseBodyResultLiveList setRoomOwnerId(String roomOwnerId) {
            this.roomOwnerId = roomOwnerId;
            return this;
        }
        public String getRoomOwnerId() {
            return this.roomOwnerId;
        }

        public ListRoomLivesResponseBodyResultLiveList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRoomLivesResponseBodyResultLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListRoomLivesResponseBodyResultLiveList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

    public static class ListRoomLivesResponseBodyResult extends TeaModel {
        // 是否还有下一页直播列表。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 直播列表信息。
        @NameInMap("LiveList")
        public java.util.List<ListRoomLivesResponseBodyResultLiveList> liveList;

        // 下一个拉取的时间戳，单位毫秒。
        @NameInMap("NextQueryTimestamp")
        public Long nextQueryTimestamp;

        public static ListRoomLivesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomLivesResponseBodyResult self = new ListRoomLivesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomLivesResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListRoomLivesResponseBodyResult setLiveList(java.util.List<ListRoomLivesResponseBodyResultLiveList> liveList) {
            this.liveList = liveList;
            return this;
        }
        public java.util.List<ListRoomLivesResponseBodyResultLiveList> getLiveList() {
            return this.liveList;
        }

        public ListRoomLivesResponseBodyResult setNextQueryTimestamp(Long nextQueryTimestamp) {
            this.nextQueryTimestamp = nextQueryTimestamp;
            return this;
        }
        public Long getNextQueryTimestamp() {
            return this.nextQueryTimestamp;
        }

    }

}

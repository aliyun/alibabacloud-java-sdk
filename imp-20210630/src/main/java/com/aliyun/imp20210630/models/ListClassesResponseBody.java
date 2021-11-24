// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListClassesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建课程返回的结果。
    @NameInMap("Result")
    public ListClassesResponseBodyResult result;

    public static ListClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassesResponseBody self = new ListClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClassesResponseBody setResult(ListClassesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListClassesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListClassesResponseBodyResultClassList extends TeaModel {
        // 课堂唯一标识，由调用CreateClass返回。
        @NameInMap("ClassId")
        public String classId;

        // 连麦会议唯一标识。
        @NameInMap("ConfId")
        public String confId;

        // 创建人昵称。
        @NameInMap("CreateNickname")
        public String createNickname;

        // 创建人ID。
        @NameInMap("CreateUserId")
        public String createUserId;

        // 下课时间戳，毫秒。
        @NameInMap("EndTime")
        public Long endTime;

        // 直播的唯一标识ID。
        @NameInMap("LiveId")
        public String liveId;

        // 房间ID
        @NameInMap("RoomId")
        public String roomId;

        // 开始上课时间戳，毫秒。
        @NameInMap("StartTime")
        public Long startTime;

        // 课堂状态，0:未开始 1:上课中 2:已下课。
        @NameInMap("Status")
        public Integer status;

        // 课堂标题。
        @NameInMap("Title")
        public String title;

        // 白板ID
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        // 白板录制ID
        @NameInMap("WhiteboardRecordId")
        public String whiteboardRecordId;

        public static ListClassesResponseBodyResultClassList build(java.util.Map<String, ?> map) throws Exception {
            ListClassesResponseBodyResultClassList self = new ListClassesResponseBodyResultClassList();
            return TeaModel.build(map, self);
        }

        public ListClassesResponseBodyResultClassList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public ListClassesResponseBodyResultClassList setConfId(String confId) {
            this.confId = confId;
            return this;
        }
        public String getConfId() {
            return this.confId;
        }

        public ListClassesResponseBodyResultClassList setCreateNickname(String createNickname) {
            this.createNickname = createNickname;
            return this;
        }
        public String getCreateNickname() {
            return this.createNickname;
        }

        public ListClassesResponseBodyResultClassList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListClassesResponseBodyResultClassList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListClassesResponseBodyResultClassList setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public ListClassesResponseBodyResultClassList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListClassesResponseBodyResultClassList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListClassesResponseBodyResultClassList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListClassesResponseBodyResultClassList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListClassesResponseBodyResultClassList setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

        public ListClassesResponseBodyResultClassList setWhiteboardRecordId(String whiteboardRecordId) {
            this.whiteboardRecordId = whiteboardRecordId;
            return this;
        }
        public String getWhiteboardRecordId() {
            return this.whiteboardRecordId;
        }

    }

    public static class ListClassesResponseBodyResult extends TeaModel {
        // 课程列表信息。
        @NameInMap("ClassList")
        public java.util.List<ListClassesResponseBodyResultClassList> classList;

        // 是否还有下一页。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 课程总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 课程总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClassesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClassesResponseBodyResult self = new ListClassesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClassesResponseBodyResult setClassList(java.util.List<ListClassesResponseBodyResultClassList> classList) {
            this.classList = classList;
            return this;
        }
        public java.util.List<ListClassesResponseBodyResultClassList> getClassList() {
            return this.classList;
        }

        public ListClassesResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListClassesResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListClassesResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

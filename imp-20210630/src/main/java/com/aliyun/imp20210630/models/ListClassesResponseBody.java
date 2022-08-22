// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListClassesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ClassId")
        public String classId;

        @NameInMap("ConfId")
        public String confId;

        @NameInMap("CreateNickname")
        public String createNickname;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        @NameInMap("WhiteboardId")
        public String whiteboardId;

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
        @NameInMap("ClassList")
        public java.util.List<ListClassesResponseBodyResultClassList> classList;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("PageTotal")
        public Integer pageTotal;

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

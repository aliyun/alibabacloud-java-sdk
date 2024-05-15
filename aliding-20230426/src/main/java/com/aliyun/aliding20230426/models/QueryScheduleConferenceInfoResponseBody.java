// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceInfoResponseBody extends TeaModel {
    @NameInMap("conferenceList")
    public java.util.List<QueryScheduleConferenceInfoResponseBodyConferenceList> conferenceList;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static QueryScheduleConferenceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceInfoResponseBody self = new QueryScheduleConferenceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceInfoResponseBody setConferenceList(java.util.List<QueryScheduleConferenceInfoResponseBodyConferenceList> conferenceList) {
        this.conferenceList = conferenceList;
        return this;
    }
    public java.util.List<QueryScheduleConferenceInfoResponseBodyConferenceList> getConferenceList() {
        return this.conferenceList;
    }

    public QueryScheduleConferenceInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryScheduleConferenceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScheduleConferenceInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryScheduleConferenceInfoResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryScheduleConferenceInfoResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryScheduleConferenceInfoResponseBodyConferenceList extends TeaModel {
        @NameInMap("ConferenceId")
        public String conferenceId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("RoomCode")
        public String roomCode;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        public static QueryScheduleConferenceInfoResponseBodyConferenceList build(java.util.Map<String, ?> map) throws Exception {
            QueryScheduleConferenceInfoResponseBodyConferenceList self = new QueryScheduleConferenceInfoResponseBodyConferenceList();
            return TeaModel.build(map, self);
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setRoomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }
        public String getRoomCode() {
            return this.roomCode;
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryScheduleConferenceInfoResponseBodyConferenceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

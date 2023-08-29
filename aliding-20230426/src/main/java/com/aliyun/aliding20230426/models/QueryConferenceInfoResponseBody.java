// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoResponseBody extends TeaModel {
    @NameInMap("confInfo")
    public QueryConferenceInfoResponseBodyConfInfo confInfo;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryConferenceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoResponseBody self = new QueryConferenceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoResponseBody setConfInfo(QueryConferenceInfoResponseBodyConfInfo confInfo) {
        this.confInfo = confInfo;
        return this;
    }
    public QueryConferenceInfoResponseBodyConfInfo getConfInfo() {
        return this.confInfo;
    }

    public QueryConferenceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryConferenceInfoResponseBodyConfInfo extends TeaModel {
        @NameInMap("ActiveNum")
        public Integer activeNum;

        @NameInMap("AttendNum")
        public Integer attendNum;

        @NameInMap("ConfDuration")
        public Long confDuration;

        @NameInMap("ConferenceId")
        public String conferenceId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNick")
        public String creatorNick;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExternalLinkUrl")
        public String externalLinkUrl;

        @NameInMap("InvitedNum")
        public Integer invitedNum;

        @NameInMap("RoomCode")
        public String roomCode;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        public static QueryConferenceInfoResponseBodyConfInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceInfoResponseBodyConfInfo self = new QueryConferenceInfoResponseBodyConfInfo();
            return TeaModel.build(map, self);
        }

        public QueryConferenceInfoResponseBodyConfInfo setActiveNum(Integer activeNum) {
            this.activeNum = activeNum;
            return this;
        }
        public Integer getActiveNum() {
            return this.activeNum;
        }

        public QueryConferenceInfoResponseBodyConfInfo setAttendNum(Integer attendNum) {
            this.attendNum = attendNum;
            return this;
        }
        public Integer getAttendNum() {
            return this.attendNum;
        }

        public QueryConferenceInfoResponseBodyConfInfo setConfDuration(Long confDuration) {
            this.confDuration = confDuration;
            return this;
        }
        public Long getConfDuration() {
            return this.confDuration;
        }

        public QueryConferenceInfoResponseBodyConfInfo setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public QueryConferenceInfoResponseBodyConfInfo setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryConferenceInfoResponseBodyConfInfo setCreatorNick(String creatorNick) {
            this.creatorNick = creatorNick;
            return this;
        }
        public String getCreatorNick() {
            return this.creatorNick;
        }

        public QueryConferenceInfoResponseBodyConfInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryConferenceInfoResponseBodyConfInfo setExternalLinkUrl(String externalLinkUrl) {
            this.externalLinkUrl = externalLinkUrl;
            return this;
        }
        public String getExternalLinkUrl() {
            return this.externalLinkUrl;
        }

        public QueryConferenceInfoResponseBodyConfInfo setInvitedNum(Integer invitedNum) {
            this.invitedNum = invitedNum;
            return this;
        }
        public Integer getInvitedNum() {
            return this.invitedNum;
        }

        public QueryConferenceInfoResponseBodyConfInfo setRoomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }
        public String getRoomCode() {
            return this.roomCode;
        }

        public QueryConferenceInfoResponseBodyConfInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryConferenceInfoResponseBodyConfInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryConferenceInfoResponseBodyConfInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

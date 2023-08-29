// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceMembersResponseBody extends TeaModel {
    @NameInMap("memberModels")
    public java.util.List<QueryConferenceMembersResponseBodyMemberModels> memberModels;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static QueryConferenceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceMembersResponseBody self = new QueryConferenceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConferenceMembersResponseBody setMemberModels(java.util.List<QueryConferenceMembersResponseBodyMemberModels> memberModels) {
        this.memberModels = memberModels;
        return this;
    }
    public java.util.List<QueryConferenceMembersResponseBodyMemberModels> getMemberModels() {
        return this.memberModels;
    }

    public QueryConferenceMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryConferenceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConferenceMembersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryConferenceMembersResponseBodyMemberModels extends TeaModel {
        @NameInMap("AttendStatus")
        public Integer attendStatus;

        @NameInMap("CoHost")
        public Boolean coHost;

        @NameInMap("ConferenceId")
        public String conferenceId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Host")
        public Boolean host;

        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("LeaveTime")
        public Long leaveTime;

        @NameInMap("OuterOrgMember")
        public Boolean outerOrgMember;

        @NameInMap("PstnJoin")
        public Boolean pstnJoin;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserNick")
        public String userNick;

        public static QueryConferenceMembersResponseBodyMemberModels build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceMembersResponseBodyMemberModels self = new QueryConferenceMembersResponseBodyMemberModels();
            return TeaModel.build(map, self);
        }

        public QueryConferenceMembersResponseBodyMemberModels setAttendStatus(Integer attendStatus) {
            this.attendStatus = attendStatus;
            return this;
        }
        public Integer getAttendStatus() {
            return this.attendStatus;
        }

        public QueryConferenceMembersResponseBodyMemberModels setCoHost(Boolean coHost) {
            this.coHost = coHost;
            return this;
        }
        public Boolean getCoHost() {
            return this.coHost;
        }

        public QueryConferenceMembersResponseBodyMemberModels setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public QueryConferenceMembersResponseBodyMemberModels setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryConferenceMembersResponseBodyMemberModels setHost(Boolean host) {
            this.host = host;
            return this;
        }
        public Boolean getHost() {
            return this.host;
        }

        public QueryConferenceMembersResponseBodyMemberModels setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public QueryConferenceMembersResponseBodyMemberModels setLeaveTime(Long leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        public QueryConferenceMembersResponseBodyMemberModels setOuterOrgMember(Boolean outerOrgMember) {
            this.outerOrgMember = outerOrgMember;
            return this;
        }
        public Boolean getOuterOrgMember() {
            return this.outerOrgMember;
        }

        public QueryConferenceMembersResponseBodyMemberModels setPstnJoin(Boolean pstnJoin) {
            this.pstnJoin = pstnJoin;
            return this;
        }
        public Boolean getPstnJoin() {
            return this.pstnJoin;
        }

        public QueryConferenceMembersResponseBodyMemberModels setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryConferenceMembersResponseBodyMemberModels setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}

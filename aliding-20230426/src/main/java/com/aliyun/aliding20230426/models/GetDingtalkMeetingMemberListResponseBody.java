// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<GetDingtalkMeetingMemberListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetDingtalkMeetingMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberListResponseBody self = new GetDingtalkMeetingMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkMeetingMemberListResponseBody setData(java.util.List<GetDingtalkMeetingMemberListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDingtalkMeetingMemberListResponseBodyData> getData() {
        return this.data;
    }

    public GetDingtalkMeetingMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDingtalkMeetingMemberListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetDingtalkMeetingMemberListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetDingtalkMeetingMemberListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetDingtalkMeetingMemberListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        @NameInMap("channelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>61289fxxx</p>
         */
        @NameInMap("conferenceId")
        public String conferenceId;

        /**
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("deviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>1638360000000</p>
         */
        @NameInMap("joinTime")
        public Long joinTime;

        /**
         * <strong>example:</strong>
         * <p>1638363600000</p>
         */
        @NameInMap("leaveTime")
        public Long leaveTime;

        /**
         * <strong>example:</strong>
         * <p>good</p>
         */
        @NameInMap("networkQuality")
        public String networkQuality;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("nick")
        public String nick;

        /**
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>session123</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>uid123456</p>
         */
        @NameInMap("unionId")
        public String unionId;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>432432</p>
         */
        @NameInMap("workNo")
        public String workNo;

        public static GetDingtalkMeetingMemberListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberListResponseBodyData self = new GetDingtalkMeetingMemberListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberListResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setLeaveTime(Long leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setNetworkQuality(String networkQuality) {
            this.networkQuality = networkQuality;
            return this;
        }
        public String getNetworkQuality() {
            return this.networkQuality;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetDingtalkMeetingMemberListResponseBodyData setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

}

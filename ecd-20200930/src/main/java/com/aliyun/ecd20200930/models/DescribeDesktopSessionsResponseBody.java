// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the session.</p>
     */
    @NameInMap("Sessions")
    public java.util.List<DescribeDesktopSessionsResponseBodySessions> sessions;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDesktopSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopSessionsResponseBody self = new DescribeDesktopSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopSessionsResponseBody setSessions(java.util.List<DescribeDesktopSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeDesktopSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public DescribeDesktopSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDesktopSessionsResponseBodySessions extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The OS that the client runs.</p>
         */
        @NameInMap("ClientOS")
        public String clientOS;

        /**
         * <p>The client version.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The cloud desktop ID.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud desktop name.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The duration of the remote assistance. Unit: seconds.</p>
         */
        @NameInMap("EndUserApplyCoordinateTime")
        public Long endUserApplyCoordinateTime;

        /**
         * <p>The ID of the end user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The duration of the latest session. Unit: seconds.</p>
         */
        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        /**
         * <p>The workspace ID.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The workspace name.</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The OS. Valid values:</p>
         * <br>
         * <p>*   Windows</p>
         * <p>*   Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The protocol type that is supported by the cloud desktop. Valid values:</p>
         * <br>
         * <p>*   HDX</p>
         * <p>*   ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The end time of the session.</p>
         */
        @NameInMap("SessionEndTime")
        public String sessionEndTime;

        /**
         * <p>The idle duration of the session. Unit: seconds.</p>
         */
        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        /**
         * <p>The start time of the session.</p>
         */
        @NameInMap("SessionStartTime")
        public String sessionStartTime;

        /**
         * <p>The session status. Valid values:</p>
         * <br>
         * <p>*   Connected</p>
         * <p>*   Disconnected</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The total session duration. Unit: seconds.</p>
         */
        @NameInMap("TotalConnectionTime")
        public Long totalConnectionTime;

        public static DescribeDesktopSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopSessionsResponseBodySessions self = new DescribeDesktopSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopSessionsResponseBodySessions setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDesktopSessionsResponseBodySessions setClientOS(String clientOS) {
            this.clientOS = clientOS;
            return this;
        }
        public String getClientOS() {
            return this.clientOS;
        }

        public DescribeDesktopSessionsResponseBodySessions setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeDesktopSessionsResponseBodySessions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopSessionsResponseBodySessions setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopSessionsResponseBodySessions setEndUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
            this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
            return this;
        }
        public Long getEndUserApplyCoordinateTime() {
            return this.endUserApplyCoordinateTime;
        }

        public DescribeDesktopSessionsResponseBodySessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopSessionsResponseBodySessions setLatestConnectionTime(Long latestConnectionTime) {
            this.latestConnectionTime = latestConnectionTime;
            return this;
        }
        public Long getLatestConnectionTime() {
            return this.latestConnectionTime;
        }

        public DescribeDesktopSessionsResponseBodySessions setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopSessionsResponseBodySessions setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopSessionsResponseBodySessions setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopSessionsResponseBodySessions setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopSessionsResponseBodySessions setSessionEndTime(String sessionEndTime) {
            this.sessionEndTime = sessionEndTime;
            return this;
        }
        public String getSessionEndTime() {
            return this.sessionEndTime;
        }

        public DescribeDesktopSessionsResponseBodySessions setSessionIdleTime(Long sessionIdleTime) {
            this.sessionIdleTime = sessionIdleTime;
            return this;
        }
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        public DescribeDesktopSessionsResponseBodySessions setSessionStartTime(String sessionStartTime) {
            this.sessionStartTime = sessionStartTime;
            return this;
        }
        public String getSessionStartTime() {
            return this.sessionStartTime;
        }

        public DescribeDesktopSessionsResponseBodySessions setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeDesktopSessionsResponseBodySessions setTotalConnectionTime(Long totalConnectionTime) {
            this.totalConnectionTime = totalConnectionTime;
            return this;
        }
        public Long getTotalConnectionTime() {
            return this.totalConnectionTime;
        }

    }

}

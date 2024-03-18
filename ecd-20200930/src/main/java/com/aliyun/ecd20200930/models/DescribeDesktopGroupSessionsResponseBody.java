// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupSessionsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sessions.</p>
     */
    @NameInMap("Sessions")
    public java.util.List<DescribeDesktopGroupSessionsResponseBodySessions> sessions;

    /**
     * <p>The total number of sessions.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDesktopGroupSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupSessionsResponseBody self = new DescribeDesktopGroupSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopGroupSessionsResponseBody setSessions(java.util.List<DescribeDesktopGroupSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeDesktopGroupSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public DescribeDesktopGroupSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDesktopGroupSessionsResponseBodySessions extends TeaModel {
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
         * <p>The version of the client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the desktop group.</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the desktop group.</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>If the session is being established, the value of this parameter indicates the ID of the current cloud desktop. If the session is disconnected, the value of this parameter indicates the ID of the cloud desktop that was most recently connected.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The point in time when the end user applies for administrator assistance.</p>
         */
        @NameInMap("EndUserApplyCoordinateTime")
        public Long endUserApplyCoordinateTime;

        /**
         * <p>The ID of the end user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The end time of the most recent connection.</p>
         */
        @NameInMap("LastSessionEndTime")
        public String lastSessionEndTime;

        /**
         * <p>The start time of the most recent connection.</p>
         */
        @NameInMap("LastSessionStartTime")
        public String lastSessionStartTime;

        /**
         * <p>The duration of the most recent session.</p>
         */
        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the workspace.</p>
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
         * <p>The type of the session.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    single-session</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   1</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    multi-session</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OwnType")
        public Integer ownType;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The duration during which the cloud desktop stays in the Idle state.</p>
         */
        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        /**
         * <p>The state of the session.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Connected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Disconnected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The total duration of the sessions.</p>
         */
        @NameInMap("TotalConnectionDuration")
        public Long totalConnectionDuration;

        public static DescribeDesktopGroupSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupSessionsResponseBodySessions self = new DescribeDesktopGroupSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setClientOS(String clientOS) {
            this.clientOS = clientOS;
            return this;
        }
        public String getClientOS() {
            return this.clientOS;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setEndUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
            this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
            return this;
        }
        public Long getEndUserApplyCoordinateTime() {
            return this.endUserApplyCoordinateTime;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setLastSessionEndTime(String lastSessionEndTime) {
            this.lastSessionEndTime = lastSessionEndTime;
            return this;
        }
        public String getLastSessionEndTime() {
            return this.lastSessionEndTime;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setLastSessionStartTime(String lastSessionStartTime) {
            this.lastSessionStartTime = lastSessionStartTime;
            return this;
        }
        public String getLastSessionStartTime() {
            return this.lastSessionStartTime;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setLatestConnectionTime(Long latestConnectionTime) {
            this.latestConnectionTime = latestConnectionTime;
            return this;
        }
        public Long getLatestConnectionTime() {
            return this.latestConnectionTime;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setOwnType(Integer ownType) {
            this.ownType = ownType;
            return this;
        }
        public Integer getOwnType() {
            return this.ownType;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setSessionIdleTime(Long sessionIdleTime) {
            this.sessionIdleTime = sessionIdleTime;
            return this;
        }
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setTotalConnectionDuration(Long totalConnectionDuration) {
            this.totalConnectionDuration = totalConnectionDuration;
            return this;
        }
        public Long getTotalConnectionDuration() {
            return this.totalConnectionDuration;
        }

    }

}

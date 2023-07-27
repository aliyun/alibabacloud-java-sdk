// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<DescribeDesktopSessionsResponseBodySessions> sessions;

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
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientOS")
        public String clientOS;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("EndUserApplyCoordinateTime")
        public Long endUserApplyCoordinateTime;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("SessionEndTime")
        public String sessionEndTime;

        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        @NameInMap("SessionStartTime")
        public String sessionStartTime;

        @NameInMap("SessionStatus")
        public String sessionStatus;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3EC4A6DB-EC8D-55B0-9038-543DE671****</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>172.21.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The client OS.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_\&quot;Windows10Enterprise\&quot;10.0(Build22000)</p>
         */
        @NameInMap("ClientOS")
        public String clientOS;

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0-R-20221030.08****</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-g6t1ukbaea****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktop</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The duration of the remote assistance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("EndUserApplyCoordinateTime")
        public Long endUserApplyCoordinateTime;

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The duration of the last connection to the cloud computer. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-8904****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoOfficeSite</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("OsSessionStatus")
        public String osSessionStatus;

        /**
         * <p>The OS.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX</li>
         * <li>ASP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The end time of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-28T02:31:43Z</p>
         */
        @NameInMap("SessionEndTime")
        public String sessionEndTime;

        /**
         * <p>The idle duration of the session. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        /**
         * <p>The start time of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-28T02:31:43Z</p>
         */
        @NameInMap("SessionStartTime")
        public String sessionStartTime;

        /**
         * <p>The state of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Connected</li>
         * <li>Disconnected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <p>The total connection duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
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

        public DescribeDesktopSessionsResponseBodySessions setOsSessionStatus(String osSessionStatus) {
            this.osSessionStatus = osSessionStatus;
            return this;
        }
        public String getOsSessionStatus() {
            return this.osSessionStatus;
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

        public DescribeDesktopSessionsResponseBodySessions setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
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

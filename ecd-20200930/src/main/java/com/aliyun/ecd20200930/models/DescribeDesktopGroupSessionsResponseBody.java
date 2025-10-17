// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupSessionsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0920845-7359-59FC-9899-B****</p>
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
     * 
     * <strong>example:</strong>
     * <p>15</p>
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

    public static class DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wuying_mac_x86_64</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>Mac</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>96c530bc-6095-4014-8bbc-d461b8ac****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>EBFDC7773BEBAD418A9F89429652****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo self = new DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeDesktopGroupSessionsResponseBodySessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The OS that the client runs.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_\&quot;Windows10Enterprise\&quot;10.0(Build22000)</p>
         */
        @NameInMap("ClientOS")
        public String clientOS;

        /**
         * <p>The version of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0-R-20221030.08****</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-iaqu3bi2xtie****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>If the session is being established, the value of this parameter indicates the ID of the current cloud desktop. If the session is disconnected, the value of this parameter indicates the ID of the cloud desktop that was most recently connected.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-g6t1ukbaea****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The point in time when the end user applies for administrator assistance.</p>
         * 
         * <strong>example:</strong>
         * <p>1678794261000</p>
         */
        @NameInMap("EndUserApplyCoordinateTime")
        public Long endUserApplyCoordinateTime;

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>xianqiu</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The end time of the most recent connection.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31 06:56:45</p>
         */
        @NameInMap("LastSessionEndTime")
        public String lastSessionEndTime;

        /**
         * <p>The start time of the most recent connection.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31 06:56:45</p>
         */
        @NameInMap("LastSessionStartTime")
        public String lastSessionStartTime;

        /**
         * <p>The duration of the most recent session.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-8904****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The OS. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The type of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: single-session</li>
         * <li>1: multi-session</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnType")
        public Integer ownType;

        /**
         * <p>The type of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The duration during which the cloud desktop stays in the Idle state.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        /**
         * <p>The state of the session.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Connected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Disconnected</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("TerminalInfo")
        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo terminalInfo;

        /**
         * <p>The total duration of the sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalConnectionDuration")
        public Long totalConnectionDuration;

        public static DescribeDesktopGroupSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupSessionsResponseBodySessions self = new DescribeDesktopGroupSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupSessionsResponseBodySessions setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
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

        public DescribeDesktopGroupSessionsResponseBodySessions setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
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

        public DescribeDesktopGroupSessionsResponseBodySessions setTerminalInfo(DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo terminalInfo) {
            this.terminalInfo = terminalInfo;
            return this;
        }
        public DescribeDesktopGroupSessionsResponseBodySessionsTerminalInfo getTerminalInfo() {
            return this.terminalInfo;
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

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
     * <p>Details of sessions.</p>
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

    public static class DescribeDesktopSessionsResponseBodySessionsResourceGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-8whrmo2gtsb8bxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>RgTest</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDesktopSessionsResponseBodySessionsResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopSessionsResponseBodySessionsResourceGroups self = new DescribeDesktopSessionsResponseBodySessionsResourceGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopSessionsResponseBodySessionsResourceGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDesktopSessionsResponseBodySessionsResourceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDesktopSessionsResponseBodySessionsTerminalInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Mac</p>
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

        public static DescribeDesktopSessionsResponseBodySessionsTerminalInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopSessionsResponseBodySessionsTerminalInfo self = new DescribeDesktopSessionsResponseBodySessionsTerminalInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeDesktopSessionsResponseBodySessions extends TeaModel {
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
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

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

        /**
         * <p>Indicates whether the switch to check session status of cloud computers is turned on.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        @NameInMap("ResourceGroups")
        public java.util.List<DescribeDesktopSessionsResponseBodySessionsResourceGroups> resourceGroups;

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

        /**
         * <p>The billing method of cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>duration: hourly plan (available for users in the whitelist)</li>
         * <li>postPaid: pay-as-you-go</li>
         * <li>monthPackage: monthly subscription (120-hour computing plan and 250-hour computing plan)</li>
         * <li>prePaid: monthly subscription (Unlimited computing plan)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        @NameInMap("TerminalInfo")
        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo terminalInfo;

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

        public DescribeDesktopSessionsResponseBodySessions setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
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

        public DescribeDesktopSessionsResponseBodySessions setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
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

        public DescribeDesktopSessionsResponseBodySessions setResourceGroups(java.util.List<DescribeDesktopSessionsResponseBodySessionsResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public java.util.List<DescribeDesktopSessionsResponseBodySessionsResourceGroups> getResourceGroups() {
            return this.resourceGroups;
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

        public DescribeDesktopSessionsResponseBodySessions setTerminalInfo(DescribeDesktopSessionsResponseBodySessionsTerminalInfo terminalInfo) {
            this.terminalInfo = terminalInfo;
            return this;
        }
        public DescribeDesktopSessionsResponseBodySessionsTerminalInfo getTerminalInfo() {
            return this.terminalInfo;
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

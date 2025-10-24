// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessions> sessions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGlobalDesktopRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopRecordsResponseBody self = new DescribeGlobalDesktopRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDesktopRecordsResponseBody setSessions(java.util.List<DescribeGlobalDesktopRecordsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public DescribeGlobalDesktopRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-f3s3dgt8dtb0vlqc8</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>dms_test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups self = new DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class DescribeGlobalDesktopRecordsResponseBodySessionsSessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestUser</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <strong>example:</strong>
         * <p>2022-08-31T06:56:45Z</p>
         */
        @NameInMap("EstablishmentTime")
        public String establishmentTime;

        public static DescribeGlobalDesktopRecordsResponseBodySessionsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopRecordsResponseBodySessionsSessions self = new DescribeGlobalDesktopRecordsResponseBodySessionsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopRecordsResponseBodySessionsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessionsSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

    }

    public static class DescribeGlobalDesktopRecordsResponseBodySessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>dg-iaqu3bi2xtie****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <strong>example:</strong>
         * <p>DemoCCGroup</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <strong>example:</strong>
         * <p>ecd-g6t1ukbaea****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <strong>example:</strong>
         * <p>TestUser</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <strong>example:</strong>
         * <p>8GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("LatestConnectionTime")
        public Long latestConnectionTime;

        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-8904****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>TestOfficeSite</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <strong>example:</strong>
         * <p>Windows 10</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroups")
        public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups> resourceGroups;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("SessionIdleTime")
        public Long sessionIdleTime;

        @NameInMap("Sessions")
        public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsSessions> sessions;

        /**
         * <strong>example:</strong>
         * <p>1760583xxxx</p>
         */
        @NameInMap("StatusChangeTime")
        public Long statusChangeTime;

        /**
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("TotalConnectionTime")
        public Long totalConnectionTime;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("UpTime")
        public Long upTime;

        public static DescribeGlobalDesktopRecordsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopRecordsResponseBodySessions self = new DescribeGlobalDesktopRecordsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setLatestConnectionTime(Long latestConnectionTime) {
            this.latestConnectionTime = latestConnectionTime;
            return this;
        }
        public Long getLatestConnectionTime() {
            return this.latestConnectionTime;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setResourceGroups(java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setSessionIdleTime(Long sessionIdleTime) {
            this.sessionIdleTime = sessionIdleTime;
            return this;
        }
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setSessions(java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopRecordsResponseBodySessionsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setStatusChangeTime(Long statusChangeTime) {
            this.statusChangeTime = statusChangeTime;
            return this;
        }
        public Long getStatusChangeTime() {
            return this.statusChangeTime;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setTotalConnectionTime(Long totalConnectionTime) {
            this.totalConnectionTime = totalConnectionTime;
            return this;
        }
        public Long getTotalConnectionTime() {
            return this.totalConnectionTime;
        }

        public DescribeGlobalDesktopRecordsResponseBodySessions setUpTime(Long upTime) {
            this.upTime = upTime;
            return this;
        }
        public Long getUpTime() {
            return this.upTime;
        }

    }

}

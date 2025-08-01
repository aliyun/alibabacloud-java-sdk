// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListSupabaseProjectsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListSupabaseProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseProjectsResponseBody self = new ListSupabaseProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupabaseProjectsResponseBody setItems(java.util.List<ListSupabaseProjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSupabaseProjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSupabaseProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupabaseProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSupabaseProjectsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListSupabaseProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupabaseProjectsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListSupabaseProjectsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>xxpassword</p>
         */
        @NameInMap("DashboardPassword")
        public String dashboardPassword;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DashboardUserName")
        public String dashboardUserName;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>gpdb</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("PrivateConnectUrl")
        public String privateConnectUrl;

        /**
         * <strong>example:</strong>
         * <p>sbp-12***</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>supabase_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1C1G</p>
         */
        @NameInMap("ProjectSpec")
        public String projectSpec;

        /**
         * <strong>example:</strong>
         * <p>10.154.11.10</p>
         */
        @NameInMap("PublicConnectUrl")
        public String publicConnectUrl;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>vSwitch ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3oejns****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListSupabaseProjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSupabaseProjectsResponseBodyItems self = new ListSupabaseProjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSupabaseProjectsResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSupabaseProjectsResponseBodyItems setDashboardPassword(String dashboardPassword) {
            this.dashboardPassword = dashboardPassword;
            return this;
        }
        public String getDashboardPassword() {
            return this.dashboardPassword;
        }

        public ListSupabaseProjectsResponseBodyItems setDashboardUserName(String dashboardUserName) {
            this.dashboardUserName = dashboardUserName;
            return this;
        }
        public String getDashboardUserName() {
            return this.dashboardUserName;
        }

        public ListSupabaseProjectsResponseBodyItems setDiskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        public ListSupabaseProjectsResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListSupabaseProjectsResponseBodyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListSupabaseProjectsResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListSupabaseProjectsResponseBodyItems setPrivateConnectUrl(String privateConnectUrl) {
            this.privateConnectUrl = privateConnectUrl;
            return this;
        }
        public String getPrivateConnectUrl() {
            return this.privateConnectUrl;
        }

        public ListSupabaseProjectsResponseBodyItems setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListSupabaseProjectsResponseBodyItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSupabaseProjectsResponseBodyItems setProjectSpec(String projectSpec) {
            this.projectSpec = projectSpec;
            return this;
        }
        public String getProjectSpec() {
            return this.projectSpec;
        }

        public ListSupabaseProjectsResponseBodyItems setPublicConnectUrl(String publicConnectUrl) {
            this.publicConnectUrl = publicConnectUrl;
            return this;
        }
        public String getPublicConnectUrl() {
            return this.publicConnectUrl;
        }

        public ListSupabaseProjectsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSupabaseProjectsResponseBodyItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ListSupabaseProjectsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSupabaseProjectsResponseBodyItems setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public ListSupabaseProjectsResponseBodyItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListSupabaseProjectsResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSupabaseProjectsResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectsResponseBody extends TeaModel {
    /**
     * <p>A list of objects, where each object represents a Supabase instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSupabaseProjectsResponseBodyItems> items;

    /**
     * <p>The maximum amount of data to read this time. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token to use in the next request to get the next page. If this field is empty, there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log entries returned.</p>
     * 
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Supabase Dashboard password (not used).</p>
         * 
         * <strong>example:</strong>
         * <p>xxpassword</p>
         */
        @NameInMap("DashboardPassword")
        public String dashboardPassword;

        /**
         * <p>Supabase Dashboard user name (not used).</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DashboardUserName")
        public String dashboardUserName;

        /**
         * <p>The ESSD performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>gpdb</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Free</strong>: Free.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The private (VPC) connection URL for the Supabase Dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("PrivateConnectUrl")
        public String privateConnectUrl;

        /**
         * <p>The Supabase project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-12***</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the Supabase project.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The type of the Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1C1G</p>
         */
        @NameInMap("ProjectSpec")
        public String projectSpec;

        /**
         * <p>The public connection URL for the Supabase Dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>10.154.11.10</p>
         */
        @NameInMap("PublicConnectUrl")
        public String publicConnectUrl;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>A comma-separated list of IP addresses and CIDR blocks allowed to connect. Valid values:</p>
         * <ul>
         * <li>0.0.0.0/0</li>
         * <li>10.23.12.24(IP)</li>
         * <li>10.23.12.24/24. This is a CIDR block. The value<code>/24</code>indicates that the prefix of the CIDR block is 24-bit long. You can replace 24 with a value in the range of<code>[1,32]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The status of the Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The vSwitch ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3oejns****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
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

        public ListSupabaseProjectsResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The Supabase Dashboard password (Not Used)</p>
     * 
     * <strong>example:</strong>
     * <p>xxpassword</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <p>The Supabase Dashboard user name (Not Used)</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("DashboardUserName")
    public String dashboardUserName;

    /**
     * <p>The Enterprise SSD (ESSD) performance level of the cluster. Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("DiskPerformanceLevel")
    public String diskPerformanceLevel;

    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>postgres</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("Eni")
    public String eni;

    @NameInMap("InstanceVersion")
    public String instanceVersion;

    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The private (VPC) connection URL for the Supabase Dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.11</p>
     */
    @NameInMap("PrivateConnectUrl")
    public String privateConnectUrl;

    /**
     * <p>The Supabase instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-545434</p>
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
     * <p>The performance level of the Supabase instance.</p>
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
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A comma-separated list of IP addresses and CIDR blocks allowed to connect.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIpList")
    public String securityIpList;

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

    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The vSwitch ID of the instance. This parameter must be specified when VPCId is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/208327.html">DescribeRdsVpcs</a> operation to query the available VPC IDs.</p>
     * </li>
     * <li><p>This parameter is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp*******************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list and zone list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static GetSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectResponseBody self = new GetSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSupabaseProjectResponseBody setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public GetSupabaseProjectResponseBody setDashboardUserName(String dashboardUserName) {
        this.dashboardUserName = dashboardUserName;
        return this;
    }
    public String getDashboardUserName() {
        return this.dashboardUserName;
    }

    public GetSupabaseProjectResponseBody setDiskPerformanceLevel(String diskPerformanceLevel) {
        this.diskPerformanceLevel = diskPerformanceLevel;
        return this;
    }
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    public GetSupabaseProjectResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetSupabaseProjectResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public GetSupabaseProjectResponseBody setEni(String eni) {
        this.eni = eni;
        return this;
    }
    public String getEni() {
        return this.eni;
    }

    public GetSupabaseProjectResponseBody setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public GetSupabaseProjectResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetSupabaseProjectResponseBody setPrivateConnectUrl(String privateConnectUrl) {
        this.privateConnectUrl = privateConnectUrl;
        return this;
    }
    public String getPrivateConnectUrl() {
        return this.privateConnectUrl;
    }

    public GetSupabaseProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSupabaseProjectResponseBody setProjectSpec(String projectSpec) {
        this.projectSpec = projectSpec;
        return this;
    }
    public String getProjectSpec() {
        return this.projectSpec;
    }

    public GetSupabaseProjectResponseBody setPublicConnectUrl(String publicConnectUrl) {
        this.publicConnectUrl = publicConnectUrl;
        return this;
    }
    public String getPublicConnectUrl() {
        return this.publicConnectUrl;
    }

    public GetSupabaseProjectResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSupabaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupabaseProjectResponseBody setSecurityIpList(String securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public String getSecurityIpList() {
        return this.securityIpList;
    }

    public GetSupabaseProjectResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSupabaseProjectResponseBody setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public GetSupabaseProjectResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public GetSupabaseProjectResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public GetSupabaseProjectResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetSupabaseProjectResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

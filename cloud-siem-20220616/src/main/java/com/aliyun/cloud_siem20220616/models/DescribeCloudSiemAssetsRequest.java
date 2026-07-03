// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsRequest extends TeaModel {
    /**
     * <p>The asset name.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The asset type. Valid values:</p>
     * <ul>
     * <li><p>ip: IP address</p>
     * </li>
     * <li><p>domain: domain name</p>
     * </li>
     * <li><p>url: URL</p>
     * </li>
     * <li><p>process: process</p>
     * </li>
     * <li><p>file: file</p>
     * </li>
     * <li><p>host: host</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The UUID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>123456-2222-3333-5555-3435345****</p>
     */
    @NameInMap("AssetUuid")
    public String assetUuid;

    /**
     * <p>The page number. The value must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Data Management center of Threat Analysis is deployed. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: assets in the Chinese mainland or China (Hong Kong)</p>
     * </li>
     * <li><p>ap-southeast-1: assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose data you want to view. This parameter is available only when an administrator wants to switch to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static DescribeCloudSiemAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsRequest self = new DescribeCloudSiemAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeCloudSiemAssetsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public DescribeCloudSiemAssetsRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public DescribeCloudSiemAssetsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCloudSiemAssetsRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeCloudSiemAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudSiemAssetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudSiemAssetsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeCloudSiemAssetsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}

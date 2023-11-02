// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsRequest extends TeaModel {
    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudSiemAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsRequest self = new DescribeCloudSiemAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
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

}

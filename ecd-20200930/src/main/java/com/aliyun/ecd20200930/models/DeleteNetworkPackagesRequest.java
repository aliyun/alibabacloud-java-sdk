// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesRequest extends TeaModel {
    /**
     * <p>List of public network premium bandwidth IDs. You can specify one or more IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to obtain a list of regions where WUYING Workspace is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static DeleteNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesRequest self = new DeleteNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DeleteNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkPackagesRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

}

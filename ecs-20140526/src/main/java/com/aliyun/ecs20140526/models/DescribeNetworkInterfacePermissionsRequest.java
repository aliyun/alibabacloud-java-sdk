// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("NetworkInterfacePermissionId")
    public java.util.List<String> networkInterfacePermissionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeNetworkInterfacePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsRequest self = new DescribeNetworkInterfacePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacePermissionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInterfacePermissionsRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfacePermissionsRequest setNetworkInterfacePermissionId(java.util.List<String> networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
        return this;
    }
    public java.util.List<String> getNetworkInterfacePermissionId() {
        return this.networkInterfacePermissionId;
    }

    public DescribeNetworkInterfacePermissionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacePermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

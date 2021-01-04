// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UseUTCDateTime")
    public Boolean useUTCDateTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeStoragePackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesRequest self = new DescribeStoragePackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStoragePackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePackagesRequest setUseUTCDateTime(Boolean useUTCDateTime) {
        this.useUTCDateTime = useUTCDateTime;
        return this;
    }
    public Boolean getUseUTCDateTime() {
        return this.useUTCDateTime;
    }

    public DescribeStoragePackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}

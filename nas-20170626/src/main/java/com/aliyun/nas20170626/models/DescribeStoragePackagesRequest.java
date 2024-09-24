// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of storage plans to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether the time to return is in UTC.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true (default): returns UTC time.</li>
     * <li>false: returns UNIX timestamp.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseUTCDateTime")
    public Boolean useUTCDateTime;

    public static DescribeStoragePackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesRequest self = new DescribeStoragePackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoragePackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStoragePackagesRequest setUseUTCDateTime(Boolean useUTCDateTime) {
        this.useUTCDateTime = useUTCDateTime;
        return this;
    }
    public Boolean getUseUTCDateTime() {
        return this.useUTCDateTime;
    }

}

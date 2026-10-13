// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesRequest extends TeaModel {
    /**
     * <p>The page number of the list.</p>
     * <p>Start value (default value): 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of storage plans on each page during a paged query.</p>
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
     * <p>Specifies whether the returned time is in UTC format.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true (default): The returned time is in UTC format.</li>
     * <li>false: A UNIX timestamp is returned.</li>
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

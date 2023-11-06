// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of databases to return on each page. Valid values: **30**, **50**, and **100**.</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the PolarDB-X 1.0 instance is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsDBsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBsRequest self = new DescribeDrdsDBsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsDBsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDBsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDBsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsRequest extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 分页页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    // 全球加速实例状态
    @NameInMap("State")
    public String state;

    public static ListBasicAcceleratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsRequest self = new ListBasicAcceleratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListBasicAcceleratorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBasicAcceleratorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBasicAcceleratorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBasicAcceleratorsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}

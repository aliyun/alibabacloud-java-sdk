// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchValue")
    public String searchValue;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeLogMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorListRequest self = new DescribeLogMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLogMonitorListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogMonitorListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogMonitorListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeLogMonitorListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeHostAvailabilityListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListRequest self = new DescribeHostAvailabilityListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHostAvailabilityListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHostAvailabilityListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeHostAvailabilityListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeHostAvailabilityListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHostAvailabilityListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHostAvailabilityListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}

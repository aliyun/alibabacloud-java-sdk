// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the availability monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The IDs of the availability monitoring tasks. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123456,345678</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Minimum value: 1. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the availability monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_instance</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeHostAvailabilityListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListRequest self = new DescribeHostAvailabilityListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHostAvailabilityListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeHostAvailabilityListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeHostAvailabilityListRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
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

    public DescribeHostAvailabilityListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHostAvailabilityListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

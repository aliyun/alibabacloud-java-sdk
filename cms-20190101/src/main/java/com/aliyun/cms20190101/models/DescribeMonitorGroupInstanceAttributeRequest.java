// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Boolean total;

    @NameInMap("Category")
    public String category;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DescribeMonitorGroupInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstanceAttributeRequest self = new DescribeMonitorGroupInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setTotal(Boolean total) {
        this.total = total;
        return this;
    }
    public Boolean getTotal() {
        return this.total;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}

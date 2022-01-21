// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Total")
    public Boolean total;

    public static DescribeMonitorGroupInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstanceAttributeRequest self = new DescribeMonitorGroupInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstanceAttributeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
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

    public DescribeMonitorGroupInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorGroupInstanceAttributeRequest setTotal(Boolean total) {
        this.total = total;
        return this;
    }
    public Boolean getTotal() {
        return this.total;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the resource. Separate multiple resource IDs with commas (,). You can query the details about a maximum of 20 resources in each request.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keyword that is used to search for resources.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Valid values: 1 to 1000000000.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 1000000000.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return the total number of resources in the specified application group. Valid values:</p>
     * <br>
     * <p>*   true (default value)</p>
     * <p>*   false</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The abbreviation of the cloud service name.</p>
     * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The resource ID. Separate multiple resource IDs with commas (,). You can query the details about a maximum of 20 resources at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>i-m5e0k0bexac8tykr****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keyword that is used to search for resources.</p>
     * 
     * <strong>example:</strong>
     * <p>portal</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <p>Valid values: 1 to 1000000000.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 1000000000.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return the total number of resources in the specified application group. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

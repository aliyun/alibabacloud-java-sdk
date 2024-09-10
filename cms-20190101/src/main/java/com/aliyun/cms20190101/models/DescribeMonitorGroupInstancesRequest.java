// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The abbreviation of the cloud service name. Valid values of N: 1 to 200.</p>
     * <blockquote>
     * <p> For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
     * </blockquote>
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
     * <p>12345</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The instance ID. You can query multiple instances by specifying multiple IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>i-x1234568</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keyword used to search for instances. Fuzzy search based on instance names is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>s1</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesRequest self = new DescribeMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstancesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeMonitorGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeMonitorGroupInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitorGroupInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMonitorGroupInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

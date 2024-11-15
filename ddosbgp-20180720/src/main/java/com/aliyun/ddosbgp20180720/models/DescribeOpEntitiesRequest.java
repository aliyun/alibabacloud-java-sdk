// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time. Operation logs that were generated before this time are queried.**** The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640880000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the instance to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OpAction")
    public Integer opAction;

    /**
     * <p>The sorting method of operation logs. Set the value to <strong>opdate</strong>, which indicates sorting based on the operation time.</p>
     * 
     * <strong>example:</strong>
     * <p>opdate</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order of operation logs. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: the ascending order.</li>
     * <li><strong>DESC</strong>: the descending order.</li>
     * </ul>
     * <p>Default value: <strong>DESC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderDir")
    public String orderDir;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time. Operation logs that were generated after this time are queried.**** The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609430400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeOpEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesRequest self = new DescribeOpEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOpEntitiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOpEntitiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOpEntitiesRequest setOpAction(Integer opAction) {
        this.opAction = opAction;
        return this;
    }
    public Integer getOpAction() {
        return this.opAction;
    }

    public DescribeOpEntitiesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeOpEntitiesRequest setOrderDir(String orderDir) {
        this.orderDir = orderDir;
        return this;
    }
    public String getOrderDir() {
        return this.orderDir;
    }

    public DescribeOpEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOpEntitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOpEntitiesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeOpEntitiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

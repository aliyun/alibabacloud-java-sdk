// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesRequest extends TeaModel {
    /**
     * <p>The paging Settings for the current page number in a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp in milliseconds. Operation logs generated before this time are queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640880000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><strong>3</strong>: attach an IP address</li>
     * <li><strong>4</strong>: unbind an IP address</li>
     * <li><strong>5</strong>: decrease the quota</li>
     * <li><strong>6</strong>: deactivate blackhole filtering</li>
     * <li><strong>7</strong>: Reset quota on blackhole filtering deactivation</li>
     * <li><strong>8</strong>: recover burstable protection</li>
     * <li><strong>9</strong>: add an Asset group</li>
     * <li><strong>10</strong>: delete an Asset group</li>
     * <li><strong>11</strong>: enable daily 95th percentile bandwidth</li>
     * <li><strong>12</strong>: enable monthly 95th percentile bandwidth</li>
     * <li><strong>13</strong>: periodically switch between daily and monthly 95th percentile bandwidth patterns</li>
     * <li><strong>14</strong>: shutdown daily 95th percentile bandwidth</li>
     * <li><strong>15</strong>: shutdown monthly 95th percentile bandwidth</li>
     * <li><strong>16</strong>: shutdown burstable clean bandwidth due to overdue payments</li>
     * <li><strong>17</strong>: shutdown burstable clean bandwidth when they expire</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OpAction")
    public Integer opAction;

    /**
     * <p>The field by which to sort the operation logs. Set the value to <strong>opdate</strong>, which indicates that the operation logs are sorted by operation time.</p>
     * 
     * <strong>example:</strong>
     * <p>opdate</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order of the operation logs. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: ascending order</li>
     * <li><strong>DESC</strong>: descending order</li>
     * </ul>
     * <p>Default value: <strong>DESC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderDir")
    public String orderDir;

    /**
     * <p>The paging Settings for the number of Operation logs per page in a paged query. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the IDs of all regions supported by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp in milliseconds. Operation logs generated after this time are queried.</p>
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

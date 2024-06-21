// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>DescribeOpEntities</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the operation log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640880000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sort order of operation logs. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: the ascending order.</li>
     * <li><strong>DESC</strong>: the descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opdate</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderDir")
    public String orderDir;

    /**
     * <p>The type of the operation object. The value is fixed as <strong>1</strong>, which indicates Anti-DDoS Origin instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Alibaba Cloud account that performs the operation.</p>
     * <blockquote>
     * <p> If the value is <strong>system</strong>, the operation is performed by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The details about the operation. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><p><strong>entity</strong>: the operation object. Data type: object. The fields that are included in the value of the <strong>entity</strong> parameter vary based on the value of the <strong>OpAction</strong> parameter. Take note of the following items:</p>
     * <ul>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>3</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
     * <ul>
     * <li><strong>ips</strong>: the public IP addresses that are protected by the Anti-DDoS Origin instance. Data type: array</li>
     * </ul>
     * </li>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>4</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
     * <ul>
     * <li><strong>ips</strong>: the public IP addresses that are no longer protected by the Anti-DDoS Origin instance. Data type: array.</li>
     * </ul>
     * </li>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>5</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
     * <ul>
     * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
     * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
     * <li><strong>opSource</strong>: the source of the operation. The value is fixed as <strong>1</strong>, indicating that the operation is performed by Anti-DDoS Origin. Data type: integer.</li>
     * </ul>
     * </li>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>6</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
     * <ul>
     * <li><strong>ips</strong>: the public IP addresses for which to deactivate blackhole filtering. Data type: array.</li>
     * </ul>
     * </li>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>7</strong>, the <strong>entity</strong> parameter is not returned.</p>
     * </li>
     * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>8</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
     * <ul>
     * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
     * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sorting method of operation logs. Set the value to <strong>opdate</strong>, which indicates sorting based on the operation time.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosEventRequest extends TeaModel {
    /**
     * <p>The end time of the DDoS attack event to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638288000</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The attacked IP address to query.</p>
     * 
     * <strong>example:</strong>
     * <p>47.89.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the DDoS attack event to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1633017600</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventRequest self = new DescribeDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeDdosEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDdosEventRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDdosEventRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventCountByThreatLevelRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member in the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
     * <ul>
     * <li>0: view of the current Alibaba Cloud account.</li>
     * <li>1: view of all accounts for the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeEventCountByThreatLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventCountByThreatLevelRequest self = new DescribeEventCountByThreatLevelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventCountByThreatLevelRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeEventCountByThreatLevelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEventCountByThreatLevelRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeEventCountByThreatLevelRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeEventCountByThreatLevelRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

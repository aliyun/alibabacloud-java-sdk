// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEventRequest extends TeaModel {
    /**
     * <p>The title of the alert.</p>
     */
    @NameInMap("AlertTitle")
    public String alertTitle;

    /**
     * <p>The page number. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the event.</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>Specifies whether an attack is defended. Valid values:</p>
     * <br>
     * <p>*   0: detected</p>
     * <p>*   1: blocked</p>
     */
    @NameInMap("IsDefend")
    public String isDefend;

    /**
     * <p>The risk levels. The value is a JSON array. Valid values:</p>
     * <br>
     * <p>*   serious: high</p>
     * <p>*   suspicious: medium</p>
     * <p>*   remind: low</p>
     */
    @NameInMap("Level")
    public java.util.List<String> level;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The data source of the alert.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the account within which the alert is generated.</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    public static DescribeAlertsWithEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEventRequest self = new DescribeAlertsWithEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEventRequest setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }
    public String getAlertTitle() {
        return this.alertTitle;
    }

    public DescribeAlertsWithEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertsWithEventRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeAlertsWithEventRequest setIsDefend(String isDefend) {
        this.isDefend = isDefend;
        return this;
    }
    public String getIsDefend() {
        return this.isDefend;
    }

    public DescribeAlertsWithEventRequest setLevel(java.util.List<String> level) {
        this.level = level;
        return this;
    }
    public java.util.List<String> getLevel() {
        return this.level;
    }

    public DescribeAlertsWithEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertsWithEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertsWithEventRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAlertsWithEventRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeAlertsWithEventRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAlertsWithEventRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEventRequest extends TeaModel {
    @NameInMap("AlertTitle")
    public String alertTitle;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("IsDefend")
    public String isDefend;

    @NameInMap("Level")
    public java.util.List<String> level;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Source")
    public String source;

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

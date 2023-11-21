// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWhiteRuleListRequest extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeWhiteRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteRuleListRequest self = new DescribeWhiteRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteRuleListRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public DescribeWhiteRuleListRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public DescribeWhiteRuleListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteRuleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeWhiteRuleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

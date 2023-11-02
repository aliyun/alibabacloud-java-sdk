// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesRequest extends TeaModel {
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("ThreatLevel")
    public java.util.List<String> threatLevel;

    public static ListCloudSiemPredefinedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemPredefinedRulesRequest self = new ListCloudSiemPredefinedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemPredefinedRulesRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public ListCloudSiemPredefinedRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudSiemPredefinedRulesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCloudSiemPredefinedRulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListCloudSiemPredefinedRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudSiemPredefinedRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCloudSiemPredefinedRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListCloudSiemPredefinedRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListCloudSiemPredefinedRulesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCloudSiemPredefinedRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListCloudSiemPredefinedRulesRequest setThreatLevel(java.util.List<String> threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

}

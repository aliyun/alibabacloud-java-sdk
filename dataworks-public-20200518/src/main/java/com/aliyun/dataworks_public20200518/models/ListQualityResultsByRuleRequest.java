// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <br>
     * <p>This parameter is used together with the StartDate parameter. The interval between the time specified by this parameter and the time specified by the StartDate parameter cannot exceed 7 days.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source for which data quality is monitored.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the monitoring rule. You can use the ID and information such as a partition filter expression to perform a joint query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <br>
     * <p>This parameter is used together with the EndDate parameter. The interval between the time specified by this parameter and the time specified by the EndDate parameter cannot exceed 7 days.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ListQualityResultsByRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByRuleRequest self = new ListQualityResultsByRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByRuleRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListQualityResultsByRuleRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityResultsByRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityResultsByRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListQualityResultsByRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListQualityResultsByRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ListQualityResultsByRuleRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}

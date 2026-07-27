// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>You must configure this parameter together with the StartDate parameter. The time range to query cannot exceed 7 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-22 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source for which you want to perform data quality monitoring.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the monitoring rule. You can use the rule ID and a partition filter to query the monitoring results of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>152322134</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>You must configure this parameter together with the EndDate parameter. The time range to query cannot exceed 7 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-20 00:00:00</p>
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

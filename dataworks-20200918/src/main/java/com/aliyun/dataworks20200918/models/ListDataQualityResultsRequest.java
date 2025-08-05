// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsRequest extends TeaModel {
    @NameInMap("BizdateFrom")
    public String bizdateFrom;

    @NameInMap("BizdateTo")
    public String bizdateTo;

    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    @NameInMap("DataQualityEvaluationTaskInstanceId")
    public Long dataQualityEvaluationTaskInstanceId;

    @NameInMap("DataQualityRuleId")
    public Long dataQualityRuleId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListDataQualityResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityResultsRequest self = new ListDataQualityResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityResultsRequest setBizdateFrom(String bizdateFrom) {
        this.bizdateFrom = bizdateFrom;
        return this;
    }
    public String getBizdateFrom() {
        return this.bizdateFrom;
    }

    public ListDataQualityResultsRequest setBizdateTo(String bizdateTo) {
        this.bizdateTo = bizdateTo;
        return this;
    }
    public String getBizdateTo() {
        return this.bizdateTo;
    }

    public ListDataQualityResultsRequest setCreateTimeFrom(Long createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    public ListDataQualityResultsRequest setCreateTimeTo(Long createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    public ListDataQualityResultsRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public ListDataQualityResultsRequest setDataQualityEvaluationTaskInstanceId(Long dataQualityEvaluationTaskInstanceId) {
        this.dataQualityEvaluationTaskInstanceId = dataQualityEvaluationTaskInstanceId;
        return this;
    }
    public Long getDataQualityEvaluationTaskInstanceId() {
        return this.dataQualityEvaluationTaskInstanceId;
    }

    public ListDataQualityResultsRequest setDataQualityRuleId(Long dataQualityRuleId) {
        this.dataQualityRuleId = dataQualityRuleId;
        return this;
    }
    public Long getDataQualityRuleId() {
        return this.dataQualityRuleId;
    }

    public ListDataQualityResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityResultsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

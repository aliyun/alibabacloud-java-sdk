// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01</p>
     */
    @NameInMap("BizdateFrom")
    public String bizdateFrom;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-04</p>
     */
    @NameInMap("BizdateTo")
    public String bizdateTo;

    /**
     * <p>The earliest time when data quality verification results are generated.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <p>The latest generation time of data quality verification results.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <p>The ID of the data quality verification task.</p>
     * 
     * <strong>example:</strong>
     * <p>200001</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>The ID of the data quality verification task instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("DataQualityEvaluationTaskInstanceId")
    public Long dataQualityEvaluationTaskInstanceId;

    /**
     * <p>The ID of the data quality rule.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("DataQualityRuleId")
    public Long dataQualityRuleId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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

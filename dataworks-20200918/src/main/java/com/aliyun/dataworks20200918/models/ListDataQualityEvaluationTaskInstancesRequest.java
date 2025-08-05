// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTaskInstancesRequest extends TeaModel {
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

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("TriggerClient")
    public String triggerClient;

    @NameInMap("TriggerClientId")
    public String triggerClientId;

    public static ListDataQualityEvaluationTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTaskInstancesRequest self = new ListDataQualityEvaluationTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTaskInstancesRequest setBizdateFrom(String bizdateFrom) {
        this.bizdateFrom = bizdateFrom;
        return this;
    }
    public String getBizdateFrom() {
        return this.bizdateFrom;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setBizdateTo(String bizdateTo) {
        this.bizdateTo = bizdateTo;
        return this;
    }
    public String getBizdateTo() {
        return this.bizdateTo;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setCreateTimeFrom(Long createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setCreateTimeTo(Long createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setTriggerClient(String triggerClient) {
        this.triggerClient = triggerClient;
        return this;
    }
    public String getTriggerClient() {
        return this.triggerClient;
    }

    public ListDataQualityEvaluationTaskInstancesRequest setTriggerClientId(String triggerClientId) {
        this.triggerClientId = triggerClientId;
        return this;
    }
    public String getTriggerClientId() {
        return this.triggerClientId;
    }

}

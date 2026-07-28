// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The job type.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("jobType")
    public String jobType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Pending: The initial status after the job is created.</li>
     * <li>PlanQueued: After the job is created, if no workflow is available, the job is queued.</li>
     * <li>Planning: The resource job is in the Plan execution phase.</li>
     * <li>ConfigProactiveInProgress: Compliance pre-check is in progress. The compliance pre-check feature must be enabled for the account.</li>
     * <li>ConfigProactiveSuccess: Compliance pre-check succeeded. The compliance pre-check feature must be enabled for the account.</li>
     * <li>Planned: The resource job has completed the Plan execution.</li>
     * <li>PlannedAndFinished: After the Plan execution is complete, no diff is found. This is a final status.</li>
     * <li>Confirmed: The resource job is waiting for confirmation after the Plan execution is complete.</li>
     * <li>ApplyQueued: During job execution, if no workflow is available, the job is queued.</li>
     * <li>Applying: The resource job is in the Apply execution phase.</li>
     * <li>Applied: The resource job has completed the Apply execution. This is a final status.</li>
     * <li>Errored: The job execution encountered an error. This is a final status.</li>
     * <li>Canceled: The job execution was canceled. This is a final status.</li>
     * <li>Discarded: The plan of the resource job was discarded. This is a final status.</li>
     * <li>ConfigProactiveFailure: Compliance pre-check failed. The compliance pre-check feature must be enabled for the account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Errored</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>Task: regular task. This is the default value.</li>
     * <li>SceneTestingTask: scenario-based testing task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SceneTestingTask</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobsRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingSkillJobPageResponseBody extends TeaModel {
    /**
     * <p>The list of profiling tasks. For the element structure, see the descriptions of the child fields.</p>
     */
    @NameInMap("data")
    public java.util.List<ListMetaProfilingSkillJobPageResponseBodyData> data;

    /**
     * <p>The error code. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid or missing.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of records to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID used to locate and troubleshoot issues for this call.</p>
     * 
     * <strong>example:</strong>
     * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success, and a value of false indicates failure. If the call fails, troubleshoot the issue based on the errCode and errMessage parameters.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMetaProfilingSkillJobPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingSkillJobPageResponseBody self = new ListMetaProfilingSkillJobPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingSkillJobPageResponseBody setData(java.util.List<ListMetaProfilingSkillJobPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetaProfilingSkillJobPageResponseBodyData> getData() {
        return this.data;
    }

    public ListMetaProfilingSkillJobPageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMetaProfilingSkillJobPageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMetaProfilingSkillJobPageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingSkillJobPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingSkillJobPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaProfilingSkillJobPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaProfilingSkillJobPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaProfilingSkillJobPageResponseBodyData extends TeaModel {
        /**
         * <p>The component ID, which is the primary key identifier of the data source component.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("componentId")
        public Long componentId;

        /**
         * <p>The identifier of the current execution status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("currentTaskStatus")
        public Integer currentTaskStatus;

        /**
         * <p>The data component name.</p>
         * 
         * <strong>example:</strong>
         * <p>hive_cluster_a</p>
         */
        @NameInMap("dcName")
        public String dcName;

        /**
         * <p>The status identifier of the data component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dcStatus")
        public Integer dcStatus;

        /**
         * <p>The type identifier of the data component.</p>
         * 
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        @NameInMap("dcType")
        public String dcType;

        /**
         * <p>The number of differing nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("diffNodeNum")
        public Integer diffNodeNum;

        /**
         * <p>The number of differing partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("diffPartitionNum")
        public Integer diffPartitionNum;

        /**
         * <p>The number of differing tables.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("diffTableNum")
        public Integer diffTableNum;

        /**
         * <p>The number of differing workflows.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("diffWorkflowNum")
        public Integer diffWorkflowNum;

        /**
         * <p>The category type identifier of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>SOURCE</p>
         */
        @NameInMap("dsCategoryType")
        public String dsCategoryType;

        /**
         * <p>The time when the record was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>Indicates whether incremental changes exist.</p>
         */
        @NameInMap("hasIncrementChanges")
        public Boolean hasIncrementChanges;

        /**
         * <p>The primary key ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>7001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The description of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily full metadata profiling task</p>
         */
        @NameInMap("jobDesc")
        public String jobDesc;

        /**
         * <p>The profiling task name.</p>
         * 
         * <strong>example:</strong>
         * <p>profiling_daily</p>
         */
        @NameInMap("jobName")
        public String jobName;

        /**
         * <p>The status identifier of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("jobStatus")
        public Integer jobStatus;

        /**
         * <p>The ID of the most recent execution batch.</p>
         * 
         * <strong>example:</strong>
         * <p>20240719220000</p>
         */
        @NameInMap("lastBatchId")
        public String lastBatchId;

        /**
         * <p>The ID of the most recently executed task.</p>
         * 
         * <strong>example:</strong>
         * <p>8001</p>
         */
        @NameInMap("lastTaskId")
        public Long lastTaskId;

        /**
         * <p>The estimated time for the next scheduled execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-20 02:00:00</p>
         */
        @NameInMap("nextCronTime")
        public String nextCronTime;

        /**
         * <p>Indicates whether data profiling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("profilingEnable")
        public Integer profilingEnable;

        /**
         * <p>The list of schemas (databases) to be profiled.</p>
         */
        @NameInMap("profilingSchemaList")
        public java.util.List<String> profilingSchemaList;

        /**
         * <p>The identifier of the task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("taskExecResult")
        public Integer taskExecResult;

        /**
         * <p>The time when the task execution was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("taskFinishTime")
        public String taskFinishTime;

        /**
         * <p>The type identifier of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>PROFILING</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static ListMetaProfilingSkillJobPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaProfilingSkillJobPageResponseBodyData self = new ListMetaProfilingSkillJobPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setComponentId(Long componentId) {
            this.componentId = componentId;
            return this;
        }
        public Long getComponentId() {
            return this.componentId;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setCurrentTaskStatus(Integer currentTaskStatus) {
            this.currentTaskStatus = currentTaskStatus;
            return this;
        }
        public Integer getCurrentTaskStatus() {
            return this.currentTaskStatus;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDcName(String dcName) {
            this.dcName = dcName;
            return this;
        }
        public String getDcName() {
            return this.dcName;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDcStatus(Integer dcStatus) {
            this.dcStatus = dcStatus;
            return this;
        }
        public Integer getDcStatus() {
            return this.dcStatus;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDcType(String dcType) {
            this.dcType = dcType;
            return this;
        }
        public String getDcType() {
            return this.dcType;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDiffNodeNum(Integer diffNodeNum) {
            this.diffNodeNum = diffNodeNum;
            return this;
        }
        public Integer getDiffNodeNum() {
            return this.diffNodeNum;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDiffPartitionNum(Integer diffPartitionNum) {
            this.diffPartitionNum = diffPartitionNum;
            return this;
        }
        public Integer getDiffPartitionNum() {
            return this.diffPartitionNum;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDiffTableNum(Integer diffTableNum) {
            this.diffTableNum = diffTableNum;
            return this;
        }
        public Integer getDiffTableNum() {
            return this.diffTableNum;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDiffWorkflowNum(Integer diffWorkflowNum) {
            this.diffWorkflowNum = diffWorkflowNum;
            return this;
        }
        public Integer getDiffWorkflowNum() {
            return this.diffWorkflowNum;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setDsCategoryType(String dsCategoryType) {
            this.dsCategoryType = dsCategoryType;
            return this;
        }
        public String getDsCategoryType() {
            return this.dsCategoryType;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setHasIncrementChanges(Boolean hasIncrementChanges) {
            this.hasIncrementChanges = hasIncrementChanges;
            return this;
        }
        public Boolean getHasIncrementChanges() {
            return this.hasIncrementChanges;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public String getJobDesc() {
            return this.jobDesc;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setLastBatchId(String lastBatchId) {
            this.lastBatchId = lastBatchId;
            return this;
        }
        public String getLastBatchId() {
            return this.lastBatchId;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setLastTaskId(Long lastTaskId) {
            this.lastTaskId = lastTaskId;
            return this;
        }
        public Long getLastTaskId() {
            return this.lastTaskId;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setNextCronTime(String nextCronTime) {
            this.nextCronTime = nextCronTime;
            return this;
        }
        public String getNextCronTime() {
            return this.nextCronTime;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setProfilingEnable(Integer profilingEnable) {
            this.profilingEnable = profilingEnable;
            return this;
        }
        public Integer getProfilingEnable() {
            return this.profilingEnable;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setProfilingSchemaList(java.util.List<String> profilingSchemaList) {
            this.profilingSchemaList = profilingSchemaList;
            return this;
        }
        public java.util.List<String> getProfilingSchemaList() {
            return this.profilingSchemaList;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setTaskExecResult(Integer taskExecResult) {
            this.taskExecResult = taskExecResult;
            return this;
        }
        public Integer getTaskExecResult() {
            return this.taskExecResult;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setTaskFinishTime(String taskFinishTime) {
            this.taskFinishTime = taskFinishTime;
            return this;
        }
        public String getTaskFinishTime() {
            return this.taskFinishTime;
        }

        public ListMetaProfilingSkillJobPageResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunSemanticJobResponseBody extends TeaModel {
    /**
     * <p>The run information for this submission. A successful submission does not mean that the semantic model output has been generated. Use the detail operation to confirm the status before downloading results.</p>
     */
    @NameInMap("Data")
    public RunSemanticJobResponseBodyData data;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunSemanticJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSemanticJobResponseBody self = new RunSemanticJobResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSemanticJobResponseBody setData(RunSemanticJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunSemanticJobResponseBodyData getData() {
        return this.data;
    }

    public RunSemanticJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSemanticJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunSemanticJobResponseBodyData extends TeaModel {
        /**
         * <p>The current SQL fragment index returned by the executor in the submission response.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentSqlIndex")
        public Integer currentSqlIndex;

        /**
         * <p>The runtime environment identifier returned by the executor in the submission response.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The list of execution type codes returned by the executor in the submission response.</p>
         */
        @NameInMap("ExecTypes")
        public java.util.List<Integer> execTypes;

        /**
         * <p>The executor job identifier. Pass this value to the ExecutorJobId parameter of GetSemanticJobDetail, GetSemanticJobLog, or KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-job-demo</p>
         */
        @NameInMap("ExecutorJobId")
        public String executorJobId;

        /**
         * <p>The unique identifier of this run. Pass this value to the JobRunId parameter of DownloadSemanticResults to obtain the output of this run.</p>
         * 
         * <strong>example:</strong>
         * <p>01H00000000000000000000000</p>
         */
        @NameInMap("JobRunId")
        public String jobRunId;

        /**
         * <p>The list of status codes returned by the executor in the submission response. The status at the submission stage does not indicate that the results are complete.</p>
         */
        @NameInMap("Statuses")
        public java.util.List<Integer> statuses;

        public static RunSemanticJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunSemanticJobResponseBodyData self = new RunSemanticJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunSemanticJobResponseBodyData setCurrentSqlIndex(Integer currentSqlIndex) {
            this.currentSqlIndex = currentSqlIndex;
            return this;
        }
        public Integer getCurrentSqlIndex() {
            return this.currentSqlIndex;
        }

        public RunSemanticJobResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public RunSemanticJobResponseBodyData setExecTypes(java.util.List<Integer> execTypes) {
            this.execTypes = execTypes;
            return this;
        }
        public java.util.List<Integer> getExecTypes() {
            return this.execTypes;
        }

        public RunSemanticJobResponseBodyData setExecutorJobId(String executorJobId) {
            this.executorJobId = executorJobId;
            return this;
        }
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        public RunSemanticJobResponseBodyData setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

        public RunSemanticJobResponseBodyData setStatuses(java.util.List<Integer> statuses) {
            this.statuses = statuses;
            return this;
        }
        public java.util.List<Integer> getStatuses() {
            return this.statuses;
        }

    }

}

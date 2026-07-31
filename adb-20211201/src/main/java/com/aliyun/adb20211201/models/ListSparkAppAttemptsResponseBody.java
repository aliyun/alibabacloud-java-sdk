// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppAttemptsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListSparkAppAttemptsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkAppAttemptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppAttemptsResponseBody self = new ListSparkAppAttemptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkAppAttemptsResponseBody setData(ListSparkAppAttemptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkAppAttemptsResponseBodyData getData() {
        return this.data;
    }

    public ListSparkAppAttemptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkAppAttemptsResponseBodyData extends TeaModel {
        /**
         * <p>The list of retry information. Metric description:</p>
         * <ul>
         * <li><strong>AttemptId</strong>: the retry ID.</li>
         * <li><strong>State</strong>: the execute status of the application. Valid values:<ul>
         * <li><strong>SUBMITTED</strong>: commit.</li>
         * <li><strong>STARTING</strong>: starting.</li>
         * <li><strong>RUNNING</strong>: executing.</li>
         * <li><strong>FAILING</strong>: the node failed and the environment is being cleaned up.</li>
         * <li><strong>FAILED</strong>: failed.</li>
         * <li><strong>KILLING</strong>: aborting the task and cleaning up the environment.</li>
         * <li><strong>KILLED</strong>: the task is aborted.</li>
         * <li><strong>SUCCEEDING</strong>: the node execution is complete and the environment is being cleaned up.</li>
         * <li><strong>COMPLETED</strong>: the node execution is complete.</li>
         * <li><strong>FATAL</strong>: unexpected failure.</li>
         * <li><strong>UNKNOWN</strong>: unknown fault.</li>
         * </ul>
         * </li>
         * <li><strong>Message</strong>: the alerting message. This parameter is empty if no alerting is generated.</li>
         * <li><strong>Data</strong>: the Spark application template data.</li>
         * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: the CPU time consumed to execute the Spark application, in milliseconds (ms).</li>
         * <li><strong>LogRootPath</strong>: the storage path of log files.</li>
         * <li><strong>LastAttemptId</strong>: the ID of the last retry.</li>
         * <li><strong>WebUiAddress</strong>: the web UI address.</li>
         * <li><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was committed. This value is a UNIX timestamp in milliseconds (ms).</li>
         * <li><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. This value is a UNIX timestamp in milliseconds (ms).</li>
         * <li><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. This value is a UNIX timestamp in milliseconds (ms).</li>
         * <li><strong>TerminatedTimeInMillis</strong>: the time when the Spark application stopped executing. This value is a UNIX timestamp in milliseconds (ms).</li>
         * <li><strong>DBClusterId</strong>: the ID of the cluster that executes the Spark application.</li>
         * <li><strong>ResourceGroupName</strong>: the name of the Job-type resource group.</li>
         * <li><strong>DurationInMillis</strong>: the execution duration of the Spark application, in milliseconds (ms).</li>
         * </ul>
         */
        @NameInMap("AttemptInfoList")
        public java.util.List<SparkAttemptInfo> attemptInfoList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSparkAppAttemptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkAppAttemptsResponseBodyData self = new ListSparkAppAttemptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkAppAttemptsResponseBodyData setAttemptInfoList(java.util.List<SparkAttemptInfo> attemptInfoList) {
            this.attemptInfoList = attemptInfoList;
            return this;
        }
        public java.util.List<SparkAttemptInfo> getAttemptInfoList() {
            return this.attemptInfoList;
        }

        public ListSparkAppAttemptsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkAppAttemptsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkAppAttemptsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

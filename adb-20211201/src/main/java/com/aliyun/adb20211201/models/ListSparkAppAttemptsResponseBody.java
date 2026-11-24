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
         * <p>The retry information list. Response parameter description:</p>
         * <ul>
         * <li><strong>AttemptId</strong>: The retry ID.</li>
         * <li><strong>State</strong>: The execution state of the application. Valid values:<ul>
         * <li><strong>SUBMITTED</strong>: Submitted.</li>
         * <li><strong>STARTING</strong>: Starting.</li>
         * <li><strong>RUNNING</strong>: Running.</li>
         * <li><strong>FAILING</strong>: The task failed. Cleaning up the environment.</li>
         * <li><strong>FAILED</strong>: Failed.</li>
         * <li><strong>KILLING</strong>: Aborting the task. Cleaning up the environment.</li>
         * <li><strong>KILLED</strong>: The task aborted.</li>
         * <li><strong>SUCCEEDING</strong>: The task execution ended. Cleaning up the environment.</li>
         * <li><strong>COMPLETED</strong>: The task execution ended.</li>
         * <li><strong>FATAL</strong>: Unexpected failure.</li>
         * <li><strong>UNKNOWN</strong>: Unknown error.</li>
         * </ul>
         * </li>
         * <li><strong>Message</strong>: The alert information. If no alert is generated, an empty value is returned.</li>
         * <li><strong>Data</strong>: The Spark application template data.</li>
         * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: The CPU time consumed to execute the Spark application, in milliseconds.</li>
         * <li><strong>LogRootPath</strong>: The storage path of the log file.</li>
         * <li><strong>LastAttemptId</strong>: The ID of the last retry.</li>
         * <li><strong>WebUiAddress</strong>: The Web UI address.</li>
         * <li><strong>SubmittedTimeInMillis</strong>: The time when the Spark application was submitted. The value is a UNIX timestamp in milliseconds.</li>
         * <li><strong>StartedTimeInMillis</strong>: The time when the Spark application was created. The value is a UNIX timestamp in milliseconds.</li>
         * <li><strong>LastUpdatedTimeInMillis</strong>: The time when the Spark application was last updated. The value is a UNIX timestamp in milliseconds.</li>
         * <li><strong>TerminatedTimeInMillis</strong>: The time when the execution of the Spark application was stopped. The value is a UNIX timestamp in milliseconds.</li>
         * <li><strong>DBClusterId</strong>: The ID of the cluster where the Spark application is executed.</li>
         * <li><strong>ResourceGroupName</strong>: The name of the job resource group.</li>
         * <li><strong>DurationInMillis</strong>: The execution duration of the Spark application, in milliseconds.</li>
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

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
         * <p>The information about the attempts. Fields in the response parameter:</p>
         * <ul>
         * <li><p><strong>AttemptId</strong>: the attempt ID.</p>
         * </li>
         * <li><p><strong>State</strong>: the state of the Spark application. Valid values:</p>
         * <ul>
         * <li><strong>SUBMITTED</strong></li>
         * <li><strong>STARTING</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FAILING</strong></li>
         * <li><strong>FAILED</strong></li>
         * <li><strong>KILLING</strong></li>
         * <li><strong>KILLED</strong></li>
         * <li><strong>SUCCEEDING</strong></li>
         * <li><strong>COMPLETED</strong></li>
         * <li><strong>FATAL</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>Message</strong>: the alert message that is returned. If no alert is generated, null is returned.</p>
         * </li>
         * <li><p><strong>Data</strong>: the data of the Spark application template.</p>
         * </li>
         * <li><p><strong>EstimateExecutionCpuTimeInSeconds</strong>: the amount of time it takes to consume CPU resources for running the Spark application. Unit: milliseconds.</p>
         * </li>
         * <li><p><strong>LogRootPath</strong>: the storage path of log files.</p>
         * </li>
         * <li><p><strong>LastAttemptId</strong>: the ID of the last attempt.</p>
         * </li>
         * <li><p><strong>WebUiAddress</strong>: the web UI address.</p>
         * </li>
         * <li><p><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </li>
         * <li><p><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </li>
         * <li><p><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </li>
         * <li><p><strong>TerminatedTimeInMillis</strong>: the time when the Spark application task was terminated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </li>
         * <li><p><strong>DBClusterId</strong>: the ID of the cluster on which the Spark application runs.</p>
         * </li>
         * <li><p><strong>ResourceGroupName</strong>: the name of the job resource group.</p>
         * </li>
         * <li><p><strong>DurationInMillis</strong>: the amount of time it takes to run the Spark application. Unit: milliseconds.</p>
         * </li>
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
         * <p>The total number of entries returned.</p>
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

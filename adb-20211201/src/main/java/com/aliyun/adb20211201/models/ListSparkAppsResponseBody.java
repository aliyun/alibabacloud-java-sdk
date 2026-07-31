// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListSparkAppsResponseBodyData data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSparkAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppsResponseBody self = new ListSparkAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkAppsResponseBody setData(ListSparkAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkAppsResponseBodyData getData() {
        return this.data;
    }

    public ListSparkAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSparkAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSparkAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSparkAppsResponseBodyData extends TeaModel {
        /**
         * <p>The list of application information. Response parameter description:</p>
         * <ul>
         * <li><strong>Data</strong>: the Spark application template data.</li>
         * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: the CPU time consumed to execute the Spark application, in milliseconds (ms).</li>
         * <li><strong>LogRootPath</strong>: the storage path of log files.</li>
         * <li><strong>LastAttemptId</strong>: the retry ID.</li>
         * <li><strong>WebUiAddress</strong>: the Web UI address.</li>
         * <li><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was submitted, in UNIX timestamp format, in milliseconds (ms).</li>
         * <li><strong>StartedTimeInMillis</strong>: the time when the Spark application was created, in UNIX timestamp format, in milliseconds (ms).</li>
         * <li><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated, in UNIX timestamp format, in milliseconds (ms).</li>
         * <li><strong>TerminatedTimeInMillis</strong>: the time when the Spark application stopped execution, in UNIX timestamp format, in milliseconds (ms).</li>
         * <li><strong>DBClusterId</strong>: the ID of the cluster that executed the Spark application.</li>
         * <li><strong>ResourceGroupName</strong>: the name of the job resource group.</li>
         * <li><strong>DurationInMillis</strong>: the execution duration of the Spark application, in milliseconds (ms).</li>
         * </ul>
         */
        @NameInMap("AppInfoList")
        public java.util.List<SparkAppInfo> appInfoList;

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
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSparkAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkAppsResponseBodyData self = new ListSparkAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkAppsResponseBodyData setAppInfoList(java.util.List<SparkAppInfo> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }
        public java.util.List<SparkAppInfo> getAppInfoList() {
            return this.appInfoList;
        }

        public ListSparkAppsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkAppsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkAppsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

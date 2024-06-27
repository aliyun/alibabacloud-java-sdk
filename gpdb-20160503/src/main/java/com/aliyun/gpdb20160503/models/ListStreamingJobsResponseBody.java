// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingJobsResponseBody extends TeaModel {
    /**
     * <p>The queried jobs.</p>
     */
    @NameInMap("JobItems")
    public java.util.List<ListStreamingJobsResponseBodyJobItems> jobItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListStreamingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingJobsResponseBody self = new ListStreamingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamingJobsResponseBody setJobItems(java.util.List<ListStreamingJobsResponseBodyJobItems> jobItems) {
        this.jobItems = jobItems;
        return this;
    }
    public java.util.List<ListStreamingJobsResponseBodyJobItems> getJobItems() {
        return this.jobItems;
    }

    public ListStreamingJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStreamingJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListStreamingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamingJobsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListStreamingJobsResponseBodyJobItems extends TeaModel {
        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The delivery guarantee setting.</p>
         * 
         * <strong>example:</strong>
         * <p>ATLEAST / EXACTLY</p>
         */
        @NameInMap("Consistency")
        public String consistency;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test-kafka</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The mapped fields in the destination table.</p>
         */
        @NameInMap("DestColumns")
        public java.util.List<String> destColumns;

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-db</p>
         */
        @NameInMap("DestDatabase")
        public String destDatabase;

        /**
         * <p>The name of the destination namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-schema</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>The name of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-table</p>
         */
        @NameInMap("DestTable")
        public String destTable;

        /**
         * <p>The error message returned.</p>
         * <p>This parameter is returned only when the return value of <strong>Status</strong> is <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The fallback offset for data consumption.</p>
         * <ul>
         * <li>This parameter indicates the starting offset from which data consumption resumes when a consumer does not request a consumption offset or requests a consumption offset that is beyond the range of the offset information recorded in the current Kafka cluster. Valid values: EARLIEST and LATEST.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EARLIEST /  LATEST</p>
         */
        @NameInMap("FallbackOffset")
        public String fallbackOffset;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test job</p>
         */
        @NameInMap("JobDescription")
        public String jobDescription;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The update condition columns that are used to join the source data and the destination table. Typically, the columns are all the primary key columns of the destination table. If the values of all columns specified by this parameter in different rows are the same, the rows are considered duplicates.</p>
         */
        @NameInMap("MatchColumns")
        public java.util.List<String> matchColumns;

        /**
         * <p>The configuration mode. Valid values:</p>
         * <ol>
         * <li>basic: In basic mode, you must configure the configuration parameters.</li>
         * <li>professional: In professional mode, you can submit a YAML configuration file.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Basic / Professional</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd123</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The source fields.</p>
         */
        @NameInMap("SrcColumns")
        public java.util.List<String> srcColumns;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Exception</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The columns to be updated if a row of data meets the update condition. Typically, the columns are all non-primary key columns of the destination table. When the columns specified by the MatchColumns parameter are used as conditions to join the source data and the destination table, data in columns of the UpdateColumns type is updated if data is matched.</p>
         */
        @NameInMap("UpdateColumns")
        public java.util.List<String> updateColumns;

        /**
         * <p>The write mode.</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT/UPDATE/MERGE</p>
         */
        @NameInMap("WriteMode")
        public String writeMode;

        public static ListStreamingJobsResponseBodyJobItems build(java.util.Map<String, ?> map) throws Exception {
            ListStreamingJobsResponseBodyJobItems self = new ListStreamingJobsResponseBodyJobItems();
            return TeaModel.build(map, self);
        }

        public ListStreamingJobsResponseBodyJobItems setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListStreamingJobsResponseBodyJobItems setConsistency(String consistency) {
            this.consistency = consistency;
            return this;
        }
        public String getConsistency() {
            return this.consistency;
        }

        public ListStreamingJobsResponseBodyJobItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStreamingJobsResponseBodyJobItems setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListStreamingJobsResponseBodyJobItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListStreamingJobsResponseBodyJobItems setDestColumns(java.util.List<String> destColumns) {
            this.destColumns = destColumns;
            return this;
        }
        public java.util.List<String> getDestColumns() {
            return this.destColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setDestDatabase(String destDatabase) {
            this.destDatabase = destDatabase;
            return this;
        }
        public String getDestDatabase() {
            return this.destDatabase;
        }

        public ListStreamingJobsResponseBodyJobItems setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public ListStreamingJobsResponseBodyJobItems setDestTable(String destTable) {
            this.destTable = destTable;
            return this;
        }
        public String getDestTable() {
            return this.destTable;
        }

        public ListStreamingJobsResponseBodyJobItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListStreamingJobsResponseBodyJobItems setFallbackOffset(String fallbackOffset) {
            this.fallbackOffset = fallbackOffset;
            return this;
        }
        public String getFallbackOffset() {
            return this.fallbackOffset;
        }

        public ListStreamingJobsResponseBodyJobItems setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public ListStreamingJobsResponseBodyJobItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListStreamingJobsResponseBodyJobItems setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListStreamingJobsResponseBodyJobItems setMatchColumns(java.util.List<String> matchColumns) {
            this.matchColumns = matchColumns;
            return this;
        }
        public java.util.List<String> getMatchColumns() {
            return this.matchColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListStreamingJobsResponseBodyJobItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListStreamingJobsResponseBodyJobItems setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListStreamingJobsResponseBodyJobItems setSrcColumns(java.util.List<String> srcColumns) {
            this.srcColumns = srcColumns;
            return this;
        }
        public java.util.List<String> getSrcColumns() {
            return this.srcColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStreamingJobsResponseBodyJobItems setUpdateColumns(java.util.List<String> updateColumns) {
            this.updateColumns = updateColumns;
            return this;
        }
        public java.util.List<String> getUpdateColumns() {
            return this.updateColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setWriteMode(String writeMode) {
            this.writeMode = writeMode;
            return this;
        }
        public String getWriteMode() {
            return this.writeMode;
        }

    }

}

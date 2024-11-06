// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingJobResponseBody extends TeaModel {
    /**
     * <p>Target database account.</p>
     * 
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>Delivery guarantee.</p>
     * 
     * <strong>example:</strong>
     * <p>ATLEAST / EXACTLY</p>
     */
    @NameInMap("Consistency")
    public String consistency;

    /**
     * <p>Creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_kafka</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Target data table mapping field list.</p>
     */
    @NameInMap("DestColumns")
    public java.util.List<String> destColumns;

    /**
     * <p>Target database name.</p>
     * 
     * <strong>example:</strong>
     * <p>dest-db</p>
     */
    @NameInMap("DestDatabase")
    public String destDatabase;

    /**
     * <p>Target namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>dest-schema</p>
     */
    @NameInMap("DestSchema")
    public String destSchema;

    /**
     * <p>Target table name.</p>
     * 
     * <strong>example:</strong>
     * <p>dest-table</p>
     */
    @NameInMap("DestTable")
    public String destTable;

    /**
     * <p>When data in Kafka does not match the ADBPG target table, it can cause write failures. This value represents the number of error rows allowed; if exceeded, the task will fail.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ErrorLimitCount")
    public Integer errorLimitCount;

    /**
     * <p>Service status information, such as the reason for an exception. It is empty in the normal Running state.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Fallback offset, which is the fallback position</p>
     * <ul>
     * <li>The FallbackOffset parameter defines the behavior when the consumer has not requested a specific offset to consume or the requested offset exceeds the current record\&quot;s offset information in the Kafka cluster. You can choose to start consuming from the earliest (newest) or latest (oldest) offset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EARLIEST /  LATEST</p>
     */
    @NameInMap("FallbackOffset")
    public String fallbackOffset;

    /**
     * <p>Kafka group name</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Job configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>DATABASE: adbpgss_test
     * USER: adbpgss_test
     * PASSWORD: adbpgssTest
     * HOST: gp-xxx-master.gpdb.rds-aliyun-pre.rds.aliyuncs.com
     * PORT: 5432
     * KAFKA:
     *   INPUT:
     *     SOURCE:
     *       BROKERS: broker1:9092,broker2:9092,broker3:9092
     *       TOPIC: testtopic
     *       FALLBACK_OFFSET: earliest
     *     KEY:
     *       COLUMNS:
     *       - NAME: customer_id
     *         TYPE: int
     *       FORMAT: delimited
     *       DELIMITED_OPTION:
     *         DELIMITER: \&quot;|\&quot;
     *     VALUE:
     *       COLUMNS:
     *       - TYPE: integer
     *         NAME: l_orderkey
     *       - TYPE: integer
     *         NAME: l_partkey
     *       - TYPE: integer
     *         NAME: l_suppkey
     *       - TYPE: integer
     *         NAME: l_linenumber
     *       - TYPE: decimal
     *         NAME: l_quantity
     *       - TYPE: decimal
     *         NAME: l_extendedprice
     *       - TYPE: decimal
     *         NAME: l_discount
     *       - TYPE: decimal
     *         NAME: l_tax
     *       - TYPE: char
     *         NAME: l_returnflag
     *       - TYPE: char
     *         NAME: l_linestatus
     *       - TYPE: date
     *         NAME: l_shipdate
     *       - TYPE: date
     *         NAME: l_commitdate
     *       - TYPE: date
     *         NAME: l_receiptdate
     *       - TYPE: text
     *         NAME: l_shipinstruct
     *       - TYPE: text
     *         NAME: l_shipmode
     *       - TYPE: text
     *         NAME: l_comment
     *       FORMAT: delimited
     *       DELIMITED_OPTION:
     *         DELIMITER: \&quot;|\&quot;
     *     ERROR_LIMIT: 10
     *   OUTPUT:
     *     SCHEMA: adbpgss_test
     *     TABLE: write_with_insert_plaintext
     *     MODE: MERGE
     *     MATCH_COLUMNS:
     *     - l_orderkey
     *     - l_partkey
     *     - l_suppkey
     *     UPDATE_COLUMNS:
     *     - l_linenumber
     *     - l_quantity
     *     - l_extendedprice
     *     - l_discount
     *     - l_tax
     *     - l_returnflag
     *     - l_linestatus
     *     - l_shipdate
     *     - l_commitdate
     *     - l_receiptdate
     *     - l_shipinstruct
     *     - l_shipmode
     *     - l_comment
     *     MAPPING:
     *     - EXPRESSION: l_orderkey
     *       NAME: l_orderkey
     *     - EXPRESSION: l_partkey
     *       NAME: l_partkey
     *     - EXPRESSION: l_suppkey
     *       NAME: l_suppkey
     *     - EXPRESSION: l_linenumber
     *       NAME: l_linenumber
     *     - EXPRESSION: l_quantity
     *       NAME: l_quantity
     *     - EXPRESSION: l_extendedprice
     *       NAME: l_extendedprice
     *     - EXPRESSION: l_discount
     *       NAME: l_discount
     *     - EXPRESSION: l_tax
     *       NAME: l_tax
     *     - EXPRESSION: l_returnflag
     *       NAME: l_returnflag
     *     - EXPRESSION: l_linestatus
     *       NAME: l_linestatus
     *     - EXPRESSION: l_shipdate
     *       NAME: l_shipdate
     *     - EXPRESSION: l_commitdate
     *       NAME: l_commitdate
     *     - EXPRESSION: l_receiptdate
     *       NAME: l_receiptdate
     *     - EXPRESSION: l_shipinstruct
     *       NAME: l_shipinstruct
     *     - EXPRESSION: l_shipmode
     *       NAME: l_shipmode
     *     - EXPRESSION: l_comment
     *       NAME: l_comment
     *   COMMIT:
     *     MAX_ROW: 1000
     *     MINIMAL_INTERVAL: 1000
     *     CONSISTENCY: ATLEAST
     *   POLL:
     *     BATCHSIZE: 1000
     *     TIMEOUT: 1000
     *   PROPERTIES:
     *     group.id: testgroup</p>
     */
    @NameInMap("JobConfig")
    public String jobConfig;

    /**
     * <p>Job description.</p>
     * 
     * <strong>example:</strong>
     * <p>test_job</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Job name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>Match columns, usually all primary key columns of the target table. If all column values in this configuration are the same, the two rows of data are considered duplicates.</p>
     */
    @NameInMap("MatchColumns")
    public java.util.List<String> matchColumns;

    /**
     * <p>Configuration mode</p>
     * <ol>
     * <li>Basic mode requires specifying some configuration fields</li>
     * <li>Professional mode supports submitting YAML files</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>basic/professional</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Last modified time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T17:00:00Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>Target database password.</p>
     * 
     * <strong>example:</strong>
     * <p>pwd123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Source field list.</p>
     */
    @NameInMap("SrcColumns")
    public java.util.List<String> srcColumns;

    /**
     * <p>Service status, with possible values:</p>
     * <ul>
     * <li><p>Init: Initializing</p>
     * </li>
     * <li><p>Running: Running</p>
     * </li>
     * <li><p>Exception: Exception</p>
     * </li>
     * <li><p>Paused: Paused</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Update columns, usually all non-primary key columns of the target table. When data duplication is determined through MatchColumns, updating the UpdateColumns column values will result in new data overwriting old data.</p>
     */
    @NameInMap("UpdateColumns")
    public java.util.List<String> updateColumns;

    /**
     * <p>Write mode.</p>
     * 
     * <strong>example:</strong>
     * <p>INSERT/UPDATE/MERGE</p>
     */
    @NameInMap("WriteMode")
    public String writeMode;

    public static DescribeStreamingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingJobResponseBody self = new DescribeStreamingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingJobResponseBody setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeStreamingJobResponseBody setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public DescribeStreamingJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeStreamingJobResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeStreamingJobResponseBody setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeStreamingJobResponseBody setDestColumns(java.util.List<String> destColumns) {
        this.destColumns = destColumns;
        return this;
    }
    public java.util.List<String> getDestColumns() {
        return this.destColumns;
    }

    public DescribeStreamingJobResponseBody setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public DescribeStreamingJobResponseBody setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public DescribeStreamingJobResponseBody setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public DescribeStreamingJobResponseBody setErrorLimitCount(Integer errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Integer getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public DescribeStreamingJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStreamingJobResponseBody setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public DescribeStreamingJobResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeStreamingJobResponseBody setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public DescribeStreamingJobResponseBody setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public DescribeStreamingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeStreamingJobResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribeStreamingJobResponseBody setMatchColumns(java.util.List<String> matchColumns) {
        this.matchColumns = matchColumns;
        return this;
    }
    public java.util.List<String> getMatchColumns() {
        return this.matchColumns;
    }

    public DescribeStreamingJobResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeStreamingJobResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeStreamingJobResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeStreamingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamingJobResponseBody setSrcColumns(java.util.List<String> srcColumns) {
        this.srcColumns = srcColumns;
        return this;
    }
    public java.util.List<String> getSrcColumns() {
        return this.srcColumns;
    }

    public DescribeStreamingJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeStreamingJobResponseBody setUpdateColumns(java.util.List<String> updateColumns) {
        this.updateColumns = updateColumns;
        return this;
    }
    public java.util.List<String> getUpdateColumns() {
        return this.updateColumns;
    }

    public DescribeStreamingJobResponseBody setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}

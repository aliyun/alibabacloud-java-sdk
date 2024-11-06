// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingJobShrinkRequest extends TeaModel {
    /**
     * <p>Account name.</p>
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
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ModifyStreamingJob</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Target data table mapping field list.</p>
     */
    @NameInMap("DestColumns")
    public String destColumnsShrink;

    /**
     * <p>Target database name.</p>
     * 
     * <strong>example:</strong>
     * <p>dest-db</p>
     */
    @NameInMap("DestDatabase")
    public String destDatabase;

    /**
     * <p>Target schema.</p>
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
     * <p>When the data in Kafka does not match the ADBPG target table, it will cause a write failure. This value is the number of error rows allowed; exceeding this will cause the task to fail.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ErrorLimitCount")
    public Long errorLimitCount;

    /**
     * <p>FallbackOffset rollback position, offset rollback</p>
     * <ul>
     * <li>The FallbackOffset parameter defines the behavior when the consumer does not request a specific consumption point or the requested consumption point exceeds the current Kafka cluster\&quot;s recorded points. You can choose to start consuming from the earliest (newest) or latest (oldest) point.</li>
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
     * <p>group_name</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Job configuration file, required for professional mode.</p>
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
     * <p>test-job</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>Job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>Match columns, usually all primary key columns of the target table. If all column values in this configuration are the same, the two rows of data are considered duplicates.</p>
     */
    @NameInMap("MatchColumns")
    public String matchColumnsShrink;

    /**
     * <p>Password.</p>
     * 
     * <strong>example:</strong>
     * <p>pwd123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Source data field list.</p>
     */
    @NameInMap("SrcColumns")
    public String srcColumnsShrink;

    /**
     * <p>Whether to test the real-time task, values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TryRun")
    public Boolean tryRun;

    /**
     * <p>Update columns, usually all non-primary key columns of the target table. When data duplication is determined through MatchColumns, updating the UpdateColumns column values will result in new data overwriting old data.</p>
     */
    @NameInMap("UpdateColumns")
    public String updateColumnsShrink;

    /**
     * <p>Write mode.</p>
     * 
     * <strong>example:</strong>
     * <p>INSERT/UPDATE/MERGE</p>
     */
    @NameInMap("WriteMode")
    public String writeMode;

    public static ModifyStreamingJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingJobShrinkRequest self = new ModifyStreamingJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingJobShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyStreamingJobShrinkRequest setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public ModifyStreamingJobShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyStreamingJobShrinkRequest setDestColumnsShrink(String destColumnsShrink) {
        this.destColumnsShrink = destColumnsShrink;
        return this;
    }
    public String getDestColumnsShrink() {
        return this.destColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public ModifyStreamingJobShrinkRequest setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public ModifyStreamingJobShrinkRequest setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public ModifyStreamingJobShrinkRequest setErrorLimitCount(Long errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public ModifyStreamingJobShrinkRequest setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public ModifyStreamingJobShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyStreamingJobShrinkRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public ModifyStreamingJobShrinkRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public ModifyStreamingJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyStreamingJobShrinkRequest setMatchColumnsShrink(String matchColumnsShrink) {
        this.matchColumnsShrink = matchColumnsShrink;
        return this;
    }
    public String getMatchColumnsShrink() {
        return this.matchColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyStreamingJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStreamingJobShrinkRequest setSrcColumnsShrink(String srcColumnsShrink) {
        this.srcColumnsShrink = srcColumnsShrink;
        return this;
    }
    public String getSrcColumnsShrink() {
        return this.srcColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setTryRun(Boolean tryRun) {
        this.tryRun = tryRun;
        return this;
    }
    public Boolean getTryRun() {
        return this.tryRun;
    }

    public ModifyStreamingJobShrinkRequest setUpdateColumnsShrink(String updateColumnsShrink) {
        this.updateColumnsShrink = updateColumnsShrink;
        return this;
    }
    public String getUpdateColumnsShrink() {
        return this.updateColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}

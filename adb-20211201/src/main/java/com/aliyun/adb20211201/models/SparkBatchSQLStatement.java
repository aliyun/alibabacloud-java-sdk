// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkBatchSQLStatement extends TeaModel {
    /**
     * <p>The ID of the Spark job that executes the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>s20240122jsdx****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The text of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT 100</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution end timestamp of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The error message for the SQL statement execution.</p>
     * 
     * <strong>example:</strong>
     * <p>table is not found</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The execution result of the SQL statement. The content is in the response format of the <code>DataFrame Show</code> statement in Spark.</p>
     * 
     * <strong>example:</strong>
     * <p>+---+-----+
     * |age| name|
     * +---+-----+
     * | 14|  Tom|
     * | 23|Alice|
     * +---+-----+</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The Object Storage Service (OSS) location where the execution results of the SQL statement are stored. If you do not specify a storage location, null is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://yourbucket/result.json</p>
     */
    @NameInMap("ResultUri")
    public String resultUri;

    /**
     * <p>The execution start timestamp of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The execution status of the SQL statement. Valid values:</p>
     * <ul>
     * <li>FAILED</li>
     * <li>RUNNING</li>
     * <li>CANCELED</li>
     * <li>PENDING</li>
     * <li>FINISHED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>sq1723521767****-0001</p>
     */
    @NameInMap("StatementId")
    public String statementId;

    public static SparkBatchSQLStatement build(java.util.Map<String, ?> map) throws Exception {
        SparkBatchSQLStatement self = new SparkBatchSQLStatement();
        return TeaModel.build(map, self);
    }

    public SparkBatchSQLStatement setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SparkBatchSQLStatement setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SparkBatchSQLStatement setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SparkBatchSQLStatement setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public SparkBatchSQLStatement setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SparkBatchSQLStatement setResultUri(String resultUri) {
        this.resultUri = resultUri;
        return this;
    }
    public String getResultUri() {
        return this.resultUri;
    }

    public SparkBatchSQLStatement setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SparkBatchSQLStatement setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SparkBatchSQLStatement setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

}

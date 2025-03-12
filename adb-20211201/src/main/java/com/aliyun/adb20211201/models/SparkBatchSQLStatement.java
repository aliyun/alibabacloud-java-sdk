// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkBatchSQLStatement extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>s20240122jsdx****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>SELECT 100</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>table is not found</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <strong>example:</strong>
     * <p>JSON格式执行结果集</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>oss://yourbucket/result.json</p>
     */
    @NameInMap("ResultUri")
    public String resultUri;

    /**
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>amv-20240711-stmt</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkReplStatementResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ExecuteSparkReplStatementResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteSparkReplStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkReplStatementResponseBody self = new ExecuteSparkReplStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkReplStatementResponseBody setData(ExecuteSparkReplStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteSparkReplStatementResponseBodyData getData() {
        return this.data;
    }

    public ExecuteSparkReplStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteSparkReplStatementResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>17108278707****</p>
         */
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        /**
         * <p>The executed code.</p>
         * 
         * <strong>example:</strong>
         * <p>print(1+1)</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The execution status of the code. Valid values:</p>
         * <ul>
         * <li>CANCELLED: The execution is canceled.</li>
         * <li>RUNNING: The execution is in progress.</li>
         * <li>SUCCEEDED: The execution is successful.</li>
         * <li>ERROR: The execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CodeState")
        public String codeState;

        /**
         * <p>The type of the code. Valid values:</p>
         * <ul>
         * <li>SCALA</li>
         * <li>PYTHON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON</p>
         */
        @NameInMap("CodeType")
        public String codeType;

        /**
         * <p>The array of column names.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The end time. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730968125000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>StackOverflow Exception</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The code execution result. It is a JSON-formatted string that follows the Apache Livy output standard.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;text/plain&quot;: 2}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The serialization format of the execution result. The structure is a JSON object. Valid values:</p>
         * <ul>
         * <li>TEXT: The output is text content that follows the Apache Livy standard.</li>
         * <li>TABLE: The output is table content that follows the Apache Livy standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("OutputType")
        public String outputType;

        /**
         * <p>The start time. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730968125000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The unique ID of the code block in the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("StatementId")
        public Long statementId;

        public static ExecuteSparkReplStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteSparkReplStatementResponseBodyData self = new ExecuteSparkReplStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteSparkReplStatementResponseBodyData setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public ExecuteSparkReplStatementResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecuteSparkReplStatementResponseBodyData setCodeState(String codeState) {
            this.codeState = codeState;
            return this;
        }
        public String getCodeState() {
            return this.codeState;
        }

        public ExecuteSparkReplStatementResponseBodyData setCodeType(String codeType) {
            this.codeType = codeType;
            return this;
        }
        public String getCodeType() {
            return this.codeType;
        }

        public ExecuteSparkReplStatementResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ExecuteSparkReplStatementResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ExecuteSparkReplStatementResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ExecuteSparkReplStatementResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ExecuteSparkReplStatementResponseBodyData setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public ExecuteSparkReplStatementResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ExecuteSparkReplStatementResponseBodyData setStatementId(Long statementId) {
            this.statementId = statementId;
            return this;
        }
        public Long getStatementId() {
            return this.statementId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplStatementResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkReplStatementResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkReplStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplStatementResponseBody self = new GetSparkReplStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkReplStatementResponseBody setData(GetSparkReplStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkReplStatementResponseBodyData getData() {
        return this.data;
    }

    public GetSparkReplStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkReplStatementResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that owns the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>144740799645****</p>
         */
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        /**
         * <p>The code that is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>print(1+1)</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The code execution status. Valid values:</p>
         * <ul>
         * <li>CANCELLED</li>
         * <li>RUNNING</li>
         * <li>SUCCEEDED</li>
         * <li>ERROR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CodeState")
        public String codeState;

        /**
         * <p>The code type. Valid values:</p>
         * <ul>
         * <li>PYTHON</li>
         * <li>SCALA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON</p>
         */
        @NameInMap("CodeType")
        public String codeType;

        /**
         * <p>The column names.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The end time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1730968194000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>stackoverflow error</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The code execution result, which is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;text/plain&quot;: 2}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The execution result type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TABLE</li>
         * <li>TEXT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("OutputType")
        public String outputType;

        /**
         * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1730968194000</p>
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

        public static GetSparkReplStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkReplStatementResponseBodyData self = new GetSparkReplStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkReplStatementResponseBodyData setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public GetSparkReplStatementResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSparkReplStatementResponseBodyData setCodeState(String codeState) {
            this.codeState = codeState;
            return this;
        }
        public String getCodeState() {
            return this.codeState;
        }

        public GetSparkReplStatementResponseBodyData setCodeType(String codeType) {
            this.codeType = codeType;
            return this;
        }
        public String getCodeType() {
            return this.codeType;
        }

        public GetSparkReplStatementResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetSparkReplStatementResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetSparkReplStatementResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetSparkReplStatementResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetSparkReplStatementResponseBodyData setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public GetSparkReplStatementResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetSparkReplStatementResponseBodyData setStatementId(Long statementId) {
            this.statementId = statementId;
            return this;
        }
        public Long getStatementId() {
            return this.statementId;
        }

    }

}

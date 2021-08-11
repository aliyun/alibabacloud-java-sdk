// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceServerResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Functions")
    public java.util.List<QueryInferenceServerResponseBodyFunctions> functions;

    @NameInMap("Code")
    public String code;

    @NameInMap("TotalSize")
    public Long totalSize;

    public static QueryInferenceServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceServerResponseBody self = new QueryInferenceServerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInferenceServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInferenceServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInferenceServerResponseBody setFunctions(java.util.List<QueryInferenceServerResponseBodyFunctions> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<QueryInferenceServerResponseBodyFunctions> getFunctions() {
        return this.functions;
    }

    public QueryInferenceServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInferenceServerResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static class QueryInferenceServerResponseBodyFunctions extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("ModelPath")
        public String modelPath;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("TestId")
        public String testId;

        public static QueryInferenceServerResponseBodyFunctions build(java.util.Map<String, ?> map) throws Exception {
            QueryInferenceServerResponseBodyFunctions self = new QueryInferenceServerResponseBodyFunctions();
            return TeaModel.build(map, self);
        }

        public QueryInferenceServerResponseBodyFunctions setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public QueryInferenceServerResponseBodyFunctions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryInferenceServerResponseBodyFunctions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryInferenceServerResponseBodyFunctions setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public QueryInferenceServerResponseBodyFunctions setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public QueryInferenceServerResponseBodyFunctions setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryInferenceServerResponseBodyFunctions setTestId(String testId) {
            this.testId = testId;
            return this;
        }
        public String getTestId() {
            return this.testId;
        }

    }

}

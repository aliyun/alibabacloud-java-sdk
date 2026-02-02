// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-A***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result</p>
     */
    @NameInMap("Result")
    public EntVerifyResponseBodyResult result;

    public static EntVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntVerifyResponseBody self = new EntVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public EntVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntVerifyResponseBody setResult(EntVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EntVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class EntVerifyResponseBodyResultRiskVerifyResultModelResults extends TeaModel {
        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>model_1</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>Model result</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Result")
        public String result;

        public static EntVerifyResponseBodyResultRiskVerifyResultModelResults build(java.util.Map<String, ?> map) throws Exception {
            EntVerifyResponseBodyResultRiskVerifyResultModelResults self = new EntVerifyResponseBodyResultRiskVerifyResultModelResults();
            return TeaModel.build(map, self);
        }

        public EntVerifyResponseBodyResultRiskVerifyResultModelResults setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public EntVerifyResponseBodyResultRiskVerifyResultModelResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class EntVerifyResponseBodyResultRiskVerifyResult extends TeaModel {
        /**
         * <p>Whether found</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Found")
        public Boolean found;

        /**
         * <p>List of enterprise risk verification model results</p>
         */
        @NameInMap("ModelResults")
        public java.util.List<EntVerifyResponseBodyResultRiskVerifyResultModelResults> modelResults;

        public static EntVerifyResponseBodyResultRiskVerifyResult build(java.util.Map<String, ?> map) throws Exception {
            EntVerifyResponseBodyResultRiskVerifyResult self = new EntVerifyResponseBodyResultRiskVerifyResult();
            return TeaModel.build(map, self);
        }

        public EntVerifyResponseBodyResultRiskVerifyResult setFound(Boolean found) {
            this.found = found;
            return this;
        }
        public Boolean getFound() {
            return this.found;
        }

        public EntVerifyResponseBodyResultRiskVerifyResult setModelResults(java.util.List<EntVerifyResponseBodyResultRiskVerifyResultModelResults> modelResults) {
            this.modelResults = modelResults;
            return this;
        }
        public java.util.List<EntVerifyResponseBodyResultRiskVerifyResultModelResults> getModelResults() {
            return this.modelResults;
        }

    }

    public static class EntVerifyResponseBodyResult extends TeaModel {
        /**
         * <p>Enterprise risk verification result</p>
         */
        @NameInMap("RiskVerifyResult")
        public EntVerifyResponseBodyResultRiskVerifyResult riskVerifyResult;

        public static EntVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EntVerifyResponseBodyResult self = new EntVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EntVerifyResponseBodyResult setRiskVerifyResult(EntVerifyResponseBodyResultRiskVerifyResult riskVerifyResult) {
            this.riskVerifyResult = riskVerifyResult;
            return this;
        }
        public EntVerifyResponseBodyResultRiskVerifyResult getRiskVerifyResult() {
            return this.riskVerifyResult;
        }

    }

}

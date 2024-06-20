// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3RiskScoreResponseBody extends TeaModel {
    /**
     * <p>Return code. For the full list of codes, see Codes and Messages.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public DescribeWeb3RiskScoreResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response detailed message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which can be used to locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWeb3RiskScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3RiskScoreResponseBody self = new DescribeWeb3RiskScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3RiskScoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWeb3RiskScoreResponseBody setData(DescribeWeb3RiskScoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWeb3RiskScoreResponseBodyData getData() {
        return this.data;
    }

    public DescribeWeb3RiskScoreResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeWeb3RiskScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWeb3RiskScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWeb3RiskScoreResponseBodyDataRiskResults extends TeaModel {
        /**
         * <p>description</p>
         * 
         * <strong>example:</strong>
         * <p>incoming address risk critical xxxxxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>[ CRITICAL, HIGH, MEDIUM, LOW, NO ]
         * 100: Critical
         * 67-99: High risk
         * 34-66: Medium risk
         * 1-33: Low risk
         * 0: No risk</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>Address
         * Transaction</p>
         * 
         * <strong>example:</strong>
         * <p>Address</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeWeb3RiskScoreResponseBodyDataRiskResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3RiskScoreResponseBodyDataRiskResults self = new DescribeWeb3RiskScoreResponseBodyDataRiskResults();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3RiskScoreResponseBodyDataRiskResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWeb3RiskScoreResponseBodyDataRiskResults setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeWeb3RiskScoreResponseBodyDataRiskResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeWeb3RiskScoreResponseBodyData extends TeaModel {
        /**
         * <p>risk results</p>
         */
        @NameInMap("RiskResults")
        public java.util.List<DescribeWeb3RiskScoreResponseBodyDataRiskResults> riskResults;

        /**
         * <p>Risk score</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Score")
        public String score;

        public static DescribeWeb3RiskScoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWeb3RiskScoreResponseBodyData self = new DescribeWeb3RiskScoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWeb3RiskScoreResponseBodyData setRiskResults(java.util.List<DescribeWeb3RiskScoreResponseBodyDataRiskResults> riskResults) {
            this.riskResults = riskResults;
            return this;
        }
        public java.util.List<DescribeWeb3RiskScoreResponseBodyDataRiskResults> getRiskResults() {
            return this.riskResults;
        }

        public DescribeWeb3RiskScoreResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

}

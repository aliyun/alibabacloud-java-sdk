// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceGuardRiskResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of Success indicates that the API operation responded successfully. For more information about how to determine the authentication result, expand the <strong>Return codes</strong> section below.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A detailed description of the return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>595E387B-3F0E-5C52-BD02-8EFE63D41FD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object</p>
     */
    @NameInMap("Result")
    public FaceGuardRiskResponseBodyResult result;

    public static FaceGuardRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceGuardRiskResponseBody self = new FaceGuardRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceGuardRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceGuardRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceGuardRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceGuardRiskResponseBody setResult(FaceGuardRiskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceGuardRiskResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceGuardRiskResponseBodyResult extends TeaModel {
        /**
         * <p>The device risk probability predicted by the Device Guard algorithm. A higher score indicates a higher device risk.</p>
         * <p>Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GuardRiskScore")
        public Double guardRiskScore;

        /**
         * <p>Extended information. This is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;code&quot;: 200
         *   &quot;message&quot;:&quot;success&quot;
         *   &quot;umid&quot;:&quot;07d3295d3d597b425d102a7f********&quot;,
         *   &quot;sip&quot;:&quot;198.51.100.1&quot;,
         *   &quot;durationMs&quot; : 4968931
         *   &quot;queryCount&quot;:1,
         *   &quot;querySessionCount&quot;:1,
         *   &quot;queryUmidCount&quot;:1
         *   &quot;platform&quot;:&quot;Android
         * }</p>
         */
        @NameInMap("RiskExtends")
        public String riskExtends;

        /**
         * <p>The device risk tags. Multiple risk tags are separated by commas (<strong>,</strong>). For more information about the risk tags and their meanings, expand the <strong>Risk tags (RiskTags)</strong> section below.</p>
         * 
         * <strong>example:</strong>
         * <p>ROOT,VPN,HOOK</p>
         */
        @NameInMap("RiskTags")
        public String riskTags;

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hk573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceGuardRiskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceGuardRiskResponseBodyResult self = new FaceGuardRiskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceGuardRiskResponseBodyResult setGuardRiskScore(Double guardRiskScore) {
            this.guardRiskScore = guardRiskScore;
            return this;
        }
        public Double getGuardRiskScore() {
            return this.guardRiskScore;
        }

        public FaceGuardRiskResponseBodyResult setRiskExtends(String riskExtends) {
            this.riskExtends = riskExtends;
            return this;
        }
        public String getRiskExtends() {
            return this.riskExtends;
        }

        public FaceGuardRiskResponseBodyResult setRiskTags(String riskTags) {
            this.riskTags = riskTags;
            return this;
        }
        public String getRiskTags() {
            return this.riskTags;
        }

        public FaceGuardRiskResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}

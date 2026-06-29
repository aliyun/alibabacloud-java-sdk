// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResetGatewayQuotaRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200, 404, 500</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;key\&quot;: \&quot;value\&quot;}</p>
     */
    @NameInMap("data")
    public ResetGatewayQuotaRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>你好，世界！</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ResetGatewayQuotaRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetGatewayQuotaRuleResponseBody self = new ResetGatewayQuotaRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetGatewayQuotaRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetGatewayQuotaRuleResponseBody setData(ResetGatewayQuotaRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetGatewayQuotaRuleResponseBodyData getData() {
        return this.data;
    }

    public ResetGatewayQuotaRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetGatewayQuotaRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("conflictPeriodType")
        public String conflictPeriodType;

        /**
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        @NameInMap("conflictType")
        public String conflictType;

        /**
         * <strong>example:</strong>
         * <p>cs-d82n1g6m1hkm3xxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        public static ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems build(java.util.Map<String, ?> map) throws Exception {
            ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems self = new ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems();
            return TeaModel.build(map, self);
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictPeriodType(String conflictPeriodType) {
            this.conflictPeriodType = conflictPeriodType;
            return this;
        }
        public String getConflictPeriodType() {
            return this.conflictPeriodType;
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictType(String conflictType) {
            this.conflictType = conflictType;
            return this;
        }
        public String getConflictType() {
            return this.conflictType;
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

    }

    public static class ResetGatewayQuotaRuleResponseBodyDataConflictPreview extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
         */
        @NameInMap("conflictHash")
        public String conflictHash;

        @NameInMap("items")
        public java.util.List<ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("totalConflictCount")
        public Integer totalConflictCount;

        public static ResetGatewayQuotaRuleResponseBodyDataConflictPreview build(java.util.Map<String, ?> map) throws Exception {
            ResetGatewayQuotaRuleResponseBodyDataConflictPreview self = new ResetGatewayQuotaRuleResponseBodyDataConflictPreview();
            return TeaModel.build(map, self);
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreview setConflictHash(String conflictHash) {
            this.conflictHash = conflictHash;
            return this;
        }
        public String getConflictHash() {
            return this.conflictHash;
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreview setItems(java.util.List<ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ResetGatewayQuotaRuleResponseBodyDataConflictPreviewItems> getItems() {
            return this.items;
        }

        public ResetGatewayQuotaRuleResponseBodyDataConflictPreview setTotalConflictCount(Integer totalConflictCount) {
            this.totalConflictCount = totalConflictCount;
            return this;
        }
        public Integer getTotalConflictCount() {
            return this.totalConflictCount;
        }

    }

    public static class ResetGatewayQuotaRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("accepted")
        public Boolean accepted;

        @NameInMap("conflictPreview")
        public ResetGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <strong>example:</strong>
         * <p>qr-d8j7fpmm1hks65xxxx</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static ResetGatewayQuotaRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetGatewayQuotaRuleResponseBodyData self = new ResetGatewayQuotaRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetGatewayQuotaRuleResponseBodyData setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

        public ResetGatewayQuotaRuleResponseBodyData setConflictPreview(ResetGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview) {
            this.conflictPreview = conflictPreview;
            return this;
        }
        public ResetGatewayQuotaRuleResponseBodyDataConflictPreview getConflictPreview() {
            return this.conflictPreview;
        }

        public ResetGatewayQuotaRuleResponseBodyData setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ResetGatewayQuotaRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}

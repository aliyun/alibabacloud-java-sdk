// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayQuotaRuleResponseBody extends TeaModel {
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
    public UpdateGatewayQuotaRuleResponseBodyData data;

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

    public static UpdateGatewayQuotaRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayQuotaRuleResponseBody self = new UpdateGatewayQuotaRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayQuotaRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGatewayQuotaRuleResponseBody setData(UpdateGatewayQuotaRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayQuotaRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayQuotaRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayQuotaRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems extends TeaModel {
        @NameInMap("conflictPeriodType")
        public String conflictPeriodType;

        @NameInMap("conflictType")
        public String conflictType;

        /**
         * <strong>example:</strong>
         * <p>cs-d82n1g6m1hkm375xxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        public static UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems self = new UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictPeriodType(String conflictPeriodType) {
            this.conflictPeriodType = conflictPeriodType;
            return this;
        }
        public String getConflictPeriodType() {
            return this.conflictPeriodType;
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictType(String conflictType) {
            this.conflictType = conflictType;
            return this;
        }
        public String getConflictType() {
            return this.conflictType;
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

    }

    public static class UpdateGatewayQuotaRuleResponseBodyDataConflictPreview extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541f50xxxxxx</p>
         */
        @NameInMap("conflictHash")
        public String conflictHash;

        @NameInMap("items")
        public java.util.List<UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalConflictCount")
        public Integer totalConflictCount;

        public static UpdateGatewayQuotaRuleResponseBodyDataConflictPreview build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayQuotaRuleResponseBodyDataConflictPreview self = new UpdateGatewayQuotaRuleResponseBodyDataConflictPreview();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreview setConflictHash(String conflictHash) {
            this.conflictHash = conflictHash;
            return this;
        }
        public String getConflictHash() {
            return this.conflictHash;
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreview setItems(java.util.List<UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<UpdateGatewayQuotaRuleResponseBodyDataConflictPreviewItems> getItems() {
            return this.items;
        }

        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreview setTotalConflictCount(Integer totalConflictCount) {
            this.totalConflictCount = totalConflictCount;
            return this;
        }
        public Integer getTotalConflictCount() {
            return this.totalConflictCount;
        }

    }

    public static class UpdateGatewayQuotaRuleResponseBodyData extends TeaModel {
        @NameInMap("accepted")
        public Boolean accepted;

        @NameInMap("conflictPreview")
        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <strong>example:</strong>
         * <p>qr-xxxxxx</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static UpdateGatewayQuotaRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayQuotaRuleResponseBodyData self = new UpdateGatewayQuotaRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayQuotaRuleResponseBodyData setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

        public UpdateGatewayQuotaRuleResponseBodyData setConflictPreview(UpdateGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview) {
            this.conflictPreview = conflictPreview;
            return this;
        }
        public UpdateGatewayQuotaRuleResponseBodyDataConflictPreview getConflictPreview() {
            return this.conflictPreview;
        }

        public UpdateGatewayQuotaRuleResponseBodyData setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public UpdateGatewayQuotaRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}

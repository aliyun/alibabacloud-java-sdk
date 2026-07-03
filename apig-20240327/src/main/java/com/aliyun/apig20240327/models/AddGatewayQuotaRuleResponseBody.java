// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewayQuotaRuleResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200, 404, 500</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;key\&quot;: \&quot;value\&quot;}</p>
     */
    @NameInMap("data")
    public AddGatewayQuotaRuleResponseBodyData data;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>你好，世界！</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddGatewayQuotaRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayQuotaRuleResponseBody self = new AddGatewayQuotaRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGatewayQuotaRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddGatewayQuotaRuleResponseBody setData(AddGatewayQuotaRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddGatewayQuotaRuleResponseBodyData getData() {
        return this.data;
    }

    public AddGatewayQuotaRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGatewayQuotaRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems extends TeaModel {
        /**
         * <p>The period type of the existing conflicting rule on the consumer. Valid values:</p>
         * <ul>
         * <li>day: The period of the existing conflicting rule is day.</li>
         * <li>week: The period of the existing conflicting rule is week.</li>
         * <li>month: The period of the existing conflicting rule is month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("conflictPeriodType")
        public String conflictPeriodType;

        /**
         * <p>The type of the existing conflicting rule on the consumer. Valid values:</p>
         * <ul>
         * <li>calendar: The existing conflicting rule uses a calendar period.</li>
         * <li>epoch: The existing conflicting rule uses a custom period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        @NameInMap("conflictType")
        public String conflictType;

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        public static AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems self = new AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems();
            return TeaModel.build(map, self);
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictPeriodType(String conflictPeriodType) {
            this.conflictPeriodType = conflictPeriodType;
            return this;
        }
        public String getConflictPeriodType() {
            return this.conflictPeriodType;
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConflictType(String conflictType) {
            this.conflictType = conflictType;
            return this;
        }
        public String getConflictType() {
            return this.conflictType;
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

    }

    public static class AddGatewayQuotaRuleResponseBodyDataConflictPreview extends TeaModel {
        /**
         * <p>The conflict hash.</p>
         * 
         * <strong>example:</strong>
         * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
         */
        @NameInMap("conflictHash")
        public String conflictHash;

        /**
         * <p>The list of conflicting principals (consumers).</p>
         */
        @NameInMap("items")
        public java.util.List<AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items;

        /**
         * <p>The total number of conflicts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalConflictCount")
        public Integer totalConflictCount;

        public static AddGatewayQuotaRuleResponseBodyDataConflictPreview build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayQuotaRuleResponseBodyDataConflictPreview self = new AddGatewayQuotaRuleResponseBodyDataConflictPreview();
            return TeaModel.build(map, self);
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreview setConflictHash(String conflictHash) {
            this.conflictHash = conflictHash;
            return this;
        }
        public String getConflictHash() {
            return this.conflictHash;
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreview setItems(java.util.List<AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<AddGatewayQuotaRuleResponseBodyDataConflictPreviewItems> getItems() {
            return this.items;
        }

        public AddGatewayQuotaRuleResponseBodyDataConflictPreview setTotalConflictCount(Integer totalConflictCount) {
            this.totalConflictCount = totalConflictCount;
            return this;
        }
        public Integer getTotalConflictCount() {
            return this.totalConflictCount;
        }

    }

    public static class AddGatewayQuotaRuleResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the write request is accepted by the system. A value of false typically indicates a retryable scenario such as an unconfirmed conflict overwrite.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("accepted")
        public Boolean accepted;

        /**
         * <p>The conflict preview.</p>
         */
        @NameInMap("conflictPreview")
        public AddGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview;

        /**
         * <p>Indicates whether the request is a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-xxxxx</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static AddGatewayQuotaRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayQuotaRuleResponseBodyData self = new AddGatewayQuotaRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddGatewayQuotaRuleResponseBodyData setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

        public AddGatewayQuotaRuleResponseBodyData setConflictPreview(AddGatewayQuotaRuleResponseBodyDataConflictPreview conflictPreview) {
            this.conflictPreview = conflictPreview;
            return this;
        }
        public AddGatewayQuotaRuleResponseBodyDataConflictPreview getConflictPreview() {
            return this.conflictPreview;
        }

        public AddGatewayQuotaRuleResponseBodyData setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public AddGatewayQuotaRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}

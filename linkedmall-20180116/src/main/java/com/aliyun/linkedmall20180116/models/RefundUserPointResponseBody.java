// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RefundUserPointResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static RefundUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundUserPointResponseBody self = new RefundUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefundUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundUserPointResponseBody setModel(RefundUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RefundUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public RefundUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefundUserPointResponseBodyModel extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Action")
        public String action;

        @NameInMap("Amount")
        public Long amount;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizUid")
        public String bizUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("IdempotentId")
        public String idempotentId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Rest")
        public Long rest;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Status")
        public String status;

        public static RefundUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RefundUserPointResponseBodyModel self = new RefundUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RefundUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public RefundUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public RefundUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public RefundUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public RefundUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public RefundUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RefundUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RefundUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public RefundUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RefundUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public RefundUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public RefundUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public RefundUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

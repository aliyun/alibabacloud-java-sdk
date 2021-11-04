// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeductUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public DeductUserPointResponseBodyModel model;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeductUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeductUserPointResponseBody self = new DeductUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeductUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeductUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeductUserPointResponseBody setModel(DeductUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public DeductUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public DeductUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeductUserPointResponseBodyModel extends TeaModel {
        // 账号ID
        @NameInMap("AccountId")
        public String accountId;

        // 操作
        @NameInMap("Action")
        public String action;

        // 本次操作数额
        @NameInMap("Amount")
        public Long amount;

        // 业务ID
        @NameInMap("BizId")
        public String bizId;

        // 用户ID
        @NameInMap("BizUid")
        public String bizUid;

        // 描述
        @NameInMap("Description")
        public String description;

        // 扩展信息
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        // 幂等ID
        @NameInMap("IdempotentId")
        public String idempotentId;

        // 标题
        @NameInMap("Name")
        public String name;

        // 流水记录ID
        @NameInMap("RecordId")
        public String recordId;

        // 账户积分余额
        @NameInMap("Rest")
        public Long rest;

        // 规则ID
        @NameInMap("RuleId")
        public String ruleId;

        // 状态
        @NameInMap("Status")
        public String status;

        public static DeductUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            DeductUserPointResponseBodyModel self = new DeductUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public DeductUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DeductUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DeductUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public DeductUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DeductUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public DeductUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeductUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public DeductUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public DeductUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeductUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DeductUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public DeductUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DeductUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

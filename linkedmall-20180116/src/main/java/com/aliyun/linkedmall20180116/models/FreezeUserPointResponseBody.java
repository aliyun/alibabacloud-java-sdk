// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class FreezeUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public FreezeUserPointResponseBodyModel model;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static FreezeUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FreezeUserPointResponseBody self = new FreezeUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public FreezeUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FreezeUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FreezeUserPointResponseBody setModel(FreezeUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public FreezeUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public FreezeUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FreezeUserPointResponseBodyModel extends TeaModel {
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

        public static FreezeUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            FreezeUserPointResponseBodyModel self = new FreezeUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public FreezeUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public FreezeUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public FreezeUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public FreezeUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public FreezeUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public FreezeUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FreezeUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public FreezeUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public FreezeUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FreezeUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public FreezeUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public FreezeUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public FreezeUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UnFreezeUserPointResponseBodyModel extends TeaModel {
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

        public static UnFreezeUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UnFreezeUserPointResponseBodyModel self = new UnFreezeUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UnFreezeUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UnFreezeUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UnFreezeUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public UnFreezeUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public UnFreezeUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public UnFreezeUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UnFreezeUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public UnFreezeUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public UnFreezeUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UnFreezeUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public UnFreezeUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public UnFreezeUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UnFreezeUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

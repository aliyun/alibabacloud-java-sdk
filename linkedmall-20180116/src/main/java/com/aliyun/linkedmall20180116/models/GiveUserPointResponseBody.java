// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GiveUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GiveUserPointResponseBodyModel model;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GiveUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GiveUserPointResponseBody self = new GiveUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public GiveUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GiveUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GiveUserPointResponseBody setModel(GiveUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GiveUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public GiveUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GiveUserPointResponseBodyModel extends TeaModel {
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

        public static GiveUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GiveUserPointResponseBodyModel self = new GiveUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GiveUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GiveUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GiveUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public GiveUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GiveUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public GiveUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GiveUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public GiveUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public GiveUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GiveUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public GiveUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public GiveUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GiveUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

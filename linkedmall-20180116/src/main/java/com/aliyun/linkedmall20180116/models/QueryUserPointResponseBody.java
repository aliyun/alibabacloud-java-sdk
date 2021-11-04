// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryUserPointResponseBodyModel model;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static QueryUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserPointResponseBody self = new QueryUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserPointResponseBody setModel(QueryUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public QueryUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUserPointResponseBodyModel extends TeaModel {
        // 账户ID
        @NameInMap("AccountId")
        public String accountId;

        // 业务ID
        @NameInMap("BizId")
        public String bizId;

        // 业务方用户ID
        @NameInMap("BizUid")
        public String bizUid;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 当前积分余额
        @NameInMap("CurrentAmount")
        public Long currentAmount;

        // 当前冻结积分
        @NameInMap("FrozenAmount")
        public Long frozenAmount;

        // 历史累计积分
        @NameInMap("HistoryAmount")
        public Long historyAmount;

        // 账号等级
        @NameInMap("Level")
        public String level;

        // 修改时间
        @NameInMap("ModifyTime")
        public Long modifyTime;

        // 账号状态
        @NameInMap("Status")
        public String status;

        public static QueryUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserPointResponseBodyModel self = new QueryUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public QueryUserPointResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryUserPointResponseBodyModel setCurrentAmount(Long currentAmount) {
            this.currentAmount = currentAmount;
            return this;
        }
        public Long getCurrentAmount() {
            return this.currentAmount;
        }

        public QueryUserPointResponseBodyModel setFrozenAmount(Long frozenAmount) {
            this.frozenAmount = frozenAmount;
            return this;
        }
        public Long getFrozenAmount() {
            return this.frozenAmount;
        }

        public QueryUserPointResponseBodyModel setHistoryAmount(Long historyAmount) {
            this.historyAmount = historyAmount;
            return this;
        }
        public Long getHistoryAmount() {
            return this.historyAmount;
        }

        public QueryUserPointResponseBodyModel setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryUserPointResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

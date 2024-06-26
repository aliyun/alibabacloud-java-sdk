// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InviteUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InviteUserResponseBodyResult result;

    public static InviteUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteUserResponseBody self = new InviteUserResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InviteUserResponseBody setResult(InviteUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InviteUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class InviteUserResponseBodyResult extends TeaModel {
        @NameInMap("Bid")
        public String bid;

        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Email")
        public String email;

        @NameInMap("FromBid")
        public String fromBid;

        @NameInMap("FromUserId")
        public Integer fromUserId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public Integer userId;

        public static InviteUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InviteUserResponseBodyResult self = new InviteUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InviteUserResponseBodyResult setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public InviteUserResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public InviteUserResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public InviteUserResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public InviteUserResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public InviteUserResponseBodyResult setFromBid(String fromBid) {
            this.fromBid = fromBid;
            return this;
        }
        public String getFromBid() {
            return this.fromBid;
        }

        public InviteUserResponseBodyResult setFromUserId(Integer fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }
        public Integer getFromUserId() {
            return this.fromUserId;
        }

        public InviteUserResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public InviteUserResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public InviteUserResponseBodyResult setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LoginResult")
    public GetUserInfoResponseBodyLoginResult loginResult;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserInfoResponseBody setLoginResult(GetUserInfoResponseBodyLoginResult loginResult) {
        this.loginResult = loginResult;
        return this;
    }
    public GetUserInfoResponseBodyLoginResult getLoginResult() {
        return this.loginResult;
    }

    public GetUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserInfoResponseBodyLoginResult extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizUid")
        public String bizUid;

        @NameInMap("BizUserName")
        public String bizUserName;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmUserId")
        public Long lmUserId;

        @NameInMap("ReturnUrl")
        public String returnUrl;

        @NameInMap("SubBizId")
        public java.util.List<String> subBizId;

        public static GetUserInfoResponseBodyLoginResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyLoginResult self = new GetUserInfoResponseBodyLoginResult();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyLoginResult setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetUserInfoResponseBodyLoginResult setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public GetUserInfoResponseBodyLoginResult setBizUserName(String bizUserName) {
            this.bizUserName = bizUserName;
            return this;
        }
        public String getBizUserName() {
            return this.bizUserName;
        }

        public GetUserInfoResponseBodyLoginResult setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public GetUserInfoResponseBodyLoginResult setLmUserId(Long lmUserId) {
            this.lmUserId = lmUserId;
            return this;
        }
        public Long getLmUserId() {
            return this.lmUserId;
        }

        public GetUserInfoResponseBodyLoginResult setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

        public GetUserInfoResponseBodyLoginResult setSubBizId(java.util.List<String> subBizId) {
            this.subBizId = subBizId;
            return this;
        }
        public java.util.List<String> getSubBizId() {
            return this.subBizId;
        }

    }

}

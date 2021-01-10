// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginResult")
    public GetUserInfoResponseBodyLoginResult loginResult;

    @NameInMap("Code")
    public String code;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
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

    public GetUserInfoResponseBody setLoginResult(GetUserInfoResponseBodyLoginResult loginResult) {
        this.loginResult = loginResult;
        return this;
    }
    public GetUserInfoResponseBodyLoginResult getLoginResult() {
        return this.loginResult;
    }

    public GetUserInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetUserInfoResponseBodyLoginResult extends TeaModel {
        @NameInMap("ReturnUrl")
        public String returnUrl;

        @NameInMap("BizUserName")
        public String bizUserName;

        @NameInMap("BizUid")
        public String bizUid;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("SubBizId")
        public java.util.List<String> subBizId;

        @NameInMap("LmUserId")
        public Long lmUserId;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        public static GetUserInfoResponseBodyLoginResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyLoginResult self = new GetUserInfoResponseBodyLoginResult();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyLoginResult setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

        public GetUserInfoResponseBodyLoginResult setBizUserName(String bizUserName) {
            this.bizUserName = bizUserName;
            return this;
        }
        public String getBizUserName() {
            return this.bizUserName;
        }

        public GetUserInfoResponseBodyLoginResult setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public GetUserInfoResponseBodyLoginResult setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetUserInfoResponseBodyLoginResult setSubBizId(java.util.List<String> subBizId) {
            this.subBizId = subBizId;
            return this;
        }
        public java.util.List<String> getSubBizId() {
            return this.subBizId;
        }

        public GetUserInfoResponseBodyLoginResult setLmUserId(Long lmUserId) {
            this.lmUserId = lmUserId;
            return this;
        }
        public Long getLmUserId() {
            return this.lmUserId;
        }

        public GetUserInfoResponseBodyLoginResult setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("LoginResult")
    @Validation(required = true)
    public GetUserInfoResponseLoginResult loginResult;

    public static GetUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponse self = new GetUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserInfoResponse setLoginResult(GetUserInfoResponseLoginResult loginResult) {
        this.loginResult = loginResult;
        return this;
    }
    public GetUserInfoResponseLoginResult getLoginResult() {
        return this.loginResult;
    }

    public static class GetUserInfoResponseLoginResult extends TeaModel {
        @NameInMap("LmUserId")
        @Validation(required = true)
        public Long lmUserId;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("BizUid")
        @Validation(required = true)
        public String bizUid;

        @NameInMap("BizUserName")
        @Validation(required = true)
        public String bizUserName;

        @NameInMap("ReturnUrl")
        @Validation(required = true)
        public String returnUrl;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        @NameInMap("SubBizId")
        @Validation(required = true)
        public java.util.List<String> subBizId;

        public static GetUserInfoResponseLoginResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseLoginResult self = new GetUserInfoResponseLoginResult();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseLoginResult setLmUserId(Long lmUserId) {
            this.lmUserId = lmUserId;
            return this;
        }
        public Long getLmUserId() {
            return this.lmUserId;
        }

        public GetUserInfoResponseLoginResult setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetUserInfoResponseLoginResult setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public GetUserInfoResponseLoginResult setBizUserName(String bizUserName) {
            this.bizUserName = bizUserName;
            return this;
        }
        public String getBizUserName() {
            return this.bizUserName;
        }

        public GetUserInfoResponseLoginResult setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }
        public String getReturnUrl() {
            return this.returnUrl;
        }

        public GetUserInfoResponseLoginResult setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public GetUserInfoResponseLoginResult setSubBizId(java.util.List<String> subBizId) {
            this.subBizId = subBizId;
            return this;
        }
        public java.util.List<String> getSubBizId() {
            return this.subBizId;
        }

    }

}

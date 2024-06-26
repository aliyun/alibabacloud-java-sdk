// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumInvitationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateEthereumInvitationResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEthereumInvitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumInvitationResponseBody self = new CreateEthereumInvitationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEthereumInvitationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateEthereumInvitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEthereumInvitationResponseBody setResult(CreateEthereumInvitationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEthereumInvitationResponseBodyResult getResult() {
        return this.result;
    }

    public CreateEthereumInvitationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEthereumInvitationResponseBodyResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Token")
        public String token;

        public static CreateEthereumInvitationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEthereumInvitationResponseBodyResult self = new CreateEthereumInvitationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEthereumInvitationResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateEthereumInvitationResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEthereumInvitationResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateEthereumInvitationResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}

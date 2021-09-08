// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetupStudioAppAuthModeOpenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public SetupStudioAppAuthModeOpenResponseData data;

    public static SetupStudioAppAuthModeOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupStudioAppAuthModeOpenResponse self = new SetupStudioAppAuthModeOpenResponse();
        return TeaModel.build(map, self);
    }

    public SetupStudioAppAuthModeOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupStudioAppAuthModeOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetupStudioAppAuthModeOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetupStudioAppAuthModeOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetupStudioAppAuthModeOpenResponse setData(SetupStudioAppAuthModeOpenResponseData data) {
        this.data = data;
        return this;
    }
    public SetupStudioAppAuthModeOpenResponseData getData() {
        return this.data;
    }

    public static class SetupStudioAppAuthModeOpenResponseDataTokenInfo extends TeaModel {
        @NameInMap("IsEnable")
        @Validation(required = true)
        public String isEnable;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        public static SetupStudioAppAuthModeOpenResponseDataTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            SetupStudioAppAuthModeOpenResponseDataTokenInfo self = new SetupStudioAppAuthModeOpenResponseDataTokenInfo();
            return TeaModel.build(map, self);
        }

        public SetupStudioAppAuthModeOpenResponseDataTokenInfo setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public SetupStudioAppAuthModeOpenResponseDataTokenInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetupStudioAppAuthModeOpenResponseDataTokenInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public SetupStudioAppAuthModeOpenResponseDataTokenInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public SetupStudioAppAuthModeOpenResponseDataTokenInfo setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

    public static class SetupStudioAppAuthModeOpenResponseData extends TeaModel {
        @NameInMap("AuthMode")
        @Validation(required = true)
        public Integer authMode;

        @NameInMap("TokenInfo")
        @Validation(required = true)
        public SetupStudioAppAuthModeOpenResponseDataTokenInfo tokenInfo;

        public static SetupStudioAppAuthModeOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            SetupStudioAppAuthModeOpenResponseData self = new SetupStudioAppAuthModeOpenResponseData();
            return TeaModel.build(map, self);
        }

        public SetupStudioAppAuthModeOpenResponseData setAuthMode(Integer authMode) {
            this.authMode = authMode;
            return this;
        }
        public Integer getAuthMode() {
            return this.authMode;
        }

        public SetupStudioAppAuthModeOpenResponseData setTokenInfo(SetupStudioAppAuthModeOpenResponseDataTokenInfo tokenInfo) {
            this.tokenInfo = tokenInfo;
            return this;
        }
        public SetupStudioAppAuthModeOpenResponseDataTokenInfo getTokenInfo() {
            return this.tokenInfo;
        }

    }

}

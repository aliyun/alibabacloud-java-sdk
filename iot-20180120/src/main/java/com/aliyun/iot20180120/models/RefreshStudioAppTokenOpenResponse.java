// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshStudioAppTokenOpenResponse extends TeaModel {
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
    public RefreshStudioAppTokenOpenResponseData data;

    public static RefreshStudioAppTokenOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshStudioAppTokenOpenResponse self = new RefreshStudioAppTokenOpenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshStudioAppTokenOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshStudioAppTokenOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RefreshStudioAppTokenOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshStudioAppTokenOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RefreshStudioAppTokenOpenResponse setData(RefreshStudioAppTokenOpenResponseData data) {
        this.data = data;
        return this;
    }
    public RefreshStudioAppTokenOpenResponseData getData() {
        return this.data;
    }

    public static class RefreshStudioAppTokenOpenResponseData extends TeaModel {
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

        public static RefreshStudioAppTokenOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            RefreshStudioAppTokenOpenResponseData self = new RefreshStudioAppTokenOpenResponseData();
            return TeaModel.build(map, self);
        }

        public RefreshStudioAppTokenOpenResponseData setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public RefreshStudioAppTokenOpenResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RefreshStudioAppTokenOpenResponseData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public RefreshStudioAppTokenOpenResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public RefreshStudioAppTokenOpenResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}

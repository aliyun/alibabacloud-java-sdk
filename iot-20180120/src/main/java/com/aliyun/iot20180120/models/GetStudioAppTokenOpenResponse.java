// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetStudioAppTokenOpenResponse extends TeaModel {
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
    public GetStudioAppTokenOpenResponseData data;

    public static GetStudioAppTokenOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStudioAppTokenOpenResponse self = new GetStudioAppTokenOpenResponse();
        return TeaModel.build(map, self);
    }

    public GetStudioAppTokenOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStudioAppTokenOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStudioAppTokenOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStudioAppTokenOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStudioAppTokenOpenResponse setData(GetStudioAppTokenOpenResponseData data) {
        this.data = data;
        return this;
    }
    public GetStudioAppTokenOpenResponseData getData() {
        return this.data;
    }

    public static class GetStudioAppTokenOpenResponseData extends TeaModel {
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

        public static GetStudioAppTokenOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetStudioAppTokenOpenResponseData self = new GetStudioAppTokenOpenResponseData();
            return TeaModel.build(map, self);
        }

        public GetStudioAppTokenOpenResponseData setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public GetStudioAppTokenOpenResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStudioAppTokenOpenResponseData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetStudioAppTokenOpenResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetStudioAppTokenOpenResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}

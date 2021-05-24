// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetStudioAppTokenOpenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GetStudioAppTokenOpenResponseBodyData data;

    public static GetStudioAppTokenOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStudioAppTokenOpenResponseBody self = new GetStudioAppTokenOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStudioAppTokenOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStudioAppTokenOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStudioAppTokenOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStudioAppTokenOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStudioAppTokenOpenResponseBody setData(GetStudioAppTokenOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStudioAppTokenOpenResponseBodyData getData() {
        return this.data;
    }

    public static class GetStudioAppTokenOpenResponseBodyData extends TeaModel {
        @NameInMap("IsEnable")
        public String isEnable;

        @NameInMap("Type")
        public String type;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Token")
        public String token;

        @NameInMap("BizId")
        public String bizId;

        public static GetStudioAppTokenOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStudioAppTokenOpenResponseBodyData self = new GetStudioAppTokenOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStudioAppTokenOpenResponseBodyData setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public GetStudioAppTokenOpenResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStudioAppTokenOpenResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetStudioAppTokenOpenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetStudioAppTokenOpenResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}

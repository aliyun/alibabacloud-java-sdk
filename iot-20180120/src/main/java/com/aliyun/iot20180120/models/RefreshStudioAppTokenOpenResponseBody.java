// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshStudioAppTokenOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RefreshStudioAppTokenOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RefreshStudioAppTokenOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshStudioAppTokenOpenResponseBody self = new RefreshStudioAppTokenOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshStudioAppTokenOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshStudioAppTokenOpenResponseBody setData(RefreshStudioAppTokenOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshStudioAppTokenOpenResponseBodyData getData() {
        return this.data;
    }

    public RefreshStudioAppTokenOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RefreshStudioAppTokenOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshStudioAppTokenOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshStudioAppTokenOpenResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("IsEnable")
        public String isEnable;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        public static RefreshStudioAppTokenOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshStudioAppTokenOpenResponseBodyData self = new RefreshStudioAppTokenOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshStudioAppTokenOpenResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public RefreshStudioAppTokenOpenResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public RefreshStudioAppTokenOpenResponseBodyData setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public RefreshStudioAppTokenOpenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public RefreshStudioAppTokenOpenResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

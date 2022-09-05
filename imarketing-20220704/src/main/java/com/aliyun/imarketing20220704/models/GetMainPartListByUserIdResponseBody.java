// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetMainPartListByUserIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMainPartListByUserIdResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMainPartListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartListByUserIdResponseBody self = new GetMainPartListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainPartListByUserIdResponseBody setData(GetMainPartListByUserIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMainPartListByUserIdResponseBodyData getData() {
        return this.data;
    }

    public GetMainPartListByUserIdResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetMainPartListByUserIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMainPartListByUserIdResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetMainPartListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMainPartListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMainPartListByUserIdResponseBodyData extends TeaModel {
        @NameInMap("Token")
        public String token;

        public static GetMainPartListByUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartListByUserIdResponseBodyData self = new GetMainPartListByUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMainPartListByUserIdResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}

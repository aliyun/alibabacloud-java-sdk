// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AuthorizeAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AuthorizeAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppResponseBody self = new AuthorizeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthorizeAppResponseBody setData(AuthorizeAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AuthorizeAppResponseBodyData getData() {
        return this.data;
    }

    public AuthorizeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthorizeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AuthorizeAppResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static AuthorizeAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeAppResponseBodyData self = new AuthorizeAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AuthorizeAppResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}

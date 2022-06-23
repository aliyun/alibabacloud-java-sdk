// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DeleteAppResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResponseBody self = new DeleteAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAppResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public DeleteAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

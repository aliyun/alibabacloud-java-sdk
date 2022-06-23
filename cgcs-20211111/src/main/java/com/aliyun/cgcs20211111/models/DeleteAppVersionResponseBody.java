// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DeleteAppVersionResponseBody extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

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

    public static DeleteAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionResponseBody self = new DeleteAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionResponseBody setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public DeleteAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAppVersionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public DeleteAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

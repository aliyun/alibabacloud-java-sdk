// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppResponseBody extends TeaModel {
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

    public static ModifyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponseBody self = new ModifyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAppResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ModifyAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

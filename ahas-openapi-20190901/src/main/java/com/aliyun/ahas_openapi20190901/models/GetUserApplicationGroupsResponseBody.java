// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("AppGroups")
    public java.util.List<String> appGroups;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserApplicationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationGroupsResponseBody self = new GetUserApplicationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationGroupsResponseBody setAppGroups(java.util.List<String> appGroups) {
        this.appGroups = appGroups;
        return this;
    }
    public java.util.List<String> getAppGroups() {
        return this.appGroups;
    }

    public GetUserApplicationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserApplicationGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserApplicationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserApplicationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserApplicationGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

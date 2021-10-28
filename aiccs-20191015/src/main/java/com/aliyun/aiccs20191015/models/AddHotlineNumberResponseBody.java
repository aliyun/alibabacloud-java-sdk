// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public Boolean success;

    public static AddHotlineNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHotlineNumberResponseBody self = new AddHotlineNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHotlineNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddHotlineNumberResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddHotlineNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddHotlineNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHotlineNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

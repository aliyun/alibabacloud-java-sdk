// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartHotlineServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartHotlineServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineServiceResponseBody self = new StartHotlineServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartHotlineServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartHotlineServiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartHotlineServiceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartHotlineServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartHotlineServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartHotlineServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

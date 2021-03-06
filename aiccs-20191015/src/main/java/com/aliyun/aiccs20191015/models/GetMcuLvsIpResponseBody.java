// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetMcuLvsIpResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    // error code
    @NameInMap("Code")
    public String code;

    // error message
    @NameInMap("Message")
    public String message;

    // result data
    @NameInMap("Data")
    public String data;

    public static GetMcuLvsIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcuLvsIpResponseBody self = new GetMcuLvsIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcuLvsIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcuLvsIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMcuLvsIpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcuLvsIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcuLvsIpResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}

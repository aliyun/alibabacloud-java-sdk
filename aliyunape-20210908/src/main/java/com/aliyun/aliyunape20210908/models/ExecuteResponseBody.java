// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ExecuteResponseBody extends TeaModel {
    // rt
    @NameInMap("Rt")
    public Long rt;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ExecuteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteResponseBody self = new ExecuteResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public ExecuteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public ExecuteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

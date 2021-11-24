// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdResponseBody extends TeaModel {
    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 返回result
    @NameInMap("Result")
    public java.util.Map<String, ResultValue> result;

    public static ListDeviceByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdResponseBody self = new ListDeviceByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceByUserIdResponseBody setResult(java.util.Map<String, ResultValue> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ResultValue> getResult() {
        return this.result;
    }

}

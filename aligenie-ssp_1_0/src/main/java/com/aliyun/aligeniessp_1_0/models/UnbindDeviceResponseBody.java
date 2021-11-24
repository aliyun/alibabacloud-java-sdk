// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindDeviceResponseBody extends TeaModel {
    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否解绑成功
    @NameInMap("Result")
    public Boolean result;

    public static UnbindDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceResponseBody self = new UnbindDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnbindDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindDeviceResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}

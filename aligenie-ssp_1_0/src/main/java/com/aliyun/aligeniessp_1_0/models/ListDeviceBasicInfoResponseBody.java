// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoResponseBody extends TeaModel {
    // 返回的错误码
    @NameInMap("Code")
    public Integer code;

    // 返回的错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 返回result，key为deviceOpenId或deviceUnionId，value为对应的设备信息
    @NameInMap("Result")
    public java.util.Map<String, ResultValue> result;

    public static ListDeviceBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBasicInfoResponseBody self = new ListDeviceBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceBasicInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceBasicInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceBasicInfoResponseBody setResult(java.util.Map<String, ResultValue> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ResultValue> getResult() {
        return this.result;
    }

}

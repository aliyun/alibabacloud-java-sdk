// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

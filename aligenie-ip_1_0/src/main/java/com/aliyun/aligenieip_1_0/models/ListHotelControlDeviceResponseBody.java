// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelControlDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, String>> result;

    public static ListHotelControlDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelControlDeviceResponseBody self = new ListHotelControlDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelControlDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelControlDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelControlDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelControlDeviceResponseBody setResult(java.util.List<java.util.Map<String, String>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getResult() {
        return this.result;
    }

}

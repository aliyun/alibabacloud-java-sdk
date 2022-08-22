// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, String>> result;

    public static QueryDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatusResponseBody self = new QueryDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceStatusResponseBody setResult(java.util.List<java.util.Map<String, String>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getResult() {
        return this.result;
    }

}

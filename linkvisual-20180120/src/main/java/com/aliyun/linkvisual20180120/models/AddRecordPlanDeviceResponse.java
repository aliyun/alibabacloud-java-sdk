// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecordPlanDeviceResponseBody body;

    public static AddRecordPlanDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecordPlanDeviceResponse self = new AddRecordPlanDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddRecordPlanDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecordPlanDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecordPlanDeviceResponse setBody(AddRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

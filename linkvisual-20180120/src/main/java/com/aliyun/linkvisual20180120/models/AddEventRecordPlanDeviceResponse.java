// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddEventRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEventRecordPlanDeviceResponseBody body;

    public static AddEventRecordPlanDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEventRecordPlanDeviceResponse self = new AddEventRecordPlanDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddEventRecordPlanDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEventRecordPlanDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEventRecordPlanDeviceResponse setBody(AddEventRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEventRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

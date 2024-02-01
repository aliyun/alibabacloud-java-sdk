// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecordPlanDeviceResponseBody body;

    public static DeleteRecordPlanDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordPlanDeviceResponse self = new DeleteRecordPlanDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordPlanDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordPlanDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecordPlanDeviceResponse setBody(DeleteRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

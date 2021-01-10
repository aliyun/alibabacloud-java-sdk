// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteRecordPlanDeviceResponse setBody(DeleteRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

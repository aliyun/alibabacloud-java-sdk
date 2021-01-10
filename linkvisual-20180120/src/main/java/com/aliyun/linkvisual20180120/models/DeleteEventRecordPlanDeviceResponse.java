// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventRecordPlanDeviceResponseBody body;

    public static DeleteEventRecordPlanDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanDeviceResponse self = new DeleteEventRecordPlanDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventRecordPlanDeviceResponse setBody(DeleteEventRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

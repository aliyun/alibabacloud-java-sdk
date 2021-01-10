// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddEventRecordPlanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddEventRecordPlanDeviceResponse setBody(AddEventRecordPlanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEventRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

}

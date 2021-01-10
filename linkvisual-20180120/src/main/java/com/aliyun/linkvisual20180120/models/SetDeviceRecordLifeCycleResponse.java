// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDeviceRecordLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDeviceRecordLifeCycleResponseBody body;

    public static SetDeviceRecordLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceRecordLifeCycleResponse self = new SetDeviceRecordLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceRecordLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceRecordLifeCycleResponse setBody(SetDeviceRecordLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceRecordLifeCycleResponseBody getBody() {
        return this.body;
    }

}

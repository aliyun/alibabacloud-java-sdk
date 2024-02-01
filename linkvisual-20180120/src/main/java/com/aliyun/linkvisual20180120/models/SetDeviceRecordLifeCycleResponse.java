// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDeviceRecordLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetDeviceRecordLifeCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceRecordLifeCycleResponse setBody(SetDeviceRecordLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceRecordLifeCycleResponseBody getBody() {
        return this.body;
    }

}

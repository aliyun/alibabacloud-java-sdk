// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDevicePictureLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDevicePictureLifeCycleResponseBody body;

    public static SetDevicePictureLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePictureLifeCycleResponse self = new SetDevicePictureLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public SetDevicePictureLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDevicePictureLifeCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDevicePictureLifeCycleResponse setBody(SetDevicePictureLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDevicePictureLifeCycleResponseBody getBody() {
        return this.body;
    }

}

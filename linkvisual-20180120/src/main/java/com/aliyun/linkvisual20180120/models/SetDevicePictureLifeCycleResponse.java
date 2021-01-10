// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDevicePictureLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetDevicePictureLifeCycleResponse setBody(SetDevicePictureLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDevicePictureLifeCycleResponseBody getBody() {
        return this.body;
    }

}

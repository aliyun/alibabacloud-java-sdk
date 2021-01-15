// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceFormsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceFormsResponseBody body;

    public static ListDeviceFormsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceFormsResponse self = new ListDeviceFormsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceFormsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceFormsResponse setBody(ListDeviceFormsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceFormsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceModelsResponseBody body;

    public static ListDeviceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelsResponse self = new ListDeviceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceModelsResponse setBody(ListDeviceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceModelsResponseBody getBody() {
        return this.body;
    }

}

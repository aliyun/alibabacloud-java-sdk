// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountDeviceModelsResponseBody body;

    public static CountDeviceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceModelsResponse self = new CountDeviceModelsResponse();
        return TeaModel.build(map, self);
    }

    public CountDeviceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountDeviceModelsResponse setBody(CountDeviceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountDeviceModelsResponseBody getBody() {
        return this.body;
    }

}

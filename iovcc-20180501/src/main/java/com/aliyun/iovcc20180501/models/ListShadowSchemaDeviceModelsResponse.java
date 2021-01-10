// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemaDeviceModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListShadowSchemaDeviceModelsResponseBody body;

    public static ListShadowSchemaDeviceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemaDeviceModelsResponse self = new ListShadowSchemaDeviceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemaDeviceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShadowSchemaDeviceModelsResponse setBody(ListShadowSchemaDeviceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShadowSchemaDeviceModelsResponseBody getBody() {
        return this.body;
    }

}

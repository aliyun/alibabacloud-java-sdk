// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListPublicBroadcastSceneTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicBroadcastSceneTemplatesResponseBody body;

    public static ListPublicBroadcastSceneTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicBroadcastSceneTemplatesResponse self = new ListPublicBroadcastSceneTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicBroadcastSceneTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicBroadcastSceneTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicBroadcastSceneTemplatesResponse setBody(ListPublicBroadcastSceneTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicBroadcastSceneTemplatesResponseBody getBody() {
        return this.body;
    }

}

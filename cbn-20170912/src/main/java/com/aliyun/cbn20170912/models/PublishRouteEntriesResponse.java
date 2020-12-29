// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class PublishRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishRouteEntriesResponseBody body;

    public static PublishRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRouteEntriesResponse self = new PublishRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public PublishRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRouteEntriesResponse setBody(PublishRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRouteEntriesResponseBody getBody() {
        return this.body;
    }

}

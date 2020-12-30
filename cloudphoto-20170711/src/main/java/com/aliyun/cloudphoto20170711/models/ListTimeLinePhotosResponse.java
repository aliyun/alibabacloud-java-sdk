// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTimeLinePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTimeLinePhotosResponseBody body;

    public static ListTimeLinePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTimeLinePhotosResponse self = new ListTimeLinePhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListTimeLinePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTimeLinePhotosResponse setBody(ListTimeLinePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTimeLinePhotosResponseBody getBody() {
        return this.body;
    }

}

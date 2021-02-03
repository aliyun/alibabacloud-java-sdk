// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllPublicMediaTagsResponseBody body;

    public static ListAllPublicMediaTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsResponse self = new ListAllPublicMediaTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllPublicMediaTagsResponse setBody(ListAllPublicMediaTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPublicMediaTagsResponseBody getBody() {
        return this.body;
    }

}

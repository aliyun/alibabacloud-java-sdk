// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAllMediaBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllMediaBucketResponseBody body;

    public static ListAllMediaBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllMediaBucketResponse self = new ListAllMediaBucketResponse();
        return TeaModel.build(map, self);
    }

    public ListAllMediaBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllMediaBucketResponse setBody(ListAllMediaBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllMediaBucketResponseBody getBody() {
        return this.body;
    }

}

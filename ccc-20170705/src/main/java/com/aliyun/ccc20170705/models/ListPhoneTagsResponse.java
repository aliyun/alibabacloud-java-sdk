// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhoneTagsResponseBody body;

    public static ListPhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneTagsResponse self = new ListPhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhoneTagsResponse setBody(ListPhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneTagsResponseBody getBody() {
        return this.body;
    }

}

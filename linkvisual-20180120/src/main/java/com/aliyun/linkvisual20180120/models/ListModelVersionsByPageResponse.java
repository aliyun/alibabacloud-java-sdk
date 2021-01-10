// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListModelVersionsByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListModelVersionsByPageResponseBody body;

    public static ListModelVersionsByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelVersionsByPageResponse self = new ListModelVersionsByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListModelVersionsByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelVersionsByPageResponse setBody(ListModelVersionsByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelVersionsByPageResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFpShotDBResponseBody body;

    public static ListFpShotDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotDBResponse self = new ListFpShotDBResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotDBResponse setBody(ListFpShotDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotDBResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotNotaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFpShotNotaryResponseBody body;

    public static ListFpShotNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotNotaryResponse self = new ListFpShotNotaryResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotNotaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotNotaryResponse setBody(ListFpShotNotaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotNotaryResponseBody getBody() {
        return this.body;
    }

}

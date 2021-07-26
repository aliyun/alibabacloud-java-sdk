// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListBusinessTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBusinessTypesResponseBody body;

    public static ListBusinessTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessTypesResponse self = new ListBusinessTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessTypesResponse setBody(ListBusinessTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessTypesResponseBody getBody() {
        return this.body;
    }

}

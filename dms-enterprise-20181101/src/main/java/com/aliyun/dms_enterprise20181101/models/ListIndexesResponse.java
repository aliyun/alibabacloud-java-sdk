// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListIndexesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIndexesResponseBody body;

    public static ListIndexesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesResponse self = new ListIndexesResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexesResponse setBody(ListIndexesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexesResponseBody getBody() {
        return this.body;
    }

}

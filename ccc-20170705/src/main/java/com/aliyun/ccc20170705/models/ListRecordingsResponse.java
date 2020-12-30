// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecordingsResponseBody body;

    public static ListRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsResponse self = new ListRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordingsResponse setBody(ListRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordingsResponseBody getBody() {
        return this.body;
    }

}

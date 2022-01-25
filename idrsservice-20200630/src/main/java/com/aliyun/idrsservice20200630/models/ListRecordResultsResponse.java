// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRecordResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecordResultsResponseBody body;

    public static ListRecordResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordResultsResponse self = new ListRecordResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordResultsResponse setBody(ListRecordResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordResultsResponseBody getBody() {
        return this.body;
    }

}

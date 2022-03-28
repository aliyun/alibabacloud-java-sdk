// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMonoRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMonoRecordingsResponseBody body;

    public static ListMonoRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonoRecordingsResponse self = new ListMonoRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public ListMonoRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonoRecordingsResponse setBody(ListMonoRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMonoRecordingsResponseBody getBody() {
        return this.body;
    }

}

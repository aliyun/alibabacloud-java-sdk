// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepoBuildRecordResponseBody body;

    public static ListRepoBuildRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordResponse self = new ListRepoBuildRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoBuildRecordResponse setBody(ListRepoBuildRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

}

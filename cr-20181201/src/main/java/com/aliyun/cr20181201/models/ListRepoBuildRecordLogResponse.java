// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepoBuildRecordLogResponseBody body;

    public static ListRepoBuildRecordLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogResponse self = new ListRepoBuildRecordLogResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoBuildRecordLogResponse setBody(ListRepoBuildRecordLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRecordLogResponseBody getBody() {
        return this.body;
    }

}

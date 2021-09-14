// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateScreensByTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateScreensByTemplatesResponseBody body;

    public static BatchCreateScreensByTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateScreensByTemplatesResponse self = new BatchCreateScreensByTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateScreensByTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateScreensByTemplatesResponse setBody(BatchCreateScreensByTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateScreensByTemplatesResponseBody getBody() {
        return this.body;
    }

}

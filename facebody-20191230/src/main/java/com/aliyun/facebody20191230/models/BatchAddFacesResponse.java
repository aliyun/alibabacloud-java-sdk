// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddFacesResponseBody body;

    public static BatchAddFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFacesResponse self = new BatchAddFacesResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddFacesResponse setBody(BatchAddFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddFacesResponseBody getBody() {
        return this.body;
    }

}

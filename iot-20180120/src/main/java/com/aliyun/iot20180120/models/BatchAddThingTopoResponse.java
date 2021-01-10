// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddThingTopoResponseBody body;

    public static BatchAddThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddThingTopoResponse self = new BatchAddThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddThingTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddThingTopoResponse setBody(BatchAddThingTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddThingTopoResponseBody getBody() {
        return this.body;
    }

}

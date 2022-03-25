// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUnbindProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUnbindProjectResponseBody body;

    public static DatasetUnbindProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUnbindProjectResponse self = new DatasetUnbindProjectResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUnbindProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUnbindProjectResponse setBody(DatasetUnbindProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUnbindProjectResponseBody getBody() {
        return this.body;
    }

}

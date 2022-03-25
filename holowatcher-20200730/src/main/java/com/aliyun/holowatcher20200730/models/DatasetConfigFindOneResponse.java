// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetConfigFindOneResponseBody body;

    public static DatasetConfigFindOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindOneResponse self = new DatasetConfigFindOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetConfigFindOneResponse setBody(DatasetConfigFindOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetConfigFindOneResponseBody getBody() {
        return this.body;
    }

}

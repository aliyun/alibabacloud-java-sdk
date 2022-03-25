// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetDeteleOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetDeteleOneResponseBody body;

    public static DatasetDeteleOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetDeteleOneResponse self = new DatasetDeteleOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetDeteleOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetDeteleOneResponse setBody(DatasetDeteleOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetDeteleOneResponseBody getBody() {
        return this.body;
    }

}

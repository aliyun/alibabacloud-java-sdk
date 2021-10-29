// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudbenchTaskResponseBody body;

    public static DescribeCloudbenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskResponse self = new DescribeCloudbenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudbenchTaskResponse setBody(DescribeCloudbenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudbenchTaskResponseBody getBody() {
        return this.body;
    }

}

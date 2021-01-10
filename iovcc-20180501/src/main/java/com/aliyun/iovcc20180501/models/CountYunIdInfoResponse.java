// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountYunIdInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountYunIdInfoResponseBody body;

    public static CountYunIdInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CountYunIdInfoResponse self = new CountYunIdInfoResponse();
        return TeaModel.build(map, self);
    }

    public CountYunIdInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountYunIdInfoResponse setBody(CountYunIdInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CountYunIdInfoResponseBody getBody() {
        return this.body;
    }

}

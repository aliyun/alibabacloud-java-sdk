// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlFlashbakTaskResponseBody body;

    public static DescribeSqlFlashbakTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbakTaskResponse self = new DescribeSqlFlashbakTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbakTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlFlashbakTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlFlashbakTaskResponse setBody(DescribeSqlFlashbakTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlFlashbakTaskResponseBody getBody() {
        return this.body;
    }

}

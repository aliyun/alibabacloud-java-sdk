// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckSampleDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSampleDataSetResponseBody body;

    public static CheckSampleDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSampleDataSetResponse self = new CheckSampleDataSetResponse();
        return TeaModel.build(map, self);
    }

    public CheckSampleDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSampleDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSampleDataSetResponse setBody(CheckSampleDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSampleDataSetResponseBody getBody() {
        return this.body;
    }

}

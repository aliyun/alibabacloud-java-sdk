// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class LoadSampleDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoadSampleDataSetResponseBody body;

    public static LoadSampleDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadSampleDataSetResponse self = new LoadSampleDataSetResponse();
        return TeaModel.build(map, self);
    }

    public LoadSampleDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadSampleDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoadSampleDataSetResponse setBody(LoadSampleDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadSampleDataSetResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportThingModelTslResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportThingModelTslResponseBody body;

    public static ImportThingModelTslResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportThingModelTslResponse self = new ImportThingModelTslResponse();
        return TeaModel.build(map, self);
    }

    public ImportThingModelTslResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportThingModelTslResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportThingModelTslResponse setBody(ImportThingModelTslResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportThingModelTslResponseBody getBody() {
        return this.body;
    }

}

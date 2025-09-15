// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardScopeSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardScopeSaveResponseBody body;

    public static TravelStandardScopeSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardScopeSaveResponse self = new TravelStandardScopeSaveResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardScopeSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardScopeSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardScopeSaveResponse setBody(TravelStandardScopeSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardScopeSaveResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceTidyupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceTidyupResponseBody body;

    public static FaceTidyupResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceTidyupResponse self = new FaceTidyupResponse();
        return TeaModel.build(map, self);
    }

    public FaceTidyupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceTidyupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceTidyupResponse setBody(FaceTidyupResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceTidyupResponseBody getBody() {
        return this.body;
    }

}

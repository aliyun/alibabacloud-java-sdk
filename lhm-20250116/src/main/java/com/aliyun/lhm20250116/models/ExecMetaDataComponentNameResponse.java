// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaDataComponentNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecMetaDataComponentNameResponseBody body;

    public static ExecMetaDataComponentNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaDataComponentNameResponse self = new ExecMetaDataComponentNameResponse();
        return TeaModel.build(map, self);
    }

    public ExecMetaDataComponentNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecMetaDataComponentNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecMetaDataComponentNameResponse setBody(ExecMetaDataComponentNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecMetaDataComponentNameResponseBody getBody() {
        return this.body;
    }

}

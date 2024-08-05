// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ExportOASResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportOASResponseBody body;

    public static ExportOASResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportOASResponse self = new ExportOASResponse();
        return TeaModel.build(map, self);
    }

    public ExportOASResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportOASResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportOASResponse setBody(ExportOASResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportOASResponseBody getBody() {
        return this.body;
    }

}

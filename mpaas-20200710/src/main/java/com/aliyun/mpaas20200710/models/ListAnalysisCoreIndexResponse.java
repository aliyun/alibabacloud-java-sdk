// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ListAnalysisCoreIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnalysisCoreIndexResponseBody body;

    public static ListAnalysisCoreIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisCoreIndexResponse self = new ListAnalysisCoreIndexResponse();
        return TeaModel.build(map, self);
    }

    public ListAnalysisCoreIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnalysisCoreIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnalysisCoreIndexResponse setBody(ListAnalysisCoreIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnalysisCoreIndexResponseBody getBody() {
        return this.body;
    }

}

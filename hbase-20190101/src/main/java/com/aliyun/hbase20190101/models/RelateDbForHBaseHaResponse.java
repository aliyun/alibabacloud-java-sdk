// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RelateDbForHBaseHaResponseBody body;

    public static RelateDbForHBaseHaResponse build(java.util.Map<String, ?> map) throws Exception {
        RelateDbForHBaseHaResponse self = new RelateDbForHBaseHaResponse();
        return TeaModel.build(map, self);
    }

    public RelateDbForHBaseHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RelateDbForHBaseHaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RelateDbForHBaseHaResponse setBody(RelateDbForHBaseHaResponseBody body) {
        this.body = body;
        return this;
    }
    public RelateDbForHBaseHaResponseBody getBody() {
        return this.body;
    }

}

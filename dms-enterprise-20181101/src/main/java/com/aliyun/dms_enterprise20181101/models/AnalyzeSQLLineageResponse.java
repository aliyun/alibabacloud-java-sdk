// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnalyzeSQLLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeSQLLineageResponseBody body;

    public static AnalyzeSQLLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeSQLLineageResponse self = new AnalyzeSQLLineageResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeSQLLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeSQLLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeSQLLineageResponse setBody(AnalyzeSQLLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeSQLLineageResponseBody getBody() {
        return this.body;
    }

}

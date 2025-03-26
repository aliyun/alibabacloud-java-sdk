// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryApplicationAccessIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryApplicationAccessIdResponseBody body;

    public static QueryApplicationAccessIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationAccessIdResponse self = new QueryApplicationAccessIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationAccessIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApplicationAccessIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApplicationAccessIdResponse setBody(QueryApplicationAccessIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApplicationAccessIdResponseBody getBody() {
        return this.body;
    }

}

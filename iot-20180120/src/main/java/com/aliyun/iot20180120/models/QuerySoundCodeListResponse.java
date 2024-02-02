// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySoundCodeListResponseBody body;

    public static QuerySoundCodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeListResponse self = new QuerySoundCodeListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundCodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySoundCodeListResponse setBody(QuerySoundCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeListResponseBody getBody() {
        return this.body;
    }

}

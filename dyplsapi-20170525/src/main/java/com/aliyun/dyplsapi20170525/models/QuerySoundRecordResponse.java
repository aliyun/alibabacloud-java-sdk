// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySoundRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySoundRecordResponseBody body;

    public static QuerySoundRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundRecordResponse self = new QuerySoundRecordResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySoundRecordResponse setBody(QuerySoundRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundRecordResponseBody getBody() {
        return this.body;
    }

}

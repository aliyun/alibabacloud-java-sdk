// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySoundCodeListResponse setBody(QuerySoundCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeListResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySoundCodeLabelListResponseBody body;

    public static QuerySoundCodeLabelListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelListResponse self = new QuerySoundCodeLabelListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundCodeLabelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySoundCodeLabelListResponse setBody(QuerySoundCodeLabelListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeLabelListResponseBody getBody() {
        return this.body;
    }

}

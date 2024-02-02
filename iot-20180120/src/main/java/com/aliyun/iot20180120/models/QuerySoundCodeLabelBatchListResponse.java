// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySoundCodeLabelBatchListResponseBody body;

    public static QuerySoundCodeLabelBatchListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchListResponse self = new QuerySoundCodeLabelBatchListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundCodeLabelBatchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySoundCodeLabelBatchListResponse setBody(QuerySoundCodeLabelBatchListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeLabelBatchListResponseBody getBody() {
        return this.body;
    }

}

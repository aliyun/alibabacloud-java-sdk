// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchFailedResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySoundCodeLabelBatchFailedResultResponseBody body;

    public static QuerySoundCodeLabelBatchFailedResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchFailedResultResponse self = new QuerySoundCodeLabelBatchFailedResultResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchFailedResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundCodeLabelBatchFailedResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySoundCodeLabelBatchFailedResultResponse setBody(QuerySoundCodeLabelBatchFailedResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeLabelBatchFailedResultResponseBody getBody() {
        return this.body;
    }

}

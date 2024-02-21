// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSynonymsDictsResponseBody body;

    public static UpdateSynonymsDictsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsDictsResponse self = new UpdateSynonymsDictsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsDictsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSynonymsDictsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSynonymsDictsResponse setBody(UpdateSynonymsDictsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSynonymsDictsResponseBody getBody() {
        return this.body;
    }

}

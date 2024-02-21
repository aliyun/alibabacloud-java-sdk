// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateHotIkDictsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHotIkDictsResponseBody body;

    public static UpdateHotIkDictsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotIkDictsResponse self = new UpdateHotIkDictsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotIkDictsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotIkDictsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotIkDictsResponse setBody(UpdateHotIkDictsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotIkDictsResponseBody getBody() {
        return this.body;
    }

}

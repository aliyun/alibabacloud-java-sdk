// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMergeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveStreamMergeResponseBody body;

    public static DeleteLiveStreamMergeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMergeResponse self = new DeleteLiveStreamMergeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamMergeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamMergeResponse setBody(DeleteLiveStreamMergeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamMergeResponseBody getBody() {
        return this.body;
    }

}

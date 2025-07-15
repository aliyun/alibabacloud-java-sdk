// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamMergeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveStreamMergeResponseBody body;

    public static AddLiveStreamMergeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamMergeResponse self = new AddLiveStreamMergeResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamMergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveStreamMergeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveStreamMergeResponse setBody(AddLiveStreamMergeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveStreamMergeResponseBody getBody() {
        return this.body;
    }

}

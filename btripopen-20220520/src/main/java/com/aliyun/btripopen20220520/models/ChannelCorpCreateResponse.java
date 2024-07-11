// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ChannelCorpCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChannelCorpCreateResponseBody body;

    public static ChannelCorpCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChannelCorpCreateResponse self = new ChannelCorpCreateResponse();
        return TeaModel.build(map, self);
    }

    public ChannelCorpCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChannelCorpCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChannelCorpCreateResponse setBody(ChannelCorpCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChannelCorpCreateResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class TagLiveResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagLiveResourcesResponseBody body;

    public static TagLiveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagLiveResourcesResponse self = new TagLiveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagLiveResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagLiveResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagLiveResourcesResponse setBody(TagLiveResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagLiveResourcesResponseBody getBody() {
        return this.body;
    }

}

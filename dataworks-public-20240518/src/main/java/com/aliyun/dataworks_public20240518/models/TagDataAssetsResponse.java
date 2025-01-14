// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TagDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagDataAssetsResponseBody body;

    public static TagDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        TagDataAssetsResponse self = new TagDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public TagDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagDataAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagDataAssetsResponse setBody(TagDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public TagDataAssetsResponseBody getBody() {
        return this.body;
    }

}

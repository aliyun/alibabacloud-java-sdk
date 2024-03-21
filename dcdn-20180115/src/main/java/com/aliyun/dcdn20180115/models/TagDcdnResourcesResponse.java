// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class TagDcdnResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagDcdnResourcesResponseBody body;

    public static TagDcdnResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagDcdnResourcesResponse self = new TagDcdnResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagDcdnResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagDcdnResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagDcdnResourcesResponse setBody(TagDcdnResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagDcdnResourcesResponseBody getBody() {
        return this.body;
    }

}

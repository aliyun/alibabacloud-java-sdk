// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagCloudResourcesResponseBody body;

    public static TagCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagCloudResourcesResponse self = new TagCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagCloudResourcesResponse setBody(TagCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagCloudResourcesResponseBody getBody() {
        return this.body;
    }

}

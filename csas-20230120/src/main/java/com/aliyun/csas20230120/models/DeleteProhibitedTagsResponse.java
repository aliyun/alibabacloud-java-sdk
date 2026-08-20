// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProhibitedTagsResponseBody body;

    public static DeleteProhibitedTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedTagsResponse self = new DeleteProhibitedTagsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProhibitedTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProhibitedTagsResponse setBody(DeleteProhibitedTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProhibitedTagsResponseBody getBody() {
        return this.body;
    }

}

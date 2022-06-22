// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListExpertiseTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExpertiseTagsResponseBody body;

    public static ListExpertiseTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExpertiseTagsResponse self = new ListExpertiseTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListExpertiseTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExpertiseTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExpertiseTagsResponse setBody(ListExpertiseTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExpertiseTagsResponseBody getBody() {
        return this.body;
    }

}

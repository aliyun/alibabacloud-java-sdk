// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommunityImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommunityImagesResponseBody body;

    public static ListCommunityImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommunityImagesResponse self = new ListCommunityImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListCommunityImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommunityImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommunityImagesResponse setBody(ListCommunityImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommunityImagesResponseBody getBody() {
        return this.body;
    }

}

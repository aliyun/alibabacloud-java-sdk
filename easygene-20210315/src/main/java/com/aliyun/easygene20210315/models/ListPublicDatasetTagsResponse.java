// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicDatasetTagsResponseBody body;

    public static ListPublicDatasetTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetTagsResponse self = new ListPublicDatasetTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicDatasetTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicDatasetTagsResponse setBody(ListPublicDatasetTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetTagsResponseBody getBody() {
        return this.body;
    }

}

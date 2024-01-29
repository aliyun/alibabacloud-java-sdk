// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicDatasetEntityItemsResponseBody body;

    public static ListPublicDatasetEntityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntityItemsResponse self = new ListPublicDatasetEntityItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetEntityItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicDatasetEntityItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicDatasetEntityItemsResponse setBody(ListPublicDatasetEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetEntityItemsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPublicDatasetEntityItemsResponse setBody(ListPublicDatasetEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetEntityItemsResponseBody getBody() {
        return this.body;
    }

}

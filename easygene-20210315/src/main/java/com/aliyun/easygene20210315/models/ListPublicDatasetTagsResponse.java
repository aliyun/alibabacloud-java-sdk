// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPublicDatasetTagsResponse setBody(ListPublicDatasetTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetTagsResponseBody getBody() {
        return this.body;
    }

}

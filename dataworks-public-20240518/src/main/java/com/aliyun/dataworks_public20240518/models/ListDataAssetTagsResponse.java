// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAssetTagsResponseBody body;

    public static ListDataAssetTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetTagsResponse self = new ListDataAssetTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAssetTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAssetTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAssetTagsResponse setBody(ListDataAssetTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAssetTagsResponseBody getBody() {
        return this.body;
    }

}

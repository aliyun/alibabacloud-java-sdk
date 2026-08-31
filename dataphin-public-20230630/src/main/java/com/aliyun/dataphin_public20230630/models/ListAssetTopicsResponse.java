// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetTopicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetTopicsResponseBody body;

    public static ListAssetTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetTopicsResponse self = new ListAssetTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetTopicsResponse setBody(ListAssetTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetTopicsResponseBody getBody() {
        return this.body;
    }

}

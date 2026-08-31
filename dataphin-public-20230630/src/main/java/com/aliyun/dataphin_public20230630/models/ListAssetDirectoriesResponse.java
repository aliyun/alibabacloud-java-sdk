// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetDirectoriesResponseBody body;

    public static ListAssetDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetDirectoriesResponse self = new ListAssetDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetDirectoriesResponse setBody(ListAssetDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetDirectoriesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSimilarityLibrariesResponseBody body;

    public static ListSimilarityLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityLibrariesResponse self = new ListSimilarityLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public ListSimilarityLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSimilarityLibrariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSimilarityLibrariesResponse setBody(ListSimilarityLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSimilarityLibrariesResponseBody getBody() {
        return this.body;
    }

}

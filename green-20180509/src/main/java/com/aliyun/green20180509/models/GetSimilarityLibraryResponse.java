// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSimilarityLibraryResponseBody body;

    public static GetSimilarityLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityLibraryResponse self = new GetSimilarityLibraryResponse();
        return TeaModel.build(map, self);
    }

    public GetSimilarityLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimilarityLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSimilarityLibraryResponse setBody(GetSimilarityLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimilarityLibraryResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSimilarityLibraryResponseBody body;

    public static AddSimilarityLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityLibraryResponse self = new AddSimilarityLibraryResponse();
        return TeaModel.build(map, self);
    }

    public AddSimilarityLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSimilarityLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSimilarityLibraryResponse setBody(AddSimilarityLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSimilarityLibraryResponseBody getBody() {
        return this.body;
    }

}

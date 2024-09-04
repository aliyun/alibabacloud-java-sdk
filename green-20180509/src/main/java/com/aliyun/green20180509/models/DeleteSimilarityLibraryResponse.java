// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteSimilarityLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSimilarityLibraryResponseBody body;

    public static DeleteSimilarityLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimilarityLibraryResponse self = new DeleteSimilarityLibraryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSimilarityLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSimilarityLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSimilarityLibraryResponse setBody(DeleteSimilarityLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSimilarityLibraryResponseBody getBody() {
        return this.body;
    }

}

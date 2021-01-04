// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

}

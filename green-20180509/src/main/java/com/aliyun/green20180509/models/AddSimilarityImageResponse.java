// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static AddSimilarityImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityImageResponse self = new AddSimilarityImageResponse();
        return TeaModel.build(map, self);
    }

    public AddSimilarityImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

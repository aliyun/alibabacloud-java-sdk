// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ListSimilarityImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityImagesResponse self = new ListSimilarityImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListSimilarityImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

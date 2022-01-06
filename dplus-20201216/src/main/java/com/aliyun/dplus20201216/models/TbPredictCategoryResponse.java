// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class TbPredictCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.Map<String, ?> body;

    public static TbPredictCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        TbPredictCategoryResponse self = new TbPredictCategoryResponse();
        return TeaModel.build(map, self);
    }

    public TbPredictCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TbPredictCategoryResponse setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}

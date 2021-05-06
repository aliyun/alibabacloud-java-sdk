// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class ListProductsWithAttrValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductsWithAttrValueResponseBody body;

    public static ListProductsWithAttrValueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsWithAttrValueResponse self = new ListProductsWithAttrValueResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsWithAttrValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsWithAttrValueResponse setBody(ListProductsWithAttrValueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsWithAttrValueResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowCategoryResponseBody body;

    public static ListFlowCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowCategoryResponse self = new ListFlowCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowCategoryResponse setBody(ListFlowCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowCategoryResponseBody getBody() {
        return this.body;
    }

}

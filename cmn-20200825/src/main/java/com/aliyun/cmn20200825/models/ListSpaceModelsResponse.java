// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSpaceModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSpaceModelsResponseBody body;

    public static ListSpaceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceModelsResponse self = new ListSpaceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListSpaceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpaceModelsResponse setBody(ListSpaceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpaceModelsResponseBody getBody() {
        return this.body;
    }

}

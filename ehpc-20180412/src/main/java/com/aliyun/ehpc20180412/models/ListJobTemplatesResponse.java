// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobTemplatesResponseBody body;

    public static ListJobTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesResponse self = new ListJobTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobTemplatesResponse setBody(ListJobTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobTemplatesResponseBody getBody() {
        return this.body;
    }

}

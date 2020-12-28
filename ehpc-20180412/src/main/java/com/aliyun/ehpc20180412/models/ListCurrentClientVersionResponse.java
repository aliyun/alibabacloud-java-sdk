// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCurrentClientVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCurrentClientVersionResponseBody body;

    public static ListCurrentClientVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentClientVersionResponse self = new ListCurrentClientVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListCurrentClientVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCurrentClientVersionResponse setBody(ListCurrentClientVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCurrentClientVersionResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrMainVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrMainVersionResponseBody body;

    public static ListEmrMainVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrMainVersionResponse self = new ListEmrMainVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrMainVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrMainVersionResponse setBody(ListEmrMainVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrMainVersionResponseBody getBody() {
        return this.body;
    }

}

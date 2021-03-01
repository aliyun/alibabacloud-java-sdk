// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScaleOutEcuResponseBody body;

    public static ListScaleOutEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScaleOutEcuResponse self = new ListScaleOutEcuResponse();
        return TeaModel.build(map, self);
    }

    public ListScaleOutEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScaleOutEcuResponse setBody(ListScaleOutEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScaleOutEcuResponseBody getBody() {
        return this.body;
    }

}

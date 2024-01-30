// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListScaleOutEcuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScaleOutEcuResponse setBody(ListScaleOutEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScaleOutEcuResponseBody getBody() {
        return this.body;
    }

}

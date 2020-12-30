// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceRegionResponseBody body;

    public static ListInstanceRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRegionResponse self = new ListInstanceRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRegionResponse setBody(ListInstanceRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRegionResponseBody getBody() {
        return this.body;
    }

}

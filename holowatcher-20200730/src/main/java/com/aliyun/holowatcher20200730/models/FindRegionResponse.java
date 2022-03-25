// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class FindRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindRegionResponseBody body;

    public static FindRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        FindRegionResponse self = new FindRegionResponse();
        return TeaModel.build(map, self);
    }

    public FindRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindRegionResponse setBody(FindRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public FindRegionResponseBody getBody() {
        return this.body;
    }

}

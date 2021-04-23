// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveShiftConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveShiftConfigsResponseBody body;

    public static DescribeLiveShiftConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveShiftConfigsResponse self = new DescribeLiveShiftConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveShiftConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveShiftConfigsResponse setBody(DescribeLiveShiftConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveShiftConfigsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveRecordConfigResponseBody body;

    public static DescribeLiveRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordConfigResponse self = new DescribeLiveRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRecordConfigResponse setBody(DescribeLiveRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRecordConfigResponseBody getBody() {
        return this.body;
    }

}

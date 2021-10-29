// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudbenchTaskConfigResponseBody body;

    public static DescribeCloudbenchTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskConfigResponse self = new DescribeCloudbenchTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudbenchTaskConfigResponse setBody(DescribeCloudbenchTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudbenchTaskConfigResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCloudbenchTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudbenchTaskConfigResponse setBody(DescribeCloudbenchTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudbenchTaskConfigResponseBody getBody() {
        return this.body;
    }

}

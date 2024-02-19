// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogCountResponseBody body;

    public static DescribeSQLLogCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogCountResponse self = new DescribeSQLLogCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogCountResponse setBody(DescribeSQLLogCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogCountResponseBody getBody() {
        return this.body;
    }

}

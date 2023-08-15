// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDiskWarningLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiskWarningLineResponseBody body;

    public static DescribeDiskWarningLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskWarningLineResponse self = new DescribeDiskWarningLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskWarningLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskWarningLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskWarningLineResponse setBody(DescribeDiskWarningLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskWarningLineResponseBody getBody() {
        return this.body;
    }

}

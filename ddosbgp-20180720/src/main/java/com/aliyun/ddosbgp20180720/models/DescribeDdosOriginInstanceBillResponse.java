// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosOriginInstanceBillResponseBody body;

    public static DescribeDdosOriginInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosOriginInstanceBillResponse self = new DescribeDdosOriginInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosOriginInstanceBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosOriginInstanceBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosOriginInstanceBillResponse setBody(DescribeDdosOriginInstanceBillResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosOriginInstanceBillResponseBody getBody() {
        return this.body;
    }

}

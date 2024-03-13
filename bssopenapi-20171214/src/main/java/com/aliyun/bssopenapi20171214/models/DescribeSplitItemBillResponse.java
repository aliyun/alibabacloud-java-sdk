// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSplitItemBillResponseBody body;

    public static DescribeSplitItemBillResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSplitItemBillResponse self = new DescribeSplitItemBillResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSplitItemBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSplitItemBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSplitItemBillResponse setBody(DescribeSplitItemBillResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSplitItemBillResponseBody getBody() {
        return this.body;
    }

}

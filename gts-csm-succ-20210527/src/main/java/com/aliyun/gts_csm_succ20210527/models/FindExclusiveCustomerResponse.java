// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class FindExclusiveCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindExclusiveCustomerResponseBody body;

    public static FindExclusiveCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        FindExclusiveCustomerResponse self = new FindExclusiveCustomerResponse();
        return TeaModel.build(map, self);
    }

    public FindExclusiveCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindExclusiveCustomerResponse setBody(FindExclusiveCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public FindExclusiveCustomerResponseBody getBody() {
        return this.body;
    }

}

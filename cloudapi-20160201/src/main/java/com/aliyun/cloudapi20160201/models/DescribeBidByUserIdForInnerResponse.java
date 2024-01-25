// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeBidByUserIdForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBidByUserIdForInnerResponseBody body;

    public static DescribeBidByUserIdForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBidByUserIdForInnerResponse self = new DescribeBidByUserIdForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBidByUserIdForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBidByUserIdForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBidByUserIdForInnerResponse setBody(DescribeBidByUserIdForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBidByUserIdForInnerResponseBody getBody() {
        return this.body;
    }

}

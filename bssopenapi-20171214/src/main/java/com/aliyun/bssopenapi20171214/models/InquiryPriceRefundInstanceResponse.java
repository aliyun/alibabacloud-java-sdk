// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class InquiryPriceRefundInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InquiryPriceRefundInstanceResponseBody body;

    public static InquiryPriceRefundInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InquiryPriceRefundInstanceResponse self = new InquiryPriceRefundInstanceResponse();
        return TeaModel.build(map, self);
    }

    public InquiryPriceRefundInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InquiryPriceRefundInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InquiryPriceRefundInstanceResponse setBody(InquiryPriceRefundInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public InquiryPriceRefundInstanceResponseBody getBody() {
        return this.body;
    }

}

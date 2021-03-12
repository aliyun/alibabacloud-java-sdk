// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class DescribeAgreementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAgreementStatusResponseBody body;

    public static DescribeAgreementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgreementStatusResponse self = new DescribeAgreementStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgreementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgreementStatusResponse setBody(DescribeAgreementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgreementStatusResponseBody getBody() {
        return this.body;
    }

}

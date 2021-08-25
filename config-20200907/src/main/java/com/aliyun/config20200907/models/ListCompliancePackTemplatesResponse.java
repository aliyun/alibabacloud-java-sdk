// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCompliancePackTemplatesResponseBody body;

    public static ListCompliancePackTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePackTemplatesResponse self = new ListCompliancePackTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCompliancePackTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompliancePackTemplatesResponse setBody(ListCompliancePackTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompliancePackTemplatesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListPatentUserSearchCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPatentUserSearchCompanyResponseBody body;

    public static ListPatentUserSearchCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPatentUserSearchCompanyResponse self = new ListPatentUserSearchCompanyResponse();
        return TeaModel.build(map, self);
    }

    public ListPatentUserSearchCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPatentUserSearchCompanyResponse setBody(ListPatentUserSearchCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPatentUserSearchCompanyResponseBody getBody() {
        return this.body;
    }

}

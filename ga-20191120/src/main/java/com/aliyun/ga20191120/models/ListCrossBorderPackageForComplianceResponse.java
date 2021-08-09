// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCrossBorderPackageForComplianceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCrossBorderPackageForComplianceResponseBody body;

    public static ListCrossBorderPackageForComplianceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrossBorderPackageForComplianceResponse self = new ListCrossBorderPackageForComplianceResponse();
        return TeaModel.build(map, self);
    }

    public ListCrossBorderPackageForComplianceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrossBorderPackageForComplianceResponse setBody(ListCrossBorderPackageForComplianceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrossBorderPackageForComplianceResponseBody getBody() {
        return this.body;
    }

}

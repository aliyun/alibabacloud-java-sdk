// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpExcelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateIccidToIpExcelResponseBody body;

    public static AssociateIccidToIpExcelResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpExcelResponse self = new AssociateIccidToIpExcelResponse();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpExcelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateIccidToIpExcelResponse setBody(AssociateIccidToIpExcelResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateIccidToIpExcelResponseBody getBody() {
        return this.body;
    }

}

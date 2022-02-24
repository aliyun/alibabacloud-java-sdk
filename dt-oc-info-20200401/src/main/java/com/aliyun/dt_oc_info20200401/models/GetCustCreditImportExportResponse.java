// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCustCreditImportExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustCreditImportExportResponseBody body;

    public static GetCustCreditImportExportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustCreditImportExportResponse self = new GetCustCreditImportExportResponse();
        return TeaModel.build(map, self);
    }

    public GetCustCreditImportExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustCreditImportExportResponse setBody(GetCustCreditImportExportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustCreditImportExportResponseBody getBody() {
        return this.body;
    }

}

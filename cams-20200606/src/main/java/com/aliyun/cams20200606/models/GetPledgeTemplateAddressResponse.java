// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPledgeTemplateAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPledgeTemplateAddressResponseBody body;

    public static GetPledgeTemplateAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPledgeTemplateAddressResponse self = new GetPledgeTemplateAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetPledgeTemplateAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPledgeTemplateAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPledgeTemplateAddressResponse setBody(GetPledgeTemplateAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPledgeTemplateAddressResponseBody getBody() {
        return this.body;
    }

}

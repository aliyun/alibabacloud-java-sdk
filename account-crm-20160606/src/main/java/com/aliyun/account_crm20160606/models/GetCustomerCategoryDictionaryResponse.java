// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryDictionaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerCategoryDictionaryResponseBody body;

    public static GetCustomerCategoryDictionaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryDictionaryResponse self = new GetCustomerCategoryDictionaryResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryDictionaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerCategoryDictionaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerCategoryDictionaryResponse setBody(GetCustomerCategoryDictionaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerCategoryDictionaryResponseBody getBody() {
        return this.body;
    }

}

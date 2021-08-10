// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdateUserSearchCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOrUpdateUserSearchCompanyResponseBody body;

    public static SaveOrUpdateUserSearchCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateUserSearchCompanyResponse self = new SaveOrUpdateUserSearchCompanyResponse();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateUserSearchCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOrUpdateUserSearchCompanyResponse setBody(SaveOrUpdateUserSearchCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOrUpdateUserSearchCompanyResponseBody getBody() {
        return this.body;
    }

}

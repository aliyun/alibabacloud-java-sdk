// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddAuthorityTemplateItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAuthorityTemplateItemsResponseBody body;

    public static AddAuthorityTemplateItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorityTemplateItemsResponse self = new AddAuthorityTemplateItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddAuthorityTemplateItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuthorityTemplateItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAuthorityTemplateItemsResponse setBody(AddAuthorityTemplateItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuthorityTemplateItemsResponseBody getBody() {
        return this.body;
    }

}

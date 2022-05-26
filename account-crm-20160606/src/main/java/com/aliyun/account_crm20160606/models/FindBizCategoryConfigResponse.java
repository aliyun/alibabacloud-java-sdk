// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindBizCategoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindBizCategoryConfigResponseBody body;

    public static FindBizCategoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        FindBizCategoryConfigResponse self = new FindBizCategoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public FindBizCategoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindBizCategoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindBizCategoryConfigResponse setBody(FindBizCategoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public FindBizCategoryConfigResponseBody getBody() {
        return this.body;
    }

}

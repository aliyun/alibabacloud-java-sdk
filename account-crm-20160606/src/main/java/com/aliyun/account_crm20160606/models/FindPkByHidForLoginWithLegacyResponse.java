// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindPkByHidForLoginWithLegacyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindPkByHidForLoginWithLegacyResponseBody body;

    public static FindPkByHidForLoginWithLegacyResponse build(java.util.Map<String, ?> map) throws Exception {
        FindPkByHidForLoginWithLegacyResponse self = new FindPkByHidForLoginWithLegacyResponse();
        return TeaModel.build(map, self);
    }

    public FindPkByHidForLoginWithLegacyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindPkByHidForLoginWithLegacyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindPkByHidForLoginWithLegacyResponse setBody(FindPkByHidForLoginWithLegacyResponseBody body) {
        this.body = body;
        return this;
    }
    public FindPkByHidForLoginWithLegacyResponseBody getBody() {
        return this.body;
    }

}

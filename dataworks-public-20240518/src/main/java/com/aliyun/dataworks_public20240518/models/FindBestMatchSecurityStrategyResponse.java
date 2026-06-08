// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class FindBestMatchSecurityStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindBestMatchSecurityStrategyResponseBody body;

    public static FindBestMatchSecurityStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        FindBestMatchSecurityStrategyResponse self = new FindBestMatchSecurityStrategyResponse();
        return TeaModel.build(map, self);
    }

    public FindBestMatchSecurityStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindBestMatchSecurityStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindBestMatchSecurityStrategyResponse setBody(FindBestMatchSecurityStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public FindBestMatchSecurityStrategyResponseBody getBody() {
        return this.body;
    }

}

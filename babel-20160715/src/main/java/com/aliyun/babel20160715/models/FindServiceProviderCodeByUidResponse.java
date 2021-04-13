// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class FindServiceProviderCodeByUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindServiceProviderCodeByUidResponseBody body;

    public static FindServiceProviderCodeByUidResponse build(java.util.Map<String, ?> map) throws Exception {
        FindServiceProviderCodeByUidResponse self = new FindServiceProviderCodeByUidResponse();
        return TeaModel.build(map, self);
    }

    public FindServiceProviderCodeByUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindServiceProviderCodeByUidResponse setBody(FindServiceProviderCodeByUidResponseBody body) {
        this.body = body;
        return this;
    }
    public FindServiceProviderCodeByUidResponseBody getBody() {
        return this.body;
    }

}

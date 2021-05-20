// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataServicePublishedApisResponseBody body;

    public static ListDataServicePublishedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisResponse self = new ListDataServicePublishedApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServicePublishedApisResponse setBody(ListDataServicePublishedApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServicePublishedApisResponseBody getBody() {
        return this.body;
    }

}

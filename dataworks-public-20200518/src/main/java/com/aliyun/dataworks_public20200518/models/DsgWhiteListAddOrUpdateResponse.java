// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListAddOrUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgWhiteListAddOrUpdateResponseBody body;

    public static DsgWhiteListAddOrUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListAddOrUpdateResponse self = new DsgWhiteListAddOrUpdateResponse();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListAddOrUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgWhiteListAddOrUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgWhiteListAddOrUpdateResponse setBody(DsgWhiteListAddOrUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgWhiteListAddOrUpdateResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportOneTaskPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportOneTaskPhoneNumberResponseBody body;

    public static ImportOneTaskPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportOneTaskPhoneNumberResponse self = new ImportOneTaskPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ImportOneTaskPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportOneTaskPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportOneTaskPhoneNumberResponse setBody(ImportOneTaskPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportOneTaskPhoneNumberResponseBody getBody() {
        return this.body;
    }

}

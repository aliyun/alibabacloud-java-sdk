// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body;

    public static SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse self = new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse setBody(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody getBody() {
        return this.body;
    }

}

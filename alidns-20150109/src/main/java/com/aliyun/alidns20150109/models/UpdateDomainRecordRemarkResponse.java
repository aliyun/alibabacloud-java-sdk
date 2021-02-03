// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDomainRecordRemarkResponseBody body;

    public static UpdateDomainRecordRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRemarkResponse self = new UpdateDomainRecordRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainRecordRemarkResponse setBody(UpdateDomainRecordRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainRecordRemarkResponseBody getBody() {
        return this.body;
    }

}

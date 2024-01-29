// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDnsGtmAddressPoolResponseBody body;

    public static UpdateDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolResponse self = new UpdateDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDnsGtmAddressPoolResponse setBody(UpdateDnsGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}

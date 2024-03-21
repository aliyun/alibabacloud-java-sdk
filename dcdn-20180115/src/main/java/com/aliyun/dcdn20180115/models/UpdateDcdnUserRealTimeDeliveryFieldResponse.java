// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDcdnUserRealTimeDeliveryFieldResponseBody body;

    public static UpdateDcdnUserRealTimeDeliveryFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnUserRealTimeDeliveryFieldResponse self = new UpdateDcdnUserRealTimeDeliveryFieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnUserRealTimeDeliveryFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnUserRealTimeDeliveryFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDcdnUserRealTimeDeliveryFieldResponse setBody(UpdateDcdnUserRealTimeDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnUserRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDcdnUserRealTimeDeliveryFieldResponse setBody(UpdateDcdnUserRealTimeDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnUserRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDomainOfflineLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDcdnDomainOfflineLogDeliveryResponseBody body;

    public static CreateDcdnDomainOfflineLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDomainOfflineLogDeliveryResponse self = new CreateDcdnDomainOfflineLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDomainOfflineLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnDomainOfflineLogDeliveryResponse setBody(CreateDcdnDomainOfflineLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnDomainOfflineLogDeliveryResponseBody getBody() {
        return this.body;
    }

}

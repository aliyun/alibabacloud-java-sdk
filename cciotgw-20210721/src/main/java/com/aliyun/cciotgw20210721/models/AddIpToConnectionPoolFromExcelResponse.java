// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddIpToConnectionPoolFromExcelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddIpToConnectionPoolFromExcelResponseBody body;

    public static AddIpToConnectionPoolFromExcelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpToConnectionPoolFromExcelResponse self = new AddIpToConnectionPoolFromExcelResponse();
        return TeaModel.build(map, self);
    }

    public AddIpToConnectionPoolFromExcelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpToConnectionPoolFromExcelResponse setBody(AddIpToConnectionPoolFromExcelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpToConnectionPoolFromExcelResponseBody getBody() {
        return this.body;
    }

}

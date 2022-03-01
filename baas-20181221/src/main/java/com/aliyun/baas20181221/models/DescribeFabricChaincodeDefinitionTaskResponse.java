// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeDefinitionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricChaincodeDefinitionTaskResponseBody body;

    public static DescribeFabricChaincodeDefinitionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeDefinitionTaskResponse self = new DescribeFabricChaincodeDefinitionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeDefinitionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChaincodeDefinitionTaskResponse setBody(DescribeFabricChaincodeDefinitionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChaincodeDefinitionTaskResponseBody getBody() {
        return this.body;
    }

}

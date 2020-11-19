// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableInstanceIpv6AddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static EnableInstanceIpv6AddressResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceIpv6AddressResponse self = new EnableInstanceIpv6AddressResponse();
        return TeaModel.build(map, self);
    }

    public EnableInstanceIpv6AddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableInstanceIpv6AddressResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}

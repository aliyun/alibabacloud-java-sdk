// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceProviderKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceKey")
    public String serviceKey;

    public static GetServiceProviderKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProviderKeyResponseBody self = new GetServiceProviderKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceProviderKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceProviderKeyResponseBody setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }
    public String getServiceKey() {
        return this.serviceKey;
    }

}

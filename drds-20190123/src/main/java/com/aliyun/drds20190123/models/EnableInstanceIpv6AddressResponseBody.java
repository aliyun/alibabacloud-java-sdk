// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableInstanceIpv6AddressResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInstanceIpv6AddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceIpv6AddressResponseBody self = new EnableInstanceIpv6AddressResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstanceIpv6AddressResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnableInstanceIpv6AddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

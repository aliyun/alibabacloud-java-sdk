// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardWsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>552F83A7-80C9-17ED-B344-0E13F7D3BF00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalGuardWsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardWsResponseBody self = new MultiModalGuardWsResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardWsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

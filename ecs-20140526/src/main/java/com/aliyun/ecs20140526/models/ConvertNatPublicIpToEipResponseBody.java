// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConvertNatPublicIpToEipResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConvertNatPublicIpToEipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertNatPublicIpToEipResponseBody self = new ConvertNatPublicIpToEipResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertNatPublicIpToEipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

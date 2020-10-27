// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConvertNatPublicIpToEipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConvertNatPublicIpToEipResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertNatPublicIpToEipResponse self = new ConvertNatPublicIpToEipResponse();
        return TeaModel.build(map, self);
    }

    public ConvertNatPublicIpToEipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

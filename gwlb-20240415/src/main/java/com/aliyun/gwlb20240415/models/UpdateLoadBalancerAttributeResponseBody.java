// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B956C629-0E8C-5EFF-BAC1-B0E3A8C5CBDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeResponseBody self = new UpdateLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

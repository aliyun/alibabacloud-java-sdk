// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DetachVpcFromNetLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachVpcFromNetLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachVpcFromNetLinkResponseBody self = new DetachVpcFromNetLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachVpcFromNetLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

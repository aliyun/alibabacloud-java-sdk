// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupsResponseBody self = new DeleteEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

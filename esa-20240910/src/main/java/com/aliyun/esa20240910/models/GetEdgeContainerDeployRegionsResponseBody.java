// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerDeployRegionsResponseBody extends TeaModel {
    /**
     * <p>The regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerDeployRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerDeployRegionsResponseBody self = new GetEdgeContainerDeployRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerDeployRegionsResponseBody setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerDeployRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

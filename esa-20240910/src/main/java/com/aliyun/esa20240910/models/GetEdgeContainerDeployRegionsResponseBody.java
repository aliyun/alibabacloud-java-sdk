// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerDeployRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>Id of the request</p>
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

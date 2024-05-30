// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostResponseBody extends TeaModel {
    @NameInMap("Commodity")
    public java.util.Map<String, ?> commodity;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.Map<String, ?> resources;

    public static GetServiceEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostResponseBody self = new GetServiceEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostResponseBody setCommodity(java.util.Map<String, ?> commodity) {
        this.commodity = commodity;
        return this;
    }
    public java.util.Map<String, ?> getCommodity() {
        return this.commodity;
    }

    public GetServiceEstimateCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEstimateCostResponseBody setResources(java.util.Map<String, ?> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.Map<String, ?> getResources() {
        return this.resources;
    }

}

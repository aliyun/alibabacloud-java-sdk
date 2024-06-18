// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRouteRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDynamicRouteRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicRouteRegionsResponseBody self = new ListDynamicRouteRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicRouteRegionsResponseBody setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public ListDynamicRouteRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDynamicRouteRegionsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

}

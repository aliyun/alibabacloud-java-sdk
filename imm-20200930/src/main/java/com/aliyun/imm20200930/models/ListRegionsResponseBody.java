// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<RegionType> regions;

    /**
     * <strong>example:</strong>
     * <p>7F7D235C-76FF-4B65-800C-8238AE3F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegions(java.util.List<RegionType> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<RegionType> getRegions() {
        return this.regions;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

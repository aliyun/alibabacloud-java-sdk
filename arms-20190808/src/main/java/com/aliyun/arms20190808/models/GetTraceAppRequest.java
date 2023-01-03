// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppRequest extends TeaModel {
    // The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](~~186100~~#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetTraceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppRequest self = new GetTraceAppRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetTraceAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceAppRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

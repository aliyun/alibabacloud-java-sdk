// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopInvocationRequest extends TeaModel {
    // The ID of cloud desktop. Valid values of N: 1 to 50.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The ID of the execution.
    @NameInMap("InvokeId")
    public String invokeId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static StopInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationRequest self = new StopInvocationRequest();
        return TeaModel.build(map, self);
    }

    public StopInvocationRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StopInvocationRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public StopInvocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

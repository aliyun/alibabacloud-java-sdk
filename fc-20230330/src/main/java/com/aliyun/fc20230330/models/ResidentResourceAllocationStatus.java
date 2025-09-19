// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentResourceAllocationStatus extends TeaModel {
    @NameInMap("lastAllocatedTime")
    public String lastAllocatedTime;

    @NameInMap("lastAllocation")
    public java.util.List<ResidentResourceAllocation> lastAllocation;

    public static ResidentResourceAllocationStatus build(java.util.Map<String, ?> map) throws Exception {
        ResidentResourceAllocationStatus self = new ResidentResourceAllocationStatus();
        return TeaModel.build(map, self);
    }

    public ResidentResourceAllocationStatus setLastAllocatedTime(String lastAllocatedTime) {
        this.lastAllocatedTime = lastAllocatedTime;
        return this;
    }
    public String getLastAllocatedTime() {
        return this.lastAllocatedTime;
    }

    public ResidentResourceAllocationStatus setLastAllocation(java.util.List<ResidentResourceAllocation> lastAllocation) {
        this.lastAllocation = lastAllocation;
        return this;
    }
    public java.util.List<ResidentResourceAllocation> getLastAllocation() {
        return this.lastAllocation;
    }

}

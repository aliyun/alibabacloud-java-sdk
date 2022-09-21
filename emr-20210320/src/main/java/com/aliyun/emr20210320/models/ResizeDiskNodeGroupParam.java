// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ResizeDiskNodeGroupParam extends TeaModel {
    @NameInMap("DataDiskCapacity")
    public Long dataDiskCapacity;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("RollingRestart")
    public Boolean rollingRestart;

    public static ResizeDiskNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskNodeGroupParam self = new ResizeDiskNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public ResizeDiskNodeGroupParam setDataDiskCapacity(Long dataDiskCapacity) {
        this.dataDiskCapacity = dataDiskCapacity;
        return this;
    }
    public Long getDataDiskCapacity() {
        return this.dataDiskCapacity;
    }

    public ResizeDiskNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ResizeDiskNodeGroupParam setRollingRestart(Boolean rollingRestart) {
        this.rollingRestart = rollingRestart;
        return this;
    }
    public Boolean getRollingRestart() {
        return this.rollingRestart;
    }

}

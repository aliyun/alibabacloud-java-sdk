// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingTaskGroupResponseBody extends TeaModel {
    @NameInMap("HostGroupId")
    public String hostGroupId;

    public static ModifyScalingTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingTaskGroupResponseBody self = new ModifyScalingTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingTaskGroupResponseBody setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

}

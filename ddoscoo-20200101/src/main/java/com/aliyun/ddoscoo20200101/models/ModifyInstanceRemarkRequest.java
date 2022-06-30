// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Remark")
    public String remark;

    public static ModifyInstanceRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkRequest self = new ModifyInstanceRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

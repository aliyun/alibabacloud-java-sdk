// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-vj30bil8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The description of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsmOnline</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ConfigInstanceRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceRemarkRequest self = new ConfigInstanceRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetMcuLvsIpRequest extends TeaModel {
    /**
     * <p>Instance ID of the Artificial Intelligence Cloud Call Service (AICCS) instance. You can obtain instance ID from the AICCS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMcuLvsIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcuLvsIpRequest self = new GetMcuLvsIpRequest();
        return TeaModel.build(map, self);
    }

    public GetMcuLvsIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

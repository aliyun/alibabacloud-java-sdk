// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceTrialStatusRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceTrialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrialStatusRequest self = new GetInstanceTrialStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrialStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

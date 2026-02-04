// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceGlobalizationConfigRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceGlobalizationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGlobalizationConfigRequest self = new GetInstanceGlobalizationConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceGlobalizationConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

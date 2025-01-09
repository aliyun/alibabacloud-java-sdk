// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceLicenseRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk2676xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLicenseRequest self = new GetInstanceLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

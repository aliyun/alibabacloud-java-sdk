// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateInstanceTrialLicenseRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateInstanceTrialLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTrialLicenseRequest self = new CreateInstanceTrialLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTrialLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

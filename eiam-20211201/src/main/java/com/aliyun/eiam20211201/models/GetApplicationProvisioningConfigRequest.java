// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetApplicationProvisioningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningConfigRequest self = new GetApplicationProvisioningConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetApplicationProvisioningConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

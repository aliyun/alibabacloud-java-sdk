// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationProvisioningRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableApplicationProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationProvisioningRequest self = new EnableApplicationProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationProvisioningRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public EnableApplicationProvisioningRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

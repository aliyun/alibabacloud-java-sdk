// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to disable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationRequest self = new DisableApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

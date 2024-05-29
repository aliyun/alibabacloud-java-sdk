// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationSsoRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableApplicationSsoRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationSsoRequest self = new DisableApplicationSsoRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationSsoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableApplicationSsoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

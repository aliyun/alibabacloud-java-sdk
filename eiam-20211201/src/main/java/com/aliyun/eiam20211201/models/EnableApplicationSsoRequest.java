// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationSsoRequest extends TeaModel {
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

    public static EnableApplicationSsoRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationSsoRequest self = new EnableApplicationSsoRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationSsoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public EnableApplicationSsoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

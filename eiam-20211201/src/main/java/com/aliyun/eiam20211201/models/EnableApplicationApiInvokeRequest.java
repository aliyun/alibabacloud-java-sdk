// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationApiInvokeRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableApplicationApiInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationApiInvokeRequest self = new EnableApplicationApiInvokeRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationApiInvokeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public EnableApplicationApiInvokeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationSsoConfigRequest extends TeaModel {
    // IDaaS的应用资源ID。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM的实例id
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetApplicationSsoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationSsoConfigRequest self = new GetApplicationSsoConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationSsoConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetApplicationSsoConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

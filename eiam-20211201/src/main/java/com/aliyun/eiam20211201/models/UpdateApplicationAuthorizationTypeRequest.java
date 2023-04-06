// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAuthorizationTypeRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用的授权类型</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>IDaaS EIAM的实例id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateApplicationAuthorizationTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAuthorizationTypeRequest self = new UpdateApplicationAuthorizationTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAuthorizationTypeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationAuthorizationTypeRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public UpdateApplicationAuthorizationTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

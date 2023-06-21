// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAuthorizationTypeRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to modify.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The authorization type of the application. Valid values:</p>
     * <br>
     * <p>*   authorize_required: Only the user with explicit authorization can access the application.</p>
     * <p>*   default_all: By default, all users can access the application.</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>The ID of the instance.</p>
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

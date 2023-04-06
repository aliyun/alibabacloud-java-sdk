// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationGrantScopeRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>api调用的授权范围</p>
     */
    @NameInMap("GrantScopes")
    public java.util.List<String> grantScopes;

    /**
     * <p>IDaaS EIAM的实例id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetApplicationGrantScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationGrantScopeRequest self = new SetApplicationGrantScopeRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationGrantScopeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationGrantScopeRequest setGrantScopes(java.util.List<String> grantScopes) {
        this.grantScopes = grantScopes;
        return this;
    }
    public java.util.List<String> getGrantScopes() {
        return this.grantScopes;
    }

    public SetApplicationGrantScopeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

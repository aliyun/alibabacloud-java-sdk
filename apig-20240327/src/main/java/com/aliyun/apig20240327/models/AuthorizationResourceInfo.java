// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthorizationResourceInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>api-cujbijem1hkr4voden8g</p>
     */
    @NameInMap("parentResourceId")
    public String parentResourceId;

    /**
     * <strong>example:</strong>
     * <p>hr-d0mnu16m1hkgujnkgrcg</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    public static AuthorizationResourceInfo build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationResourceInfo self = new AuthorizationResourceInfo();
        return TeaModel.build(map, self);
    }

    public AuthorizationResourceInfo setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public AuthorizationResourceInfo setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }
    public String getParentResourceId() {
        return this.parentResourceId;
    }

    public AuthorizationResourceInfo setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}

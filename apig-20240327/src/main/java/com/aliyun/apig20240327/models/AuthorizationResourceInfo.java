// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthorizationResourceInfo extends TeaModel {
    @NameInMap("environmentId")
    public String environmentId;

    @NameInMap("parentResourceId")
    public String parentResourceId;

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

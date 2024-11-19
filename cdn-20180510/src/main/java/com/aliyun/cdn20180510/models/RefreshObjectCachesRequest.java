// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCachesRequest self = new RefreshObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

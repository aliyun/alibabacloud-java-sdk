// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesRequest extends TeaModel {
    /**
     * <p>The path of the objects that you want to refresh. Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The refresh type. Valid values:</p>
     * <br>
     * <p>*   **File**: URL</p>
     * <p>*   **Directory**: directory</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshDcdnObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesRequest self = new RefreshDcdnObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshDcdnObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshDcdnObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshDcdnObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

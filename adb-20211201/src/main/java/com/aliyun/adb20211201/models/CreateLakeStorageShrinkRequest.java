// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateLakeStorageShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure request idempotence. If you use the same token for requests with different parameters, the IdempotentParameterMismatch error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>b2cd****3efg</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID of the ADB instance to which the lake storage is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>When you create a lake storage, permissions are automatically granted to the Resource Access Management (RAM) users and the primary account used for the operation. You can increase additional authorizations for the primary account here.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Account&quot;:&quot;1234567890123456&quot;,&quot;Read&quot;:true,&quot;Type&quot;:&quot;CUSTOMER&quot;,&quot;Write&quot;:true}]</p>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateLakeStorageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeStorageShrinkRequest self = new CreateLakeStorageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakeStorageShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLakeStorageShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateLakeStorageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLakeStorageShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public CreateLakeStorageShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateLakeStorageShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.
     * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the AnalyticDB for MySQL cluster with which you want to associate the lake storage.</p>
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
     * <p>The permissions that you want to grant on the lake storage to the Alibaba Cloud account besides the permissions that are automatically granted to the Resource Access Management (RAM) user or the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>The region ID.</p>
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

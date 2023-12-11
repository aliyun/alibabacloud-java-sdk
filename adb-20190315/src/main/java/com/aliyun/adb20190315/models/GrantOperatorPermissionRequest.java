// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The expiration time of the service account permissions. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the permissions. Valid values:</p>
     * <br>
     * <p>*   **Control**: configuration permissions. The service account is granted permissions to query and modify cluster configurations.</p>
     * <p>*   **Data**: data permissions. The service account is granted permissions to query schemas, indexes, and SQL statements.</p>
     */
    @NameInMap("Privileges")
    public String privileges;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GrantOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionRequest self = new GrantOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantOperatorPermissionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GrantOperatorPermissionRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public GrantOperatorPermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantOperatorPermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantOperatorPermissionRequest setPrivileges(String privileges) {
        this.privileges = privileges;
        return this;
    }
    public String getPrivileges() {
        return this.privileges;
    }

    public GrantOperatorPermissionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantOperatorPermissionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

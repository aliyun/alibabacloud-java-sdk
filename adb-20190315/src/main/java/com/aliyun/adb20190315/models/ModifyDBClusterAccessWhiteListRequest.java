// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListRequest extends TeaModel {
    /**
     * <p>The attribute of the whitelist. This parameter is empty by default.</p>
     * <br>
     * <p>The IP address whitelists that have the hidden attribute are not displayed in the AnalyticDB for MySQL console. These IP address whitelists are used to access Alibaba Cloud services such as Data Transmission Service (DTS) and PolarDB-X.</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the IP address whitelist to be modified. Default value: Default.</p>
     * <br>
     * <p>The name of an IP address whitelist must be 2 to 32 characters in length. The name must contain lowercase letters, digits, and underscores (\_). The name must start with a lowercase letter and end with a digit or lowercase letter.</p>
     * <br>
     * <p>You can create up to 50 whitelists for a cluster.</p>
     */
    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The method used to modify the whitelist. Valid values:</p>
     * <br>
     * <p>*   Cover: overwrites the original IP address whitelist.</p>
     * <p>*   Append: adds one or more IP addresses.</p>
     * <p>*   Delete: deletes one or more IP addresses.</p>
     * <br>
     * <p>Default value: Cover.</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP addresses in an IP address whitelist of a cluster. Separate multiple IP addresses with commas (,). You can add a maximum of 500 different IP addresses to a whitelist. The following formats are supported:</p>
     * <br>
     * <p>*   IP addresses. Example: 10.23.12.24.</p>
     * <p>*   CIDR blocks. Example: 10.23.12.24/24. 24 indicates that the prefix of the CIDR block is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</p>
     * <br>
     * <p>This parameter must be specified unless the ModifyMode parameter is set to Delete.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    public static ModifyDBClusterAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListRequest self = new ModifyDBClusterAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
        this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
        return this;
    }
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterIPArrayName(String DBClusterIPArrayName) {
        this.DBClusterIPArrayName = DBClusterIPArrayName;
        return this;
    }
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAccessWhiteListRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyDBClusterAccessWhiteListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterAccessWhiteListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterAccessWhiteListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterAccessWhiteListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterAccessWhiteListRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}

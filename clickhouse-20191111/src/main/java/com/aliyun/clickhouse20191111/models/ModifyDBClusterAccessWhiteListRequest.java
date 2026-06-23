// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListRequest extends TeaModel {
    /**
     * <p>The attribute of the whitelist group. The default value is <strong>empty</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the whitelist group to modify.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the whitelist of the default group is modified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The modification method. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong>: Overwrites the whitelist.</p>
     * </li>
     * <li><p><strong>Append</strong>: Adds IP addresses to the whitelist.</p>
     * </li>
     * <li><p><strong>Delete</strong>: Removes IP addresses from the whitelist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the Cover method is used by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
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
     * <p>The IP address whitelist. The following formats are supported:</p>
     * <ul>
     * <li><p>IP address: For example, 192.168.0.1. This allows the specified IP address to access the ApsaraDB for ClickHouse cluster.</p>
     * </li>
     * <li><p>CIDR block: For example, 192.168.0.0/24. This allows IP addresses from 192.168.0.1 to 192.168.0.255 to access the ApsaraDB for ClickHouse cluster.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Do not enter 0.0.0.0.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Set this parameter to 127.0.0.1 to block access from all IP addresses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
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

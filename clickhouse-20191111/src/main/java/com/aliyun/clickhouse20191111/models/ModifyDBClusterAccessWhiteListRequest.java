// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListRequest extends TeaModel {
    /**
     * <p>The attribute of the whitelist group. Default value: <strong>empty</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the whitelist group to be modified.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the whitelist in the default group is modified.</p>
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
     * <p>The modification mode. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: overwrites the original whitelist.</li>
     * <li><strong>Append</strong>: appends the specified IP addresses to the original whitelist.</li>
     * <li><strong>Delete</strong>: deletes the original whitelist.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the Cover mode is used by default.</p>
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
     * <p>The IP whitelist. Two formats are supported:</p>
     * <ul>
     * <li>IP address: For example, 192.168.0.1 allows this IP address to access the ApsaraDB for ClickHouse cluster.</li>
     * <li>CIDR block: For example, 192.168.0.0/24 allows IP addresses from 192.168.0.1 to 192.168.0.255 to access the ApsaraDB for ClickHouse cluster.<blockquote>
     * <ul>
     * <li>Do not enter 0.0.0.0.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>Set the value to 127.0.0.1 to deny access from all IP addresses.</li>
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

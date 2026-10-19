// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. Example: qwertyui1234567</p>
     * 
     * <strong>example:</strong>
     * <p>qwertyui1234567</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:
     * true: performs a dry run without calling the operation. The system checks the request parameters, request format, service limits, and available resources. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.
     * false (default): sends the request. If the check succeeds, the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The modification method. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: Overwrites the original whitelist.</li>
     * <li><strong>Append</strong>: Appends to the whitelist. An error is returned if duplicate IP addresses exist.</li>
     * <li><strong>Extend</strong>: Appends to the whitelist. Duplicate IP addresses are merged.</li>
     * <li><strong>Delete</strong>: Deletes the whitelist.</li>
     * </ul>
     * <p>Default value: <strong>Cover</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Append</p>
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
     * <p>The attribute of the whitelist group. The value can contain uppercase letters, lowercase letters, and digits. The maximum length is 120 characters.</p>
     * <p>Default value: empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SecurityIpGroupAttribute")
    public String securityIpGroupAttribute;

    /**
     * <p>The name of the IP whitelist group to modify. Default value: <strong>default</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>allowserver</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The list of IP addresses in the IP whitelist group. Separate multiple IP addresses with commas (,). IP addresses cannot be duplicated. A maximum of 1000 IP addresses are supported. The following two formats are supported:</p>
     * <ul>
     * <li>IP address format, such as 127.0.0.1.</li>
     * <li>CIDR format, such as 127.0.0.1/24 (Classless Inter-Domain Routing, where 24 indicates the length of the prefix in the address. The value ranges from 1 to 32).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1/24,127.0.0.1</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityIpsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySecurityIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifySecurityIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySecurityIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityIpsRequest setSecurityIpGroupAttribute(String securityIpGroupAttribute) {
        this.securityIpGroupAttribute = securityIpGroupAttribute;
        return this;
    }
    public String getSecurityIpGroupAttribute() {
        return this.securityIpGroupAttribute;
    }

    public ModifySecurityIpsRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public ModifySecurityIpsRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}

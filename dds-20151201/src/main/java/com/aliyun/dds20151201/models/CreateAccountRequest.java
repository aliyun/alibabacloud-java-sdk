// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The account description.</p>
     * <ul>
     * <li>Regular expression: <code>^[a-zA-Z一-龥][a-zA-Z一-龥0-9_.-]{1,255}$</code>. The description must start with an English letter or Chinese character, followed by English letters, Chinese characters, digits, underscores (_), periods (.), or hyphens (-). The length must be 2 to 256 characters.</li>
     * <li>If the description is invalid, InvalidAccountDescription.Malformed is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The account name.</p>
     * <ul>
     * <li>Regular expression: <code>^[a-z]+[a-z0-9|_]*[a-z0-9]+$</code>. The name must start with a lowercase letter, end with a lowercase letter or digit, and can contain lowercase letters, digits, and underscores (_). The length must be 2 to 16 characters.</li>
     * <li>The reserved name <code>root</code> (case-insensitive, built-in system account) cannot be used.</li>
     * <li>The name cannot start with <code>__cloud</code> (reserved prefix for system accounts).</li>
     * <li>If the name is invalid, <code>InvalidAccountName.Malformed</code> is returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account password.</p>
     * <ul>
     * <li>The length must be 8 to 32 characters. It can contain uppercase letters, lowercase letters, digits, and the following special characters: <code>!@#$%^&amp;*()_+-=</code>.</li>
     * <li>The password must contain at least <strong>three</strong> of the following four character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>If the password is invalid, <code>InvalidAccountPassword.Malformed</code> is returned.</li>
     * </ul>
     * <blockquote>
     * <p>For information about how to handle special characters, see <a href="https://help.aliyun.com/document_detail/471568.html">How do I resolve the connection failure caused by special characters in the account name or password of a connection string?</a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456!</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The account type.<br>Valid values:<br>- <code>normal</code>: replica set account. For a replica set instance, any value is processed as <code>normal</code>.<br>- <code>cs</code>: sharded cluster ConfigServer account.<br>- <code>db</code>: sharded cluster Shard direct connection account. For a sharded cluster instance, any value other than <code>cs</code> is processed as <code>db</code>.<br>Default value: <code>db</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID. For a sharded cluster instance, specify the sharded cluster ID. Account operations are executed from the perspective of the ConfigServer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf6e9433e955xxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database to which the account belongs (authentication database).<br>
     * Default value: <code>admin</code>.<br>Rules: If this parameter is left empty, the request is allowed and the downstream system processes it as <code>admin</code>. If this parameter is specified, the length must be 1 to 63 characters. The value cannot contain <code>/</code>, <code>\\</code>, <code>.</code>, spaces, <code>&quot;</code>, or <code>$</code>, and cannot be <code>local</code>. Otherwise, <code>InvalidParameter</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of authorization roles for the account. <strong>Required for replica set and ConfigServer (cs) accounts</strong>. <strong>Prohibited for sharded cluster Shard direct connection (db) accounts</strong>.</p>
     * <ul>
     * <li><strong>Globally prohibited</strong> (returns <code>InvalidRoles.NotAllowed</code>): <code>root</code>, <code>clusterAdmin</code>, <code>hostManager</code>, <code>clusterManager</code>, <code>__system</code>, <code>__queryableBackup</code>, and <code>restore</code>.</li>
     * <li><strong>Can be authorized to any database (including admin)</strong>: <code>read</code>, <code>userAdmin</code>, and <code>enableSharding</code>.</li>
     * <li><strong>Can only be authorized to non-admin databases</strong> (returns <code>InvalidRoles.InvalidDB</code> if authorized to admin): <code>readWrite</code>, <code>dbAdmin</code>, and <code>dbOwner</code>.</li>
     * <li><strong>Can only be authorized to the admin database</strong>: <code>readAnyDatabase</code>, <code>readWriteAnyDatabase</code>, <code>userAdminAnyDatabase</code>, <code>dbAdminAnyDatabase</code>, <code>clusterMonitor</code>, <code>backup</code>, and <code>alibabaCloudAdmin</code>. (<code>alibabaCloudAdmin</code> is supported only for instances with kernel version 4.4 or later. For earlier versions, <code>InvalidRoles.NotAllowed</code> is returned.)</li>
     * <li><strong>Custom roles</strong>: Roles other than the preceding ones are considered custom roles and must already exist in the instance (you can query them by calling DescribeAccountRoles). Otherwise, <code>InvalidRoles.NotFound</code> is returned. <code>Roles.N.DBName</code> must be the same as the database where the role is defined. Otherwise, <code>InvalidRoles.DBNotMatch</code> is returned.</li>
     * <li>If <code>Roles</code> is missing as a whole, <code>MissingRoles</code> is returned. If <code>Roles.N.Role</code> and <code>Roles.N.DBName</code> do not appear in pairs, <code>InvalidRoles.Malformed</code> is returned. If <code>Roles</code> is passed for a sharded cluster Shard direct connection account, <code>InvalidRoles.NotSupported</code> is returned.</li>
     * </ul>
     */
    @NameInMap("Roles")
    public java.util.List<CreateAccountRequestRoles> roles;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public CreateAccountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateAccountRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateAccountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAccountRequest setRoles(java.util.List<CreateAccountRequestRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<CreateAccountRequestRoles> getRoles() {
        return this.roles;
    }

    public static class CreateAccountRequestRoles extends TeaModel {
        /**
         * <p>The database to which the account belongs (authentication database).<br>
         * Default value: <code>admin</code>.<br>Rules: If this parameter is left empty, the request is allowed and the downstream system processes it as <code>admin</code>. If this parameter is specified, the length must be 1 to 63 characters. The value cannot contain <code>/</code>, <code>\\</code>, <code>.</code>, spaces, <code>&quot;</code>, or <code>$</code>, and cannot be <code>local</code>. Otherwise, <code>InvalidParameter</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The role name. It can be a built-in role or a custom role created on the instance. For value rules, see <a href="https://www.alibabacloud.com/help/en/mongodb/manage-database-accounts-through-the-console">Roles parameter description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>read</p>
         */
        @NameInMap("Role")
        public String role;

        public static CreateAccountRequestRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountRequestRoles self = new CreateAccountRequestRoles();
            return TeaModel.build(map, self);
        }

        public CreateAccountRequestRoles setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public CreateAccountRequestRoles setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}

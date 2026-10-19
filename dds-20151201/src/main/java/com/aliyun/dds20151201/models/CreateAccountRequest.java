// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The account name. The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter. The account has read-only permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account password. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! @ # $ % ^ &amp; * ( ) _ + - =</p>
     * <blockquote>
     * <p>For information about how to handle special characters, see <a href="https://help.aliyun.com/document_detail/471568.html">What do I do if a connection fails because the username or password in the connection string contains special characters?</a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456!</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The type of the account to be created. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: shard account. This is the default value.</li>
     * <li><strong>cs</strong>: Configserver account.</li>
     * <li><strong>normal</strong>: replica set account.</li>
     * </ul>
     * <blockquote>
     * <p>Currently, only <strong>db</strong> accounts are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf6e9433e955xxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database to which the account belongs. This is the database where the account is created or on which the account operates. Default value: admin. The name must be 1 to 63 characters in length and cannot contain /, \, ., spaces, double quotation marks (&quot;), or $. The name cannot be local.</p>
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
     * <p>The list of authorized roles for the account.</p>
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
         * <p>The authorized database.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The granted permissions.</p>
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

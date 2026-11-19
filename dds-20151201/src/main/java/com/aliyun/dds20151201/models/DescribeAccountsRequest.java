// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountsRequest extends TeaModel {
    /**
     * <p>The account name.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account type.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1fd530f271****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The filter condition for the database to which the account belongs. If this parameter is left empty, all accounts are returned. If this parameter is specified, only the accounts in the specified database are returned.</p>
     * <blockquote>
     * <ul>
     * <li>Rule: When this parameter is not empty, the value must be 1 to 63 characters in length. It cannot contain <code>/</code>, <code>\\</code>, <code>.</code>, spaces, <code>&quot;</code>, or <code>$</code>, and the value cannot be <code>local</code>. Otherwise, the <code>InvalidParameter</code> error is reported.</li>
     * </ul>
     * </blockquote>
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

    public static DescribeAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsRequest self = new DescribeAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountsRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeAccountsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAccountsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeAccountsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAccountsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAccountsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAccountsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

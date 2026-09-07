// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRequest extends TeaModel {
    /**
     * <p>The description of the account.</p>
     * <ul>
     * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AccDesc</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The database account.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612430.html">DescribeAccounts</a> operation to query the database account information of a specified cluster, including the database account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_accout</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The following special characters are supported: <code>!@#$%^&amp;*()_+-=</code></li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test_accout1</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the cluster. The cluster can be an Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
     * <li><strong>Clickhouse</strong>: the wide table engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static ResetAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRequest self = new ResetAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public ResetAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetAccountPasswordRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetAccountPasswordRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ResetAccountPasswordRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ResetAccountPasswordRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}

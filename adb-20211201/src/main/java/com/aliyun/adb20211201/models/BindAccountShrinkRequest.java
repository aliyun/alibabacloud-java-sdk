// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountShrinkRequest extends TeaModel {
    /**
     * <p>The standard database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_accout</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz99d9nh532****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the Alibaba Cloud RAM user to bind.</p>
     * 
     * <strong>example:</strong>
     * <p>1444832459****</p>
     */
    @NameInMap("RamUser")
    public String ramUser;

    /**
     * <p>The list of IDs of the Alibaba Cloud RAM users to bind. Currently, only one RAM user can be bound. If you specify this parameter, the RamUser parameter does not take effect.</p>
     */
    @NameInMap("RamUserList")
    public String ramUserListShrink;

    public static BindAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountShrinkRequest self = new BindAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindAccountShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindAccountShrinkRequest setRamUser(String ramUser) {
        this.ramUser = ramUser;
        return this;
    }
    public String getRamUser() {
        return this.ramUser;
    }

    public BindAccountShrinkRequest setRamUserListShrink(String ramUserListShrink) {
        this.ramUserListShrink = ramUserListShrink;
        return this;
    }
    public String getRamUserListShrink() {
        return this.ramUserListShrink;
    }

}

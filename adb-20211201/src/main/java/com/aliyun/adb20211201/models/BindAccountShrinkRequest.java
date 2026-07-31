// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountShrinkRequest extends TeaModel {
    /**
     * <p>A standard database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_accout</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>ID of the cluster. Applies to Enterprise Edition, Basic Edition, or Data Lakehouse Edition clusters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz99d9nh532****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>ID of the Alibaba Cloud RAM user to bind.</p>
     * 
     * <strong>example:</strong>
     * <p>1444832459****</p>
     */
    @NameInMap("RamUser")
    public String ramUser;

    /**
     * <p>List of Alibaba Cloud RAM user IDs to bind. You can bind only one RAM user at a time. If you specify this parameter, the RamUser parameter is ignored.</p>
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

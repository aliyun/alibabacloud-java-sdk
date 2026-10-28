// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountRequest extends TeaModel {
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
    public java.util.List<String> ramUserList;

    public static BindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountRequest self = new BindAccountRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindAccountRequest setRamUser(String ramUser) {
        this.ramUser = ramUser;
        return this;
    }
    public String getRamUser() {
        return this.ramUser;
    }

    public BindAccountRequest setRamUserList(java.util.List<String> ramUserList) {
        this.ramUserList = ramUserList;
        return this;
    }
    public java.util.List<String> getRamUserList() {
        return this.ramUserList;
    }

}

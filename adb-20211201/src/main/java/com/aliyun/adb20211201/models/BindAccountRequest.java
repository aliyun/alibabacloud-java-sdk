// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountRequest extends TeaModel {
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

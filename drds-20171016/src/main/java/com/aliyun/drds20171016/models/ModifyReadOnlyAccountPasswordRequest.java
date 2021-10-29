// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyReadOnlyAccountPasswordRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("NewPasswd")
    public String newPasswd;

    @NameInMap("OriginPassword")
    public String originPassword;

    public static ModifyReadOnlyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadOnlyAccountPasswordRequest self = new ModifyReadOnlyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReadOnlyAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyReadOnlyAccountPasswordRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyReadOnlyAccountPasswordRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyReadOnlyAccountPasswordRequest setNewPasswd(String newPasswd) {
        this.newPasswd = newPasswd;
        return this;
    }
    public String getNewPasswd() {
        return this.newPasswd;
    }

    public ModifyReadOnlyAccountPasswordRequest setOriginPassword(String originPassword) {
        this.originPassword = originPassword;
        return this;
    }
    public String getOriginPassword() {
        return this.originPassword;
    }

}

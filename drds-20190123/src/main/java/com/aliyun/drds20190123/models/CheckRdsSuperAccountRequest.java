// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckRdsSuperAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Password")
    public String password;

    public static CheckRdsSuperAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsSuperAccountRequest self = new CheckRdsSuperAccountRequest();
        return TeaModel.build(map, self);
    }

    public CheckRdsSuperAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CheckRdsSuperAccountRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CheckRdsSuperAccountRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CheckRdsSuperAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}

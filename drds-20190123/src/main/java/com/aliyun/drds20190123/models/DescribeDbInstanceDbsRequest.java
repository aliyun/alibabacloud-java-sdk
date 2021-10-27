// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Password")
    public String password;

    public static DescribeDbInstanceDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceDbsRequest self = new DescribeDbInstanceDbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceDbsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeDbInstanceDbsRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public DescribeDbInstanceDbsRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DescribeDbInstanceDbsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDbInstanceDbsRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}

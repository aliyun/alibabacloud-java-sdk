// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbInstanceId")
    @Validation(required = true)
    public String dbInstanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Password")
    public String password;

    @NameInMap("DbInstType")
    public String dbInstType;

    public static DescribeDbInstanceDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceDbsRequest self = new DescribeDbInstanceDbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceDbsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDbInstanceDbsRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DescribeDbInstanceDbsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeDbInstanceDbsRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeDbInstanceDbsRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

}

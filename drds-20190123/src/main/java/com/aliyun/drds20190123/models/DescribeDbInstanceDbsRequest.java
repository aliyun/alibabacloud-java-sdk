// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsRequest extends TeaModel {
    /**
     * <p>The name of the privileged account of the PolarDB-X 1.0 instance. You do not need to specify this parameter if you have no privileged account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The engine type of the storage-layer databases. Valid values: **POLARDB** and **RDS**.</p>
     */
    @NameInMap("DbInstType")
    public String dbInstType;

    /**
     * <p>The ID of the instance in which the storage-layer databases are deployed.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The password of the privileged account. You do not need to specify this parameter if you have no privileged account.</p>
     */
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

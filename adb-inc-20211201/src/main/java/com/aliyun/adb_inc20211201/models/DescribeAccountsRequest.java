// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountsRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("OwnerId")
    public String ownerId;

    public static DescribeAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsRequest self = new DescribeAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAccountsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAccountsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}

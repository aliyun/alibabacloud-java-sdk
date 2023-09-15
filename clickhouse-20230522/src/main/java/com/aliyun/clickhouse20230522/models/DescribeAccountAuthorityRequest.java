// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAccountAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityRequest self = new DescribeAccountAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeAccountAuthorityRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAccountAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

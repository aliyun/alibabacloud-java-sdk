// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountRolesRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB for MongoDB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf6e9433e955****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to which the custom role belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    public static DescribeAccountRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRolesRequest self = new DescribeAccountRolesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRolesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAccountRolesRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

}

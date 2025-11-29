// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeExtensionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zhparser</p>
     */
    @NameInMap("ExtensionName")
    public String extensionName;

    public static DescribeExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionRequest self = new DescribeExtensionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeExtensionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeExtensionRequest setExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }
    public String getExtensionName() {
        return this.extensionName;
    }

}

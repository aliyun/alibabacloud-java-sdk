// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeExtensionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> Interface to query the details of all AnalyticDB PostgreSQL Instances in the target region, including Instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Database name.</p>
     * <ul>
     * <li>Only contain letters, digits, and underscores (_).</li>
     * <li>Must start with a letter.</li>
     * <li>Up to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The extension name.</p>
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

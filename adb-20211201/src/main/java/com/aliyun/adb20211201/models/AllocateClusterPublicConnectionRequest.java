// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionRequest extends TeaModel {
    /**
     * <p>Specifies the prefix of the public endpoint. The prefix must meet the following requirements:</p>
     * <ul>
     * <li>It must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-).</li>
     * <li>It can be up to 30 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test12</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1z5d2q71is2****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): AnalyticDB for MySQL engine.</li>
     * <li><strong>Clickhouse</strong>: wide table engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static AllocateClusterPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionRequest self = new AllocateClusterPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateClusterPublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AllocateClusterPublicConnectionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AllocateClusterPublicConnectionRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}

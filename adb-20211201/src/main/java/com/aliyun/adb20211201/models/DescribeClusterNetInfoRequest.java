// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of an Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of clusters in a specific region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9dqvn0o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</p>
     * </li>
     * <li><p><strong>ClickHouse</strong>: the wide table engine.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static DescribeClusterNetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetInfoRequest self = new DescribeClusterNetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeClusterNetInfoRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeClusterNetInfoRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}

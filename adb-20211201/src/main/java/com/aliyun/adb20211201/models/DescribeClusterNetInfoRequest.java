// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9dqvn0o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
     * <li><strong>Clickhouse</strong>: the wide table engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

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

}

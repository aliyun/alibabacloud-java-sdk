// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlIndexesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster ID of the Data Warehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the region ID of the cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch_oss</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The name of the target table.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the usage frequency data of all tables in the target cluster on the current day is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeAdbMySqlIndexesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlIndexesRequest self = new DescribeAdbMySqlIndexesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlIndexesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAdbMySqlIndexesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAdbMySqlIndexesRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeAdbMySqlIndexesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}

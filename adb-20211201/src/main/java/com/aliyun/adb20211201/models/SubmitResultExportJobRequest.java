// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitResultExportJobRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp10a0ng21t5****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The engine that is used to run the result set export job. Set the value to XIHE.</p>
     * 
     * <strong>example:</strong>
     * <p>XIHE</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The export type.</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource group that runs the result set export job.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The SQL statement that is used in the result set export job. You can specify only SELECT statements. If you specify other SQL statements, the request fails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM <code>fotor_com_datastore_resource</code>.<code>fotor_ai_create_task</code> where <code>date</code> = \&quot;2023-05-13\&quot; LIMIT 10;</p>
     */
    @NameInMap("SQL")
    public String SQL;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch_oss</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static SubmitResultExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitResultExportJobRequest self = new SubmitResultExportJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitResultExportJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SubmitResultExportJobRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public SubmitResultExportJobRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public SubmitResultExportJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitResultExportJobRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public SubmitResultExportJobRequest setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

    public SubmitResultExportJobRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}

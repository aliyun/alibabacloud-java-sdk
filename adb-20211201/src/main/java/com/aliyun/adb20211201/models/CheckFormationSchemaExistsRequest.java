// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckFormationSchemaExistsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable prefix mode. Valid values:</p>
     * <ul>
     * <li>true: Enable prefix mode.</li>
     * <li>false: Disable prefix mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrefixMode")
    public Boolean prefixMode;

    /**
     * <p>RegionId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>schema 。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static CheckFormationSchemaExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFormationSchemaExistsRequest self = new CheckFormationSchemaExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckFormationSchemaExistsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CheckFormationSchemaExistsRequest setPrefixMode(Boolean prefixMode) {
        this.prefixMode = prefixMode;
        return this;
    }
    public Boolean getPrefixMode() {
        return this.prefixMode;
    }

    public CheckFormationSchemaExistsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckFormationSchemaExistsRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
    /**
     * <p>The ID. You can obtain this value from the response of the ListTables operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <p>The format is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}:${SchemaName}:${TableName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
     * <blockquote>
     * <p>For MaxCompute and DLF types, use an empty string as a placeholder for the instance ID.</p>
     * </blockquote>
     * <blockquote>
     * <p>For StarRocks, the data catalog identifier is the catalog name. For DLF, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
     * </blockquote>
     * <blockquote>
     * <p>For MaxCompute, the database name is the MaxCompute project name. Projects with the three-layer model enabled require a schema name. For projects without the three-layer model enabled, use an empty string as a placeholder for the schema name.</p>
     * </blockquote>
     * <p>The following examples show the ID formats for common types:</p>
     * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
     * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
     * <p><code>hms-table:instance_id::database_name::table_name</code></p>
     * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
     * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
     * <blockquote>
     * <p>Where<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For MaxCompute, this is required only when the three-layer model is enabled for the project. Use an empty string as a placeholder if the three-layer model is not enabled.<br><code>table_name</code>: The table name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to include business metadata. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeBusinessMetadata")
    public Boolean includeBusinessMetadata;

    @NameInMap("IncludeExtendedProperties")
    public Boolean includeExtendedProperties;

    public static GetTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableRequest self = new GetTableRequest();
        return TeaModel.build(map, self);
    }

    public GetTableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTableRequest setIncludeBusinessMetadata(Boolean includeBusinessMetadata) {
        this.includeBusinessMetadata = includeBusinessMetadata;
        return this;
    }
    public Boolean getIncludeBusinessMetadata() {
        return this.includeBusinessMetadata;
    }

    public GetTableRequest setIncludeExtendedProperties(Boolean includeExtendedProperties) {
        this.includeExtendedProperties = includeExtendedProperties;
        return this;
    }
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
    }

}

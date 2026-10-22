// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetColumnRequest extends TeaModel {
    /**
     * <p>The ID. You can refer to the response of the ListColumns operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The format is <code>${EntityType}:${Instance ID or URL-encoded JDBC URL}:${Data catalog identifier}:${Database name}:${Schema name}:${Table name}:${Column name}</code>. Use an empty string as a placeholder for non-existent levels.</p>
     * <blockquote>
     * <p>For MaxCompute and DLF types, use an empty string as a placeholder for the instance ID. For MaxCompute, the database name is the MaxCompute project name. If the three-level model is enabled for the project, you must provide the schema name. Otherwise, use an empty string as a placeholder for the schema name.</p>
     * </blockquote>
     * <blockquote>
     * <p>For StarRocks, the data catalog identifier is the catalog name. For DLF, the data catalog identifier is the catalog ID. Other types do not support the catalog level, so you can use an empty string as a placeholder.</p>
     * </blockquote>
     * <p>The following are the ID formats for common types:</p>
     * <p><code>maxcompute-column:::project_name:[schema_name]:table_name:column_name</code></p>
     * <p><code>dlf-column::catalog_id:database_name::table_name:column_name</code></p>
     * <p><code>hms-column:instance_id::database_name::table_name:column_name</code></p>
     * <p><code>holo-column:instance_id::database_name:schema_name:table_name:column_name</code></p>
     * <p><code>mysql-column:(instance_id|encoded_jdbc_url)::database_name::table_name:column_name</code></p>
     * <blockquote>
     * <p>Others<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For MaxCompute, this is required only if the three-level model is enabled for the project. Otherwise, use an empty string as a placeholder.<br><code>table_name</code>: The table name.<br><code>column_name</code>: The column name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:::project_name:[schema_name]:table_name:column_name</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetColumnRequest self = new GetColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetColumnRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

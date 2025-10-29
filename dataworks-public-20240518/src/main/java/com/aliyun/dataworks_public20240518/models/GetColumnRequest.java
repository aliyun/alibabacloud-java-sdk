// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetColumnRequest extends TeaModel {
    /**
     * <p>The ID. You can refer to the response of the ListColumns operation and the <a href="https://help.aliyun.com/document_detail/2880092.html">description of concepts related to metadata entities.</a></p>
     * <p>The format: <code>${EntityType}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}:${Table name}:${Column name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
     * <blockquote>
     * <p> For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID. For MaxCompute, the database name refers to the MaxCompute project name. If the project has schema enabled, you must specify the schema name. Otherwise, use an empty string as the placeholder for the schema name.</p>
     * </blockquote>
     * <blockquote>
     * <p> The catalog identifier of the StarRocks is the catalog name, and the catalog identifier of the DLF type is the catalog ID. Other types do not support catalog levels. Use empty strings as placeholders.</p>
     * </blockquote>
     * <p>Examples of common ID formats</p>
     * <p><code>maxcompute-column:::project_name:[schema_name]:table_name:column_name</code></p>
     * <p><code>dlf-column::catalog_id:database_name::table_name:column_name</code></p>
     * <p><code>hms-column:instance_id::database_name::table_name:column_name</code></p>
     * <p><code>holo-column:instance_id::database_name:schema_name:table_name:column_name</code></p>
     * <p><code>mysql-column:(instance_id|encoded_jdbc_url)::database_name::table_name:column_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of the instance, which is required when the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, which is required when the data source is registered via a connection string.\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>project_name</code>: The MaxCompute project name.\
     * <code>database_name</code>: The database name.\
     * <code>schema_name</code>: The schema name. For the MaxCompute type, this is required only if the project has enabled schema; otherwise, use an empty string as a placeholder.\
     * <code>table_name</code>: The table name.\
     * <code>column_name</code>: The field name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:11075xxxx::test_project:test_schema:test_table:test_column</p>
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

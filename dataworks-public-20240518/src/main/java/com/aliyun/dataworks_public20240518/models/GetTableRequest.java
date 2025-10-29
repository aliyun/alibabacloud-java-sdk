// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
    /**
     * <p>The ID. You can refer to the response of the ListTables operation and the <a href="https://help.aliyun.com/document_detail/2880092.html">concepts related to metadata entities.</a></p>
     * <p>The format: <code>${EntityType}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Table name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
     * <blockquote>
     * <p> For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID.</p>
     * </blockquote>
     * <blockquote>
     * <p> The catalog identifier of the StarRocks is the catalog name, and the catalog identifier of the DLF type is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
     * </blockquote>
     * <blockquote>
     * <p> For MaxCompute, the database name refers to the MaxCompute project name. If the project has schema enabled, you must specify the schema name. Otherwise, use an empty string as the placeholder for the schema name.</p>
     * </blockquote>
     * <p>Examples of common ID formats</p>
     * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
     * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
     * <p><code>hms-table:instance_id::database_name::table_name</code></p>
     * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
     * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, which is required when the data source is registered via a connection string.\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>project_name</code>: The MaxCompute project name.\
     * <code>database_name</code>: The database name.\
     * <code>schema_name</code>: The schema name. For the MaxCompute type, this is required only if the project has enabled schema. Otherwise, use an empty string as a placeholder.\
     * <code>table_name</code>: The table name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:123456XXX::test_project::test_tbl
     * dlf-table:123456XXX:test_catalog:test_db::test_tbl
     * hms-table:c-abc123xxx::test_db::test_tbl
     * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to include metadata. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeBusinessMetadata")
    public Boolean includeBusinessMetadata;

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

}

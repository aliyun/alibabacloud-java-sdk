// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
    /**
     * <p>The table ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}:${Table name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
     * <blockquote>
     * <p> For MaxCompute and DLF data sources, specify an empty string at the Instance ID level.</p>
     * </blockquote>
     * <blockquote>
     * <p> For StarRocks data sources, specify a catalog name at the Catalog identifier level. For DLF data sources, specify a catalog ID at the Catalog identifier level. Other types of data sources do not support the Catalog identifier level. You can specify an empty string as a placeholder.</p>
     * </blockquote>
     * <blockquote>
     * <p> For MaxCompute data sources, specify a MaxCompute project name at the Database name level. If the three-layer model is enabled for your MaxCompute project, you must specify a schema name at the Schema name level. Otherwise, you can specify an empty string as a placeholder.</p>
     * </blockquote>
     * <p>You can configure this parameter in one of the following formats based on your data source type:</p>
     * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
     * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
     * <p><code>hms-table:instance_id::database_name::table_name</code></p>
     * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
     * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.\
     * <code>catalog_id</code>: the ID of a DLF catalog.\
     * <code>project_name</code>: the name of a MaxCompute project.\
     * <code>database_name</code>: the name of a database.\
     * <code>schema_name</code>: the name of a schema. For a MaxCompute table, if the three-layer model is enabled for the MaxCompute project to which the table belongs, you must configure this parameter. Otherwise, you can specify an empty string for schema_name as a placeholder.\
     * <code>table_name</code>: the name of a table.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>Database entity ID. You can refer to the response of the ListDatabases operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The format: <code>${EntityType}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
     * <blockquote>
     * <p> For StarRocks, the catalog identifier is the catalog name. For DLF, the catalog identifier is the catalog ID. For other types, the catalog-level hierarchy is not supported, and an empty string can be used as a placeholder.</p>
     * </blockquote>
     * <p>Examples of common ID formats</p>
     * <ul>
     * <li><code>dlf-database::catalog_id:database_name</code></li>
     * <li><code>holo-database:instance_id::database_name</code></li>
     * <li><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><code>catalog_id</code>: The ID of the DLF catalog.</p>
     * </li>
     * <li><p><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.</p>
     * </li>
     * <li><p><code>encoded_jdbc_url</code>: The encoded JDBC connection string, which is required when the data source is registered in connection-string mode.</p>
     * </li>
     * <li><p><code>database_name</code>: The database name.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql-database:rm-abc123xxx::test_db</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseRequest self = new GetDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>Database entity ID. You can refer to the response of the ListDatabases operation and <a href="https://help.aliyun.com/document_detail/2880092.html">the description of metadata entity concepts.</a></p>
     * <p>The format is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog identifier}:${Database name}</code>. Use empty strings as placeholders for non-existent levels.</p>
     * <blockquote>
     * <p> For StarRocks, the catalog identifier is the catalog name. For DLF, the catalog identifier is the catalog ID. For other types, catalog hierarchy is not supported, and an empty string can be used as a placeholder.</p>
     * </blockquote>
     * <p>Examples of common ID formats</p>
     * <p><code>dlf-database::catalog_id:database_name</code></p>
     * <p><code>holo-database:instance_id::database_name</code></p>
     * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * <blockquote>
     * <p> Parameter descriptions\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>instance_id</code>: The instance ID, required for a data source registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The JDBC connection string that has been URL encoded. This parameter is required for the data source registered via a connection string.\
     * <code>database_name</code>: The database name.</p>
     * </blockquote>
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

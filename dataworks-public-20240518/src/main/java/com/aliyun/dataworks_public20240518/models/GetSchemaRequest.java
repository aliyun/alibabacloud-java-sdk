// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSchemaRequest extends TeaModel {
    /**
     * <p>The ID. You can refer to the ListSchemas operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The format is <code>${EntityType}:${Instance ID or escaped URL}:${Catalog ID}:${Database name}:${Schema name}&lt;/code&gt;</code>. Use empty strings as placeholders for missing levels.</p>
     * <blockquote>
     * <p> For the MaxCompute type, use an empty string as the placeholder for the instance ID level. The database name is the MaxCompute project name, and the project must have the three-level model enabled.</p>
     * </blockquote>
     * <p>Examples:</p>
     * <p><code>maxcompute-schema:::project_name:schema_name</code> (The three-level model is enabled for the MaxCompute project.)</p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The Hologres instance ID\
     * . <code>database_name</code>: The database name\
     * . <code>database_name</code>: The MaxCompute project name\
     * . <code>schema_name</code>: The schema name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project:default
     * holo-schema:h-abc123xxx::test_db:test_schema</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaRequest self = new GetSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

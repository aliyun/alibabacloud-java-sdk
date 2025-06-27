// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSchemaRequest extends TeaModel {
    /**
     * <p>The schema ID. You can call the ListSchemas operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
     * <blockquote>
     * <p> For MaxCompute tables, specify an empty string at the Instance ID level and a MaxCompute project name at the Database name level. Make sure that the three-layer model is enabled for the MaxCompute project.</p>
     * </blockquote>
     * <p>You can configure this parameter in one of the following formats based on your data source type:</p>
     * <p><code>maxcompute-schema:::project_name:schema_name</code> (Three-layer model is enabled for the MaxCompute project.)</p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of a Hologres instance\
     * <code>database_name</code>: the name of a database\
     * <code>project_name</code>: the name of a MaxCompute project\
     * <code>schema_name</code>: the name of a schema</p>
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

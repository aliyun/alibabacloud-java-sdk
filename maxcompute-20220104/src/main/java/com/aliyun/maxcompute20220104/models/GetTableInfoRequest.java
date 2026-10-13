// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTableInfoRequest extends TeaModel {
    /**
     * <p>The name of the schema to which the table or view to be queried belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("schemaName")
    public String schemaName;

    /**
     * <p>The type of the table or view to be queried. Valid values:</p>
     * <ul>
     * <li><strong>internal</strong>: Internal table.</li>
     * <li><strong>external</strong>: External table.</li>
     * <li><strong>view</strong>: View.</li>
     * <li><strong>materializedView</strong>: &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/materialized-view-operations">Materialized view</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">Materialized view</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internal</p>
     */
    @NameInMap("type")
    public String type;

    public static GetTableInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableInfoRequest self = new GetTableInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTableInfoRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GetTableInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

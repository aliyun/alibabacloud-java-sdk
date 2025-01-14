// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-schema-090134f1ebff****</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static GetApprovalSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalSchemaRequest self = new GetApprovalSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetApprovalSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}

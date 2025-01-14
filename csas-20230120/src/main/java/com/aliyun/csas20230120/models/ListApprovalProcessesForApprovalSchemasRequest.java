// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesForApprovalSchemasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaIds")
    public java.util.List<String> schemaIds;

    public static ListApprovalProcessesForApprovalSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalProcessesForApprovalSchemasRequest self = new ListApprovalProcessesForApprovalSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalProcessesForApprovalSchemasRequest setSchemaIds(java.util.List<String> schemaIds) {
        this.schemaIds = schemaIds;
        return this;
    }
    public java.util.List<String> getSchemaIds() {
        return this.schemaIds;
    }

}

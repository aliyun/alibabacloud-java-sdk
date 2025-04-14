// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateLineageRelationshipResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>110xxxx:custom-table.xxxxx:maxcompute-table.project.test_big_lineage_080901:custom-sqlxx.00001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateLineageRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLineageRelationshipResponseBody self = new CreateLineageRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLineageRelationshipResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLineageRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLineageRelationshipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSchemaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A89B5D9D-74EA-XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schema")
    public Schema schema;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaResponseBody self = new GetSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSchemaResponseBody setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

    public GetSchemaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

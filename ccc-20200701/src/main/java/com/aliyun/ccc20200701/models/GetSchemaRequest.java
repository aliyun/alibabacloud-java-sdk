// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0eb2742-f37e-4c67-82d4-25c651c1xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static GetSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaRequest self = new GetSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSchemaRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}

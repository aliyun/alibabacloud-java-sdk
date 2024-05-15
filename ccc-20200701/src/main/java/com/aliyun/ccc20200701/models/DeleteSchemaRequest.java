// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static DeleteSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaRequest self = new DeleteSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSchemaRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}

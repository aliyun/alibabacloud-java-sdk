// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>0630E5DF-CEB0-445B-8626-D5C7481181C3</p>
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

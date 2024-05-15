// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateSchemaPropertyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Property")
    public String propertyShrink;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static UpdateSchemaPropertyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaPropertyShrinkRequest self = new UpdateSchemaPropertyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaPropertyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSchemaPropertyShrinkRequest setPropertyShrink(String propertyShrink) {
        this.propertyShrink = propertyShrink;
        return this;
    }
    public String getPropertyShrink() {
        return this.propertyShrink;
    }

    public UpdateSchemaPropertyShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSchemaPropertyShrinkRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}

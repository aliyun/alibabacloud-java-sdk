// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSchemaShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>schema id</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0eb2742-f37e-4c67-82d4-25c651c1c450</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSchemaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaShrinkRequest self = new CreateSchemaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemaShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchemaShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateSchemaShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchemaShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public CreateSchemaShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaEntityDefResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the created entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-biz_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A04C673-BEFA-5803-94E5-89E2D9F8C567</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateMetaEntityDefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaEntityDefResponseBody self = new CreateMetaEntityDefResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetaEntityDefResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateMetaEntityDefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMetaEntityDefResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

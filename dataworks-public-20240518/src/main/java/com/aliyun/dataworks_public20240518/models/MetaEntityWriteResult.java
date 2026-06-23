// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntityWriteResult extends TeaModel {
    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-demo</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The error message if the operation fails for the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-demo:entity_01</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>entity_01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the operation succeeded for the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MetaEntityWriteResult build(java.util.Map<String, ?> map) throws Exception {
        MetaEntityWriteResult self = new MetaEntityWriteResult();
        return TeaModel.build(map, self);
    }

    public MetaEntityWriteResult setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public MetaEntityWriteResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MetaEntityWriteResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MetaEntityWriteResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetaEntityWriteResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

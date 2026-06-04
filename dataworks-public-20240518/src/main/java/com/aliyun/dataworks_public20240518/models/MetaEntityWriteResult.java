// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntityWriteResult extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

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

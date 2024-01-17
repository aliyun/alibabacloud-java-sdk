// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateUserWhiteListRequest extends TeaModel {
    @NameInMap("AoneId")
    public String aoneId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("LimitCount")
    public Integer limitCount;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Value")
    public String value;

    public static CreateUserWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWhiteListRequest self = new CreateUserWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserWhiteListRequest setAoneId(String aoneId) {
        this.aoneId = aoneId;
        return this;
    }
    public String getAoneId() {
        return this.aoneId;
    }

    public CreateUserWhiteListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserWhiteListRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateUserWhiteListRequest setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
        return this;
    }
    public Integer getLimitCount() {
        return this.limitCount;
    }

    public CreateUserWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateUserWhiteListRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public CreateUserWhiteListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

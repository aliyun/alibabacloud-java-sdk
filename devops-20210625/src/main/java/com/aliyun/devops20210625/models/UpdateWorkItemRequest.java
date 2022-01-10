// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkItemRequest extends TeaModel {
    // 工作项id
    @NameInMap("identifier")
    public String identifier;

    // 更新的字段名
    @NameInMap("propertyKey")
    public String propertyKey;

    // 更新后的值
    @NameInMap("propertyValue")
    public String propertyValue;

    public static UpdateWorkItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemRequest self = new UpdateWorkItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateWorkItemRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public UpdateWorkItemRequest setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    public String getPropertyValue() {
        return this.propertyValue;
    }

}

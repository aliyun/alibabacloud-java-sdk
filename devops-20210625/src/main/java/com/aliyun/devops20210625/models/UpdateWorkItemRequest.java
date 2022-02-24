// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkItemRequest extends TeaModel {
    // 更新字段的类型，标题：subject/自定义字段：customField/状态：status/描述：document/基本字段：basic(包括负责人、迭代、参与人等)
    @NameInMap("fieldType")
    public String fieldType;

    // 工作项唯一标识id
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

    public UpdateWorkItemRequest setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTriggerRequest extends TeaModel {
    // 应用所属命名空间。
    @NameInMap("Namespace")
    public String namespace;

    // 应用类型。
    @NameInMap("Type")
    public String type;

    // 应用名称。
    @NameInMap("Name")
    public String name;

    // 触发器行为。
    @NameInMap("action")
    public String action;

    public static DescribeTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTriggerRequest self = new DescribeTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTriggerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTriggerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}

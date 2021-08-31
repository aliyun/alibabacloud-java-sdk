// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateVariableGroupRequest extends TeaModel {
    // 变量组名称
    @NameInMap("name")
    public String name;

    // 变量组描述
    @NameInMap("description")
    public String description;

    // 变量信息json字符串 isEncrypted 是否加密 name 变量名称 value 变量值
    @NameInMap("variables")
    public String variables;

    public static UpdateVariableGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableGroupRequest self = new UpdateVariableGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVariableGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVariableGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVariableGroupRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}

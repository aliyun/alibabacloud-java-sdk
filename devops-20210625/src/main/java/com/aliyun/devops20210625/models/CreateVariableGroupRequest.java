// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateVariableGroupRequest extends TeaModel {
    // 变量组描述
    @NameInMap("description")
    public String description;

    // 变量组名称
    @NameInMap("name")
    public String name;

    // 变量信息json字符串 isEncrypted 是否加密 name 变量名称 value 变量值
    @NameInMap("variables")
    public String variables;

    public static CreateVariableGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableGroupRequest self = new CreateVariableGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateVariableGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVariableGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVariableGroupRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}

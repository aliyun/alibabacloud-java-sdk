// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateVariableGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>变量组</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>变量组</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;isEncrypted&quot;:true,&quot;name&quot;:&quot;name1&quot;,&quot;value&quot;:&quot;vaue1&quot;}]</p>
     */
    @NameInMap("variables")
    public String variables;

    public static UpdateVariableGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableGroupRequest self = new UpdateVariableGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVariableGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVariableGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVariableGroupRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}

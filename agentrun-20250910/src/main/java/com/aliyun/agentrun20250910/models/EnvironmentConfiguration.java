// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class EnvironmentConfiguration extends TeaModel {
    /**
     * <p>环境变量条目列表，每个条目包含 name、value 和可选 description</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("variables")
    public java.util.List<EnvironmentVariable> variables;

    public static EnvironmentConfiguration build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentConfiguration self = new EnvironmentConfiguration();
        return TeaModel.build(map, self);
    }

    public EnvironmentConfiguration setVariables(java.util.List<EnvironmentVariable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<EnvironmentVariable> getVariables() {
        return this.variables;
    }

}

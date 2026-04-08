// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class EnvironmentVariable extends TeaModel {
    /**
     * <p>环境变量的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>A configuration key</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>环境变量的名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MY_KEY</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>环境变量的值</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-value</p>
     */
    @NameInMap("value")
    public String value;

    public static EnvironmentVariable build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentVariable self = new EnvironmentVariable();
        return TeaModel.build(map, self);
    }

    public EnvironmentVariable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EnvironmentVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvironmentVariable setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

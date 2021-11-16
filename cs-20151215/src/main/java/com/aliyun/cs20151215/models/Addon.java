// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Addon extends TeaModel {
    // 插件配置参数。
    @NameInMap("config")
    public String config;

    // 是否禁止默认安装。true | false。
    @NameInMap("disabled")
    public Boolean disabled;

    // 插件名称。
    @NameInMap("name")
    public String name;

    public static Addon build(java.util.Map<String, ?> map) throws Exception {
        Addon self = new Addon();
        return TeaModel.build(map, self);
    }

    public Addon setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public Addon setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public Addon setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

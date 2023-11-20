// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Addon extends TeaModel {
    @NameInMap("config")
    public String config;

    @NameInMap("disabled")
    public Boolean disabled;

    @NameInMap("name")
    public String name;

    @NameInMap("version")
    public String version;

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

    public Addon setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
